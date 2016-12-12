package model;

import java.util.List;

public class GrupoMetrica {

    private String nome;
    private String tabela;
    private List<Metrica> metricas;
    private List<FactLink> factLinks;

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

    /**
     * @return the factLinks
     */
    public List<FactLink> getFactLinks() {
        return factLinks;
    }

    /**
     * @param factLinks the factLinks to set
     */
    public void setFactLinks(List<FactLink> factLinks) {
        this.factLinks = factLinks;
    }
    
    
}
