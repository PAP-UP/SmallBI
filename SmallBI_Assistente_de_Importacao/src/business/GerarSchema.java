package business;

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
        return schemaXml;
    }
    
    private String initializeSchema(String nomeSchema){
        return "<?xml version='1.0'?><Schema name='" + nomeSchema + "' metamodelVersion='4.0'>";
    }
    
    private String setPhysicalSchema(List<TabelaFato> tabelas){
        String schema = "<PhysicalSchema>";
                
        for(TabelaFato t : tabelas){
            schema += "<Table name='" + t.getNomeTabela() + "'><Key><Column name='" + t.getPrimaryKey() 
                + "'/></Key></Table>";
        }
        schema += "</PhysicalSchema>";
        return schema;
    }
    
    private String setCubeName(String cubeName){
        return "<Cube name='" + cubeName + "'>";
    }

    public String setSchemaDimensions(List<Dimensao> dimensoes){   
  
        String schema = "<Dimensions>";
        for(Dimensao dim : dimensoes){
            schema += "<Dimension name='" + dim.getNome() + "' table='" + dim.getTabela() +
                    "' key='" + dim.getKey() + "'><Attributes>";

            for(String atributo : dim.getAtributos()){
                schema += "<Attribute name='" + atributo + "' keyColumn='" + atributo + "' hasHierarchy='true'/>";
            }
            schema += "</Attributes></Dimension>";            
        }
        schema += "</Dimensions>";
        return schema;
    }

    public String setSchemaMeasures(List<GrupoMetrica> grupoMetricas, List<Dimensao> dimensoes){
        
        List<FactLink> factLinks = new ArrayList<>();
        String schema;
        
        schema = "<MeasureGroups>";
        
        for(GrupoMetrica gm : grupoMetricas){
            schema += "<MeasureGroup name='" + gm.getNome() + "' table='" + gm.getTabela() + "'><Measures>";
            
            for(Metrica m : gm.getMetricas()){
                schema += "<Measure name='" + m.getNome() + "' column='" + m.getColuna() + "' aggregator='" +
                    m.getAgregador() + "' formatString='" + m.getFormato() + "' visible='true'/>";    
            }
            
            schema += "</Measures><DimensionLinks>";
            
            for(FactLink f : gm.getFactLinks()){
                schema += "<FactLink dimension='" + f.getDimension() + "' foreignKeyColumn='" + f.getForeignKey() + "'/>";
            }
            
            schema += "</DimensionLinks></MeasureGroup>";   
        }
        schema += "</MeasureGroups></Cube></Schema>";
        return schema;
    }
}
