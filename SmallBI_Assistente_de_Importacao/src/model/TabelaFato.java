package model;

import javax.swing.JTable;

public class TabelaFato {
    
    private String nomeTabela;
    private String scriptSql;
    private JTable jTable;
    private String primaryKey;
    

    /**
     * @return the scriptSql
     */
    public String getScriptSql() {
        return scriptSql;
    }

    /**
     * @param scriptSql the scriptSql to set
     */
    public void setScriptSql(String scriptSql) {
        this.scriptSql = scriptSql;
    }

    /**
     * @return the jTable
     */
    public JTable getjTable() {
        return jTable;
    }

    /**
     * @param jTable the jTable to set
     */
    public void setjTable(JTable jTable) {
        this.jTable = jTable;
    }

    /**
     * @return the primaryKey
     */
    public String getPrimaryKey() {
        return primaryKey;
    }

    /**
     * @param primaryKey the primaryKey to set
     */
    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    /**
     * @return the nomeTabela
     */
    public String getNomeTabela() {
        return nomeTabela;
    }

    /**
     * @param nomeTabela the nomeTabela to set
     */
    public void setNomeTabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }
    
    
}
