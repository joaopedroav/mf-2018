package com.github.jops425.dto;

import java.time.LocalDate;

/**
 * Classe Dado Demográfico DTO.
 */
public class DadoDemograficoDTO implements DTO {

    /**
     * Indivíduo.
     */
    // private Individuo individuo;

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
    private String nascSeg;

    /**
     * Nascimento pluralidade.
     */
    private int nascPl;

    /**
     * Nascimento ordem.
     */
    private int nascOrdem;

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
    private int nacio;

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
     * Método fromJson.
     */
    @Override
    public void fromJson() {
        // TODO Auto-generated method stub
    }

    /**
     * Método toJson.
     */
    @Override
    public void toJson() {
        // TODO Auto-generated method stub
    }

    /**
     * Método fromXML.
     */
    @Override
    public void fromXML() {
        // TODO Auto-generated method stub
    }

    /**
     * Método toXML.
     */
    @Override
    public void toXML() {
        // TODO Auto-generated method stub
    }

}
