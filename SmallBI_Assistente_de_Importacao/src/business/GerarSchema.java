package business;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import model.Dimensao;
import model.GrupoMetrica;
import model.Link;
import model.Metrica;
import model.Schema;
import model.TabelaImportada;
import view.FormLogin;

public class GerarSchema {
    
    private static String schemaXml = new String();
    private static String nomeSchema = new String();
    
    public static String getSchemaXml(){
        return schemaXml;
    }
    
    public static String getNomeSchema(){
        return nomeSchema;
    }
    
    public String createSchema(Schema schema){
        schemaXml = new String();
        schemaXml += initializeSchema(schema.getNome());
        schemaXml += setPhysicalSchema(schema.getTabelasFato(), schema.getLinks());
        schemaXml += setCubeName(schema.getNome());
        schemaXml += setSchemaDimensions(schema.getDimensoes());
        schemaXml += setSchemaMeasures(schema.getGrupoMetrica(), schema.getDimensoes());
        schemaXml += setRoles(FormLogin.idCliente);
        
        nomeSchema = schema.getNome();
        //salvarSchema(schema.getNome(), schemaXml);
        
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
    
    private String setPhysicalSchema(List<TabelaImportada> tabelas, List<Link>links){
        String schema = "<PhysicalSchema>";
                
        for(TabelaImportada t : tabelas){
            schema += "<Table name='" + formatarString(t.getNomeTabela()) + "'><Key><Column name='" +
                    formatarString(t.getPrimaryKey()) + "'/></Key></Table>";
        }
        
        for(Link l : links){
            schema += "<Link source='" + l.getSource() + "' target='" + l.getTarget() + "'>" +
                    "<ForeignKey><Column name='" + l.getForeignKey() + "'/></ForeignKey></Link>";
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
                            + m.getFormato() + "' visible='true'/>";    
            }
            
            schema += "</Measures><DimensionLinks>";
  
            for(Dimensao d : dimensoes){
                schema += "<FactLink dimension='" + d.getNome() + "' foreignKeyColumn='" +
                        d.getKey() + "'/>";
            }
//            for(FactLink f : gm.getFactLinks()){
//                schema += "<FactLink dimension='" + formatarString(f.getDimension()) + "' foreignKeyColumn='" +
//                        formatarString(f.getForeignKey()) + "'/>";
//            }
            
            schema += "</DimensionLinks></MeasureGroup>";   
        }
        schema += "</MeasureGroups></Cube>";
        
        
        
        //schema += "</Schema>";//Quebrar no </Schema> para adicionar o ROLE na API;
        return schema;
    }
    
    private String setRoles(int idCliente){
        String schema;
        schema = "<Role name='id_" + idCliente + "'><SchemaGrant access='all'/></Role></Schema>";
        return schema;
    }
    
    public void salvarSchema(){
        File file = new File(System.getProperty("user.home") + 
                System.getProperty("file.separator") +
                "files-to-test-saiku" +
                System.getProperty("file.separator") +
                "cubes-scripts-generated"+
                System.getProperty("file.separator") + 
                formatarString(nomeSchema) + ".xml");    
        //File file = new File("/home/deynesonborba/files-to-test-saiku/cubes-scripts-generated/" + formatarString(nomeSchema) + ".xml");
        
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
