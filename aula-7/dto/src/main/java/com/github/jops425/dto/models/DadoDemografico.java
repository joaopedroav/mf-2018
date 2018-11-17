package com.github.jops425.dto.models;

import java.time.LocalDate;

/**
 * Classe Dado Demográfico.
 */
public class DadoDemografico {

    /**
     * Indivíduo.
     */
    private IndividuoDTO individuo;

    /**
     * Data de nascimento.
     */
    private LocalDate nascimento;

    /**
     * Nascimento acurácia.
     */
    private String nascimentoAcuracia;

    /**
     * Data de seguimento.
     */
    private String nascimentoSeg;

    /**
     * Nascimento pluralidade.
     */
    private int nascimentoPl;

    /**
     * Nascimento ordem.
     */
    private int nascimentoOrdem;

    /**
     * Data de óbito.
     */
    private LocalDate obito;

    /**
     * Óbito acurácia.
     */
    private String obitoAcuracia;

    /**
     * Óbito fonte.
     */
    private int obitoFonte;

    /**
     * Sexo.
     */
    private int sexo;

    /**
     * Nome da mãe.
     */
    private String mae;

    /**
     * Nome do pai.
     */
    private String pai;

    /**
     * Situação familiar.
     */
    private int situacaoFamiliar;

    /**
     * Etnia.
     */
    private int raca;

    /**
     * Comentário.
     */
    private String comentario;

    /**
     * Nacionalidade.
     */
    private int nacionalidade;

    /**
     * Código do município.
     */
    private int municipio;

    /**
     * Código do estado.
     */
    private int estado;

    /**
     * Código do país.
     */
    private int pais;

    /**
     * Data de entrada no país.
     */
    private LocalDate dataEntradaPais;

    /**
     * Getter para individuo.
     *
     * @return Variavel individuo.
     */
    public IndividuoDTO getIndividuo() {
        return individuo;
    }

    /**
     * Setter para individuo.
     *
     * @param individuo Variável individuo a ser editada.
     */
    public void setIndividuo(IndividuoDTO individuo) {
        this.individuo = individuo;
    }

    /**
     * Getter para nascimento.
     *
     * @return Variavel nascimento.
     */
    public LocalDate getNascimento() {
        return nascimento;
    }

    /**
     * Setter para nascimento.
     *
     * @param nascimento Variável nascimento a ser editada.
     */
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * Getter para nascimentoAcuracia.
     *
     * @return Variavel nascimentoAcuracia.
     */
    public String getNascimentoAcuracia() {
        return nascimentoAcuracia;
    }

    /**
     * Setter para nascimentoAcuracia.
     *
     * @param nascimentoAcuracia Variável nascimentoAcuracia a ser editada.
     */
    public void setNascimentoAcuracia(String nascimentoAcuracia) {
        this.nascimentoAcuracia = nascimentoAcuracia;
    }

    /**
     * Getter para nascimentoSeg.
     *
     * @return Variavel nascimentoSeg.
     */
    public String getNascimentoSeg() {
        return nascimentoSeg;
    }

    /**
     * Setter para nascimentoSeg.
     *
     * @param nascimentoSeg Variável nascimentoSeg a ser editada.
     */
    public void setNascimentoSeg(String nascimentoSeg) {
        this.nascimentoSeg = nascimentoSeg;
    }

    /**
     * Getter para nascimentoPl.
     *
     * @return Variavel nascimentoPl.
     */
    public int getNascimentoPl() {
        return nascimentoPl;
    }

    /**
     * Setter para nascimentoPl.
     *
     * @param nascimentoPl Variável nascimentoPl a ser editada.
     */
    public void setNascimentoPl(int nascimentoPl) {
        this.nascimentoPl = nascimentoPl;
    }

