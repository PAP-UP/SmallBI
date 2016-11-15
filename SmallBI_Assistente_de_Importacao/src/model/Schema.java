package model;

import java.util.List;

public class Schema {
    private String nome;
    private String tabela;
    private String chaveTabela;
    private String nomeCubo;
    private List<Dimensao> dimensoes;
    private List<Metrica> metricas;

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
     * @return the chaveTabela
     */
    public String getChaveTabela() {
        return chaveTabela;
    }

    /**
     * @param chaveTabela the chaveTabela to set
     */
    public void setChaveTabela(String chaveTabela) {
        this.chaveTabela = chaveTabela;
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
     * @return the metricas
     */
    public List<Metrica> getMetricas() {
        return metricas;
    }

    /**
     * @param metricas the metricas to set
     */
    public void setMetricas(List<Metrica> metricas) {
        this.metricas = metricas;
    }
    
}
