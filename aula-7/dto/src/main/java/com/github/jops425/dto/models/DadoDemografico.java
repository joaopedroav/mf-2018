package com.github.jops425.dto.models;

import java.time.LocalDate;

/**
 * Classe Dado Demográfico.
 */
public final class DadoDemografico {

    /**
     * Indivíduo.
     */
    private Individuo individuo;

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
    public final Individuo getIndividuo() {
        return individuo;
    }

    /**
     * Setter para individuo.
     *
     * @param individuo1 Variável individuo a ser editada.
     */
    public final void setIndividuo(final Individuo individuo1) {
        this.individuo = individuo1;
    }

    /**
     * Getter para nascimento.
     *
     * @return Variavel nascimento.
     */
    public final LocalDate getNascimento() {
        return nascimento;
    }

    /**
     * Setter para nascimento.
     *
     * @param nascimento1 Variável nascimento a ser editada.
     */
    public final void setNascimento(final LocalDate nascimento1) {
        this.nascimento = nascimento1;
    }

    /**
     * Getter para nascimentoAcuracia.
     *
     * @return Variavel nascimentoAcuracia.
     */
    public final String getNascimentoAcuracia() {
        return nascimentoAcuracia;
    }

    /**
     * Setter para nascimentoAcuracia.
     *
     * @param nascimentoAcuracia1 Variável nascimentoAcuracia a ser editada.
     */
    public final void setNascimentoAcuracia(
            final String nascimentoAcuracia1) {
        this.nascimentoAcuracia = nascimentoAcuracia1;
    }

    /**
     * Getter para nascimentoSeg.
     *
     * @return Variavel nascimentoSeg.
     */
    public final String getNascimentoSeg() {
        return nascimentoSeg;
    }

    /**
     * Setter para nascimentoSeg.
     *
     * @param nascimentoSeg1 Variável nascimentoSeg a ser editada.
     */
    public final void setNascimentoSeg(final
            String nascimentoSeg1) {
        this.nascimentoSeg = nascimentoSeg1;
    }

    /**
     * Getter para nascimentoPl.
     *
     * @return Variavel nascimentoPl.
     */
    public final int getNascimentoPl() {
        return nascimentoPl;
    }

    /**
     * Setter para nascimentoPl.
     *
     * @param nascimentoPl1 Variável nascimentoPl a ser editada.
     */
    public final void setNascimentoPl(final int nascimentoPl1) {
        this.nascimentoPl = nascimentoPl1;
    }

    /**
     * Getter para nascimentoOrdem.
     *
     * @return Variavel nascimentoOrdem.
     */
    public final int getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    /**
     * Setter para nascimentoOrdem.
     *
     * @param nascimentoOrdem1 Variável nascimentoOrdem a ser editada.
     */
    public final void setNascimentoOrdem(
            final int nascimentoOrdem1) {
        this.nascimentoOrdem = nascimentoOrdem1;
    }

    /**
     * Getter para obito.
     *
     * @return Variavel obito.
     */
    public final LocalDate getObito() {
        return obito;
    }

    /**
     * Setter para obito.
     *
     * @param obito1 Variável obito a ser editada.
     */
    public final void setObito(final LocalDate obito1) {
        this.obito = obito1;
    }

    /**
     * Getter para obitoAcuracia.
     *
     * @return Variavel obitoAcuracia.
     */
    public final String getObitoAcuracia() {
        return obitoAcuracia;
    }

    /**
     * Setter para obitoAcuracia.
     *
     * @param obitoAcuracia1 Variável obitoAcuracia a ser editada.
     */
    public final void setObitoAcuracia(final String obitoAcuracia1) {
        this.obitoAcuracia = obitoAcuracia1;
    }

    /**
     * Getter para obitoFonte.
     *
     * @return Variavel obitoFonte.
     */
    public final int getObitoFonte() {
        return obitoFonte;
    }

