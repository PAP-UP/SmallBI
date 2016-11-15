package business;

import java.util.ArrayList;
import java.util.List;
import model.Dimensao;
import model.Metrica;
import model.Schema;

public class GerarSchema {
    
    //private static String schema = new String();
    
    public static String createSchema(Schema schema){
        
        String schemaXml = new String();
        
        schemaXml += initializeSchema(schema.getNome());
        schemaXml += setPhysicalSchema(schema.getTabela(), schema.getChaveTabela());
        schemaXml += setCubeName(schema.getNome());
        schemaXml += setSchemaDimensions(schema.getDimensoes());
        schemaXml += setSchemaMeasures(schema.getMetricas(), schema.getTabela(), schema.getDimensoes());
        return schemaXml;
    }
    
    private static String initializeSchema(String nomeSchema){
        return "<?xml version='1.0'?><Schema name='" + nomeSchema + "' metamodelVersion='4.0'>";
    }
    
    private static String setPhysicalSchema(String nomeTabela, String primaryKey){
        return "<PhysicalSchema><Table name='" + nomeTabela + "'><Key><Column name='" +
                primaryKey + "'/></Key></Table></PhysicalSchema>";
    }
    
    private static String setCubeName(String cubeName){
        return "<Cube name='" + cubeName + "'>";
    }

    public static String setSchemaDimensions(List<Dimensao> dimensoes){   
  
        String schema = new String();
        for(Dimensao dim : dimensoes){
            schema += "<Dimensions><Dimension name='" + dim.getNome() + "' table='" + dim.getTabela() +
                    "' key='" + dim.getKey() + "'><Attributes>";

            for(String atributo : dim.getAtributos()){
                schema += "<Attribute name='" + atributo + "' keyColumn='" + atributo + "' hasHierarchy='true'/>";
            }
            schema += "</Attributes></Dimension></Dimensions>";            
        }
        return schema;
    }

    public static String setSchemaMeasures(List<Metrica> metricas, String nomeTabela, List<Dimensao> dimensoes){
        
        String schema = new String();
        List<String> factLinks = new ArrayList<>();        
        schema += "<MeasureGroups><MeasureGroup name='Métricas' table='" + nomeTabela + "'><Measures>";
        
        for(Metrica m : metricas){
            schema += "<Measure name='" + m.getNome() + "' column='" + m.getColuna() + "' aggregator='" +
                    m.getAgregador() + "' formatString='" + m.getFormato() + "' visible='true'/>";
            
            for(Dimensao d : dimensoes){
               for(String atributo : d.getAtributos()){
                    if(atributo.equals(m.getColuna())){
                        factLinks.add("<FactLink dimension='" + d.getNome() + "' foreignKeyColumn='" +
                                m.getColuna() + "'/>");
                    }
                }
            }
        } 
        
        schema += "</Measures><DimensionLinks>";
        
        for(String factLink : factLinks){
            schema += factLink;
        }
        
        schema += "</DimensionLinks></MeasureGroup></MeasureGroups></Cube></Schema>";
        return schema;
    }
}
