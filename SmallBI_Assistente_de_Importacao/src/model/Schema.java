package model;

import java.util.List;

public class Schema {
    private String nome;
    private List<TabelaImportada> tabelas;
    private String nomeCubo;
    private List<Dimensao> dimensoes;
    private List<GrupoMetrica> grupoMetrica;
    private List<Link> links;
    private String tabelaFato;
    
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
     * @return the nomeCubo
     */
    public String getNomeCubo() {
        return nomeCubo;
    }

    /**
     * @param nomeCubo the nomeCubo to set
     */
    public void setNomeCubo(String nomeCubo) {
        this.nomeCubo = nomeCubo;
    }

    /**
     * @return the dimensoes
     */
    public List<Dimensao> getDimensoes() {
        return dimensoes;
    }

    /**
     * @param dimensoes the dimensoes to set
     */
    public void setDimensoes(List<Dimensao> dimensoes) {
        this.dimensoes = dimensoes;
    }

    /**
     * @return the tabelasFato
     */
    public List<TabelaImportada> getTabelasFato() {
        return tabelas;
    }

    /**
     * @param tabelasFato the tabelasFato to set
     */
    public void setTabelasFato(List<TabelaImportada> tabelasFato) {
        this.tabelas = tabelasFato;
    }

    /**
     * @return the grupoMetrica
     */
    public List<GrupoMetrica> getGrupoMetrica() {
        return grupoMetrica;
    }

    /**
     * @param grupoMetrica the grupoMetrica to set
     */
    public void setGrupoMetrica(List<GrupoMetrica> grupoMetrica) {
        this.grupoMetrica = grupoMetrica;
    }

    /**
     * @return the links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * @param links the links to set
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     * @return the tabelaFato
     */
    public String getTabelaFato() {
        return tabelaFato;
    }

    /**
     * @param tabelaFato the tabelaFato to set
     */
    public void setTabelaFato(String tabelaFato) {
        this.tabelaFato = tabelaFato;
    }
    
}