    /**
     * Getter para nascimentoOrdem.
     *
     * @return Variavel nascimentoOrdem.
     */
    public int getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    /**
     * Setter para nascimentoOrdem.
     *
     * @param nascimentoOrdem Variável nascimentoOrdem a ser editada.
     */
    public void setNascimentoOrdem(int nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    /**
     * Getter para obito.
     *
     * @return Variavel obito.
     */
    public LocalDate getObito() {
        return obito;
    }

    /**
     * Setter para obito.
     *
     * @param obito Variável obito a ser editada.
     */
    public void setObito(LocalDate obito) {
        this.obito = obito;
    }

    /**
     * Getter para obitoAcuracia.
     *
     * @return Variavel obitoAcuracia.
     */
    public String getObitoAcuracia() {
        return obitoAcuracia;
    }

    /**
     * Setter para obitoAcuracia.
     *
     * @param obitoAcuracia Variável obitoAcuracia a ser editada.
     */
    public void setObitoAcuracia(String obitoAcuracia) {
        this.obitoAcuracia = obitoAcuracia;
    }

    /**
     * Getter para obitoFonte.
     *
     * @return Variavel obitoFonte.
     */
    public int getObitoFonte() {
        return obitoFonte;
    }

    /**
     * Setter para obitoFonte.
     *
     * @param obitoFonte Variável obitoFonte a ser editada.
     */
    public void setObitoFonte(int obitoFonte) {
        this.obitoFonte = obitoFonte;
    }

    /**
     * Getter para sexo.
     *
     * @return Variavel sexo.
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * Setter para sexo.
     *
     * @param sexo Variável sexo a ser editada.
     */
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    /**
     * Getter para mae.
     *
     * @return Variavel mae.
     */
    public String getMae() {
        return mae;
    }

    /**
     * Setter para mae.
     *
     * @param mae Variável mae a ser editada.
     */
    public void setMae(String mae) {
        this.mae = mae;
    }

    /**
     * Getter para pai.
     *
     * @return Variavel pai.
     */
    public String getPai() {
        return pai;
    }

    /**
     * Setter para pai.
     *
     * @param pai Variável pai a ser editada.
     */
    public void setPai(String pai) {
        this.pai = pai;
    }

    /**
     * Getter para situacaoFamiliar.
     *
     * @return Variavel situacaoFamiliar.
     */
    public int getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    /**
     * Setter para situacaoFamiliar.
     *
     * @param situacaoFamiliar Variável situacaoFamiliar a ser editada.
     */
    public void setSituacaoFamiliar(int situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    /**
     * Getter para raca.
     *
     * @return Variavel raca.
     */
    public int getRaca() {
        return raca;
    }

    /**
     * Setter para raca.
     *
     * @param raca Variável raca a ser editada.
     */
    public void setRaca(int raca) {
        this.raca = raca;
    }

    /**
     * Getter para comentario.
     *
     * @return Variavel comentario.
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Setter para comentario.
     *
     * @param comentario Variável comentario a ser editada.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Getter para nacionalidade.
     *
     * @return Variavel nacionalidade.
     */
    public int getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Setter para nacionalidade.
     *
     * @param nacionalidade Variável nacionalidade a ser editada.
     */
    public void setNacionalidade(int nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * Getter para municipio.
     *
     * @return Variavel municipio.
     */
    public int getMunicipio() {
        return municipio;
    }

    /**
     * Setter para municipio.
     *
     * @param municipio Variável municipio a ser editada.
     */
    public void setMunicipio(int municipio) {
        this.municipio = municipio;
    }

    /**
     * Getter para estado.
     *
     * @return Variavel estado.
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Setter para estado.
     *
     * @param estado Variável estado a ser editada.
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Getter para pais.
     *
     * @return Variavel pais.
     */
    public int getPais() {
        return pais;
    }

    /**
     * Setter para pais.
     *
     * @param pais Variável pais a ser editada.
     */
    public void setPais(int pais) {
        this.pais = pais;
    }

    /**
     * Getter para dataEntradaPais.
     *
     * @return Variavel dataEntradaPais.
     */
    public LocalDate getDataEntradaPais() {
        return dataEntradaPais;
    }

    /**
     * Setter para dataEntradaPais.
     *
     * @param dataEntradaPais Variável dataEntradaPais a ser editada.
     */
    public void setDataEntradaPais(LocalDate dataEntradaPais) {
        this.dataEntradaPais = dataEntradaPais;
    }

}
