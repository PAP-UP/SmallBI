package model;

import java.util.List;

public class Dimensao {
    
    private String nome;
    private String tabela;
    private String key;
    private List<String> atributos;
    private String linkComFato;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the tabela
     */
    public String getTabela() {
        return tabela;
    }

    /**
     * @param tabela the tabela to set
     */
    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    /**
     * @return the atributos
     */
    public List<String> getAtributos() {
        return atributos;
    }

    /**
     * @param atributos the atributos to set
     */
    public void setAtributos(List<String> atributos) {
        this.atributos = atributos;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the linkComFato
     */
    public String getLinkComFato() {
        return linkComFato;
    }

    /**
     * @param linkComFato the linkComFato to set
     */
    public void setLinkComFato(String linkComFato) {
        this.linkComFato = linkComFato;
    }
    
    
}
