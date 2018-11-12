package com.github.jops425.dto;

import java.time.LocalDate;

/**
 * @author João
 *
 */
public class EnderecoDTO {

    private IndividuoDTO id;

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
    public IndividuoDTO getId() {
        return id;
    }

    /**
     * Setter para id.
     *
     * @param id Variável id a ser editada.
     */
    public void setId(IndividuoDTO id) {
        this.id = id;
    }

    /**
     * Getter para ordem.
     *
     * @return Variavel ordem.
     */
    public String getOrdem() {
        return ordem;
    }

    /**
     * Setter para ordem.
     *
     * @param ordem Variável ordem a ser editada.
     */
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    /**
     * Getter para linha.
     *
     * @return Variavel linha.
     */
    public String getLinha() {
        return linha;
    }

    /**
     * Setter para linha.
     *
     * @param linha Variável linha a ser editada.
     */
    public void setLinha(String linha) {
        this.linha = linha;
    }

    /**
     * Getter para bairro.
     *
     * @return Variavel bairro.
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Setter para bairro.
     *
     * @param bairro Variável bairro a ser editada.
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Getter para distrito.
     *
     * @return Variavel distrito.
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Setter para distrito.
     *
     * @param distrito Variável distrito a ser editada.
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Getter para codigoMunicipio.
     *
     * @return Variavel codigoMunicipio.
     */
    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    /**
     * Setter para codigoMunicipio.
     *
     * @param codigoMunicipio Variável codigoMunicipio a ser editada.
     */
    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    /**
     * Getter para cep.
     *
     * @return Variavel cep.
     */
    public String getCep() {
        return cep;
    }

    /**
     * Setter para cep.
     *
     * @param cep Variável cep a ser editada.
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Getter para caixaPostal.
     *
     * @return Variavel caixaPostal.
     */
    public String getCaixaPostal() {
        return caixaPostal;
    }

    /**
     * Setter para caixaPostal.
     *
     * @param caixaPostal Variável caixaPostal a ser editada.
     */
    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    /**
     * Getter para pais.
     *
     * @return Variavel pais.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Setter para pais.
     *
     * @param pais Variável pais a ser editada.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Getter para tipo.
     *
     * @return Variavel tipo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Setter para tipo.
     *
     * @param tipo Variável tipo a ser editada.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Getter para data.
     *
     * @return Variavel data.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Setter para data.
     *
     * @param data Variável data a ser editada.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Getter para acuracia.
     *
     * @return Variavel acuracia.
     */
    public String getAcuracia() {
        return acuracia;
    }

    /**
     * Setter para acuracia.
     *
     * @param acuracia Variável acuracia a ser editada.
     */
    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }


}
