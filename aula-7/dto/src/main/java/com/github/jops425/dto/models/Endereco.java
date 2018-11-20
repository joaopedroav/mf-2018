package com.github.jops425.dto.models;

import java.time.LocalDate;

/**
 * @author João
 *
 */
public final class Endereco {

    private Individuo id;

    private String ordem;

    private String linha;

    private String bairro;

    private String distrito;

    private int codigoMunicipio;

    private String cep;

    private String caixaPostal;

    private String pais;

    private String tipo;

    private LocalDate data;

    private String acuracia;

	/**
     * Getter para id.
     *
     * @return Variavel id.
     */
    public final Individuo getId() {
        return id;
    }

    /**
     * Setter para id.
     *
     * @param id1 Variável id1 a ser editada.
     */
    public final void setId(final Individuo id1) {
        this.id = id1;
    }

    /**
     * Getter para ordem.
     *
     * @return Variavel ordem.
     */
    public final String getOrdem() {
        return ordem;
    }

    /**
     * Setter para ordem.
     *
     * @param ordem1 Variável ordem a ser editada.
     */
    public final void setOrdem(final String ordem1) {
        this.ordem = ordem1;
    }

    /**
     * Getter para linha.
     *
     * @return Variavel linha.
     */
    public final String getLinha() {
        return linha;
    }

    /**
     * Setter para linha.
     *
     * @param linha1 Variável linha a ser editada.
     */
    public final void setLinha(final String linha1) {
        this.linha = linha1;
    }

    /**
     * Getter para bairro.
     *
     * @return Variavel bairro.
     */
    public final String getBairro() {
        return bairro;
    }

    /**
     * Setter para bairro.
     *
     * @param bairro1 Variável bairro a ser editada.
     */
    public final void setBairro(final String bairro1) {
        this.bairro = bairro1;
    }

    /**
     * Getter para distrito.
     *
     * @return Variavel distrito.
     */
    public final String getDistrito() {
        return distrito;
    }

    /**
     * Setter para distrito.
     *
     * @param distrito1 Variável distrito a ser editada.
     */
    public final void setDistrito(final String distrito1) {
        this.distrito = distrito1;
    }

    /**
     * Getter para codigoMunicipio.
     *
     * @return Variavel codigoMunicipio.
     */
    public final int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Setter para codigoMunicipio.
     *
     * @param codigoMunicipio1 Variável codigoMunicipio a ser editada.
     */
    public final void setCodigoMunicipio(final int codigoMunicipio1) {
        this.codigoMunicipio = codigoMunicipio1;
    }

    /**
     * Getter para cep.
     *
     * @return Variavel cep.
     */
    public final String getCep() {
        return cep;
    }

    /**
     * Setter para cep.
     *
     * @param cep1 Variável cep a ser editada.
     */
    public final void setCep(final String cep1) {
        this.cep = cep1;
    }

    /**
     * Getter para caixaPostal.
     *
     * @return Variavel caixaPostal.
     */
    public final String getCaixaPostal() {
        return caixaPostal;
    }

    /**
     * Setter para caixaPostal.
     *
     * @param caixaPostal1 Variável caixaPostal a ser editada.
     */
    public final void setCaixaPostal(final String caixaPostal1) {
        this.caixaPostal = caixaPostal1;
    }

    /**
     * Getter para pais.
     *
     * @return Variavel pais.
     */
    public final String getPais() {
        return pais;
    }

    /**
     * Setter para pais.
     *
     * @param pais1 Variável pais a ser editada.
     */
    public final void setPais(final String pais1) {
        this.pais = pais1;
    }

    /**
     * Getter para tipo.
     *
     * @return Variavel tipo.
     */
    public final String getTipo() {
        return tipo;
    }

    /**
     * Setter para tipo.
     *
     * @param tipo1 Variável tipo a ser editada.
     */
    public final void setTipo(final String tipo1) {
        this.tipo = tipo1;
    }

    /**
     * Getter para data.
     *
     * @return Variavel data.
     */
    public final LocalDate getData() {
        return data;
    }

    /**
     * Setter para data.
     *
     * @param data1 Variável data a ser editada.
     */
    public final void setData(final LocalDate data1) {
        this.data = data1;
    }

    /**
     * Getter para acuracia.
     *
     * @return Variavel acuracia.
     */
    public final String getAcuracia() {
        return acuracia;
    }

    /**
     * Setter para acuracia.
     *
     * @param acuracia1 Variável acuracia a ser editada.
     */
    public final void setAcuracia(final String acuracia1) {
        this.acuracia = acuracia1;
    }


}
