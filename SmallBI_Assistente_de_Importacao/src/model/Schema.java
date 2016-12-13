package model;

import java.util.List;

public class Schema {
    private String nome;
    private List<TabelaFato> tabelasFato;
    private String nomeCubo;
    private List<Dimensao> dimensoes;
    private List<GrupoMetrica> grupoMetrica;

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
    public List<TabelaFato> getTabelasFato() {
        return tabelasFato;
    }

    /**
     * @param tabelasFato the tabelasFato to set
     */
    public void setTabelasFato(List<TabelaFato> tabelasFato) {
        this.tabelasFato = tabelasFato;
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
    
}
