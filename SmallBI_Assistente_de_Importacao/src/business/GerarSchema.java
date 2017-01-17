package business;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Dimensao;
import model.FactLink;
import model.GrupoMetrica;
import model.Metrica;
import model.Schema;
import model.TabelaFato;

public class GerarSchema {
    
    public String createSchema(Schema schema){
        
        String schemaXml = new String();
        
        schemaXml += initializeSchema(schema.getNome());
        schemaXml += setPhysicalSchema(schema.getTabelasFato());
        schemaXml += setCubeName(schema.getNome());
        schemaXml += setSchemaDimensions(schema.getDimensoes());
        schemaXml += setSchemaMeasures(schema.getGrupoMetrica(), schema.getDimensoes());
        
        salvarSchema(schema.getNome(), schemaXml);
        
        return schemaXml;
    }
    
    private String formatarString(String str){
        String strFormatada = str.toLowerCase();
        strFormatada = strFormatada.replaceAll(" ", "_");
        return strFormatada;
    }
    
    private String initializeSchema(String nomeSchema){
        return "<?xml version='1.0'?><Schema name='" + formatarString(nomeSchema) + "' metamodelVersion='4.0'>";
    }
    
    private String setPhysicalSchema(List<TabelaFato> tabelas){
        String schema = "<PhysicalSchema>";
                
        for(TabelaFato t : tabelas){
            schema += "<Table name='" + formatarString(t.getNomeTabela()) + "'><Key><Column name='" +
                    formatarString(t.getPrimaryKey()) + "'/></Key></Table>";
        }
        schema += "</PhysicalSchema>";
        return schema;
    }
    
    private String setCubeName(String cubeName){
        return "<Cube name='" + formatarString(cubeName) + "'>";
    }

    public String setSchemaDimensions(List<Dimensao> dimensoes){   
  
        String schema = "<Dimensions>";
        for(Dimensao dim : dimensoes){
            schema += "<Dimension name='" + formatarString(dim.getNome()) + "' table='" + formatarString(dim.getTabela()) +
                    "' key='" + formatarString(dim.getKey()) + "'><Attributes>";

            for(String atributo : dim.getAtributos()){
                schema += "<Attribute name='" + formatarString(atributo) + "' keyColumn='" +
                        formatarString(atributo) + "' hasHierarchy='true'/>";
            }
            schema += "</Attributes></Dimension>";            
        }
        schema += "</Dimensions>";
        return schema;
    }

    public String setSchemaMeasures(List<GrupoMetrica> grupoMetricas, List<Dimensao> dimensoes){
        
//        List<FactLink> factLinks = new ArrayList<>();
        String schema;
        
        schema = "<MeasureGroups>";
        
        for(GrupoMetrica gm : grupoMetricas){
            schema += "<MeasureGroup name='" + formatarString(gm.getNome()) + "' table='" + formatarString(gm.getTabela())
                    + "'><Measures>";
            
            for(Metrica m : gm.getMetricas()){
                schema += "<Measure name='" + formatarString(m.getNome()) + "' column='" + formatarString(m.getColuna())
                        + "' aggregator='" + formatarString(m.getAgregador()) + "' formatString='"
                            + formatarString(m.getFormato()) + "' visible='true'/>";    
            }
            
            schema += "</Measures><DimensionLinks>";
            
            for(FactLink f : gm.getFactLinks()){
                schema += "<FactLink dimension='" + formatarString(f.getDimension()) + "' foreignKeyColumn='" +
                        formatarString(f.getForeignKey()) + "'/>";
            }
            
            schema += "</DimensionLinks></MeasureGroup>";   
        }
        schema += "</MeasureGroups></Cube></Schema>";
        return schema;
    }
    
    private void salvarSchema(String nomeSchema, String schemaXml){
            
        File file = new File("/home/deynesonborba/files-to-test-saiku/cubes-scripts-generated/" + formatarString(nomeSchema) + ".xml");
        
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(schemaXml);
            bw.flush();
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
