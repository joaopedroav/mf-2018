package com.github.jops425.dto.models;

/**
 * @author aluno
 *
 */
public final class Comunicacao {

    private Individuo id;

    private String meio;

    private String preferencia;

    private String detalhe;

    private String uso;

	/**
     * Getter para id.
     *
     * @return Variavel id.
     */
    public Individuo getId() {
        return id;
    }

    /**
     * Setter para id.
     *
     * @param id1 Variável id a ser editada.
     */
    public void setId(final Individuo id1) {
        this.id = id1;
    }

    /**
     * Getter para meio.
     *
     * @return Variavel meio.
     */
    public String getMeio() {
        return meio;
    }

    /**
     * Setter para meio.
     *
     * @param meio1 Variável meio a ser editada.
     */
    public void setMeio(final String meio1) {
        this.meio = meio1;
    }

    /**
     * Getter para preferencia.
     *
     * @return Variavel preferencia.
     */
    public String getPreferencia() {
        return preferencia;
    }

    /**
     * Setter para preferencia.
     *
     * @param preferencia1 Variável preferencia a ser editada.
     */
    public void setPreferencia(final String preferencia1) {
        this.preferencia = preferencia1;
    }

    /**
     * Getter para detalhe.
     *
     * @return Variavel detalhe.
     */
    public String getDetalhe() {
        return detalhe;
    }

    /**
     * Setter para detalhe.
     *
     * @param detalhe1 Variável detalhe a ser editada.
     */
    public void setDetalhe(final String detalhe1) {
        this.detalhe = detalhe1;
    }

    /**
     * Getter para uso.
     *
     * @return Variavel uso.
     */
    public String getUso() {
        return uso;
    }

    /**
     * Setter para uso.
     *
     * @param uso1 Variável uso a ser editada.
     */
    public void setUso(final String uso1) {
        this.uso = uso1;
    }


}