    /**
     * Setter para obitoFonte.
     *
     * @param obitoFonte1 Variável obitoFonte a ser editada.
     */
    public final void setObitoFonte(final int obitoFonte1) {
        this.obitoFonte = obitoFonte1;
    }

    /**
     * Getter para sexo.
     *
     * @return Variavel sexo.
     */
    public final int getSexo() {
        return sexo;
    }

    /**
     * Setter para sexo.
     *
     * @param sexo1 Variável sexo a ser editada.
     */
    public final void setSexo(final int sexo1) {
        this.sexo = sexo1;
    }

    /**
     * Getter para mae.
     *
     * @return Variavel mae.
     */
    public final String getMae() {
        return mae;
    }

    /**
     * Setter para mae.
     *
     * @param mae1 Variável mae a ser editada.
     */
    public final void setMae(final String mae1) {
        this.mae = mae1;
    }

    /**
     * Getter para pai.
     *
     * @return Variavel pai.
     */
    public final String getPai() {
        return pai;
    }

    /**
     * Setter para pai.
     *
     * @param pai1 Variável pai a ser editada.
     */
    public final void setPai(final String pai1) {
        this.pai = pai1;
    }

    /**
     * Getter para situacaoFamiliar.
     *
     * @return Variavel situacaoFamiliar.
     */
    public final int getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    /**
     * Setter para situacaoFamiliar.
     *
     * @param situacaoFamiliar1 Variável situacaoFamiliar a ser editada.
     */
    public final void setSituacaoFamiliar(
            final int situacaoFamiliar1) {
        this.situacaoFamiliar = situacaoFamiliar1;
    }

    /**
     * Getter para raca.
     *
     * @return Variavel raca.
     */
    public final int getRaca() {
        return raca;
    }

    /**
     * Setter para raca.
     *
     * @param raca1 Variável raca a ser editada.
     */
    public final void setRaca(final int raca1) {
        this.raca = raca1;
    }

    /**
     * Getter para comentario.
     *
     * @return Variavel comentario.
     */
    public final String getComentario() {
        return comentario;
    }

    /**
     * Setter para comentario.
     *
     * @param comentario1 Variável comentario a ser editada.
     */
    public final void setComentario(final String comentario1) {
        this.comentario = comentario1;
    }

    /**
     * Getter para nacionalidade.
     *
     * @return Variavel nacionalidade.
     */
    public final int getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Setter para nacionalidade.
     *
     * @param nacionalidade1 Variável nacionalidade a ser editada.
     */
    public final void setNacionalidade(final int nacionalidade1) {
        this.nacionalidade = nacionalidade1;
    }

    /**
     * Getter para municipio.
     *
     * @return Variavel municipio.
     */
    public final int getMunicipio() {
        return municipio;
    }

    /**
     * Setter para municipio.
     *
     * @param municipio1 Variável municipio a ser editada.
     */
    public final void setMunicipio(final int municipio1) {
        this.municipio = municipio1;
    }

    /**
     * Getter para estado.
     *
     * @return Variavel estado.
     */
    public final int getEstado() {
        return estado;
    }

    /**
     * Setter para estado.
     *
     * @param estado1 Variável estado a ser editada.
     */
    public final void setEstado(final int estado1) {
        this.estado = estado1;
    }

    /**
     * Getter para pais.
     *
     * @return Variavel pais.
     */
    public final int getPais() {
        return pais;
    }

    /**
     * Setter para pais.
     *
     * @param pais1 Variável pais a ser editada.
     */
    public final void setPais(final int pais1) {
        this.pais = pais1;
    }

    /**
     * Getter para dataEntradaPais.
     *
     * @return Variavel dataEntradaPais.
     */
    public final LocalDate getDataEntradaPais() {
        return dataEntradaPais;
    }

    /**
     * Setter para dataEntradaPais.
     *
     * @param dataEntradaPais1 Variável dataEntradaPais a ser editada.
     */
    public final void setDataEntradaPais(final LocalDate dataEntradaPais1) {
        this.dataEntradaPais = dataEntradaPais1;
    }

}
