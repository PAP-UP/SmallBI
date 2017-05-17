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
        //schemaXml += setRoles(FormLogin.idCliente);
        
        nomeSchema = schema.getNome();
        //salvarSchema(schema.getNome(), schemaXml);
        
        return schemaXml;
    }
    
    private String initializeSchema(String nomeSchema){
        return "<?xml version='1.0'?><Schema name='" + Util.formatarString(nomeSchema) + "' metamodelVersion='4.0'>";
    }
    
    private String setPhysicalSchema(List<TabelaImportada> tabelas, List<Link>links){
        String schema = "<PhysicalSchema>";
                
        for(TabelaImportada t : tabelas){
            schema += "<Table name='" + Util.formatarString(t.getNomeTabela()) + "'><Key><Column name='" +
                    Util.formatarString(t.getPrimaryKey()) + "'/></Key></Table>";
        }
        
//        for(Link l : links){
//            schema += "<Link source='" + l.getSource() + "' target='" + l.getTarget() + "'>" +
//                    "<ForeignKey><Column name='" + l.getForeignKey() + "'/></ForeignKey></Link>";
//        }
        
        schema += "</PhysicalSchema>";
        return schema;
    }
    
    private String setCubeName(String cubeName){
        return "<Cube name='" + Util.formatarString(cubeName) + "'>";
    }

    public String setSchemaDimensions(List<Dimensao> dimensoes){   
  
        String schema = "<Dimensions>";
        for(Dimensao dim : dimensoes){
            schema += "<Dimension name='" + Util.formatarString(dim.getNome()) + "' table='" + Util.formatarString(dim.getTabela()) +
                    "' key='" + Util.formatarString(dim.getKey()) + "'><Attributes>";

            for(String atributo : dim.getAtributos()){
                schema += "<Attribute name='" + Util.formatarString(atributo) + "' keyColumn='" +
                        Util.formatarString(atributo) + "' hasHierarchy='true'/>";
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
            schema += "<MeasureGroup name='" + Util.formatarString(gm.getNome()) +
                    "' table='" + Util.formatarString(gm.getTabela()) + "'><Measures>";
            
            for(Metrica m : gm.getMetricas()){
                schema += "<Measure name='" + Util.formatarString(m.getNome()) + 
                        "' column='" + Util.formatarString(m.getColuna()) + 
                            "' aggregator='" + Util.formatarString(getAggregator(m.getAgregador())) + "' formatString='"
                                + getFormat(m.getFormato()) + "' visible='true'/>";    
            }
            
            schema += "</Measures><DimensionLinks>";
  
            for(Dimensao d : dimensoes){
                schema += "<ForeignKeyLink dimension='" + d.getNome() + "' foreignKeyColumn='" +
                        d.getLinkComFato() + "'/>";
            }
//            for(FactLink f : gm.getFactLinks()){
//                schema += "<FactLink dimension='" + formatarString(f.getDimension()) + "' foreignKeyColumn='" +
//                        formatarString(f.getForeignKey()) + "'/>";
//            }
            
            schema += "</DimensionLinks></MeasureGroup>";   
        }
        schema += "</MeasureGroups></Cube>";
        
        
        
        schema += "</Schema>";//Quebrar no </Schema> para adicionar o ROLE na API;
        return schema;
    }
    
    private String setRoles(int idCliente){
        String schema;
        schema = "<Role name='No Access'><SchemaGrant access='none'/></Role>";
        schema += "<Role name='access_id_" + idCliente + "'><SchemaGrant access='all'/></Role></Schema>";
        return schema;
    }
    
    /**
     * Traduz agregador para o padrao mondrian
     * @param agregador
     * @return 
     */
    private String getAggregator(String agregador){
        switch(agregador){
            case "Contar":
                return "count";
            case "Somar":
                return "sum";
            case "Média":
                return "avg";
            case "Máximo":
                return "max";
        }
        return "";
    }
    
    /**
     * Traduz o formato para o padrao mondrian
     * @param formato
     * @return 
     */
    private String getFormat(String formato){
        switch(formato){
            case "Padrão":
                return "Standart";
            case "#,###.00":
                    return "#,###.00";
        }
        return "";
    }
    
    public void salvarSchema(){
        File file = new File(System.getProperty("user.home") + 
                System.getProperty("file.separator") +
                "files-to-test-saiku" +
                System.getProperty("file.separator") +
                "cubes-scripts-generated"+
                System.getProperty("file.separator") + 
                Util.formatarString(nomeSchema) + ".xml");    
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
