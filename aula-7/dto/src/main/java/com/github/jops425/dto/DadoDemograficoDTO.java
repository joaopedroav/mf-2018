package com.github.jops425.dto;

import java.time.LocalDate;
import com.github.jops425.dto.util.Individuo;
import com.github.jops425.dto.util.NascimentoSeguimento;
import com.github.jops425.dto.util.NascimentoPluralidade;
import com.github.jops425.dto.util.ObitoFonte;
import com.github.jops425.dto.util.Sexo;
import com.github.jops425.dto.util.SituacaoFamiliar;
import com.github.jops425.dto.util.Raca;
import com.github.jops425.dto.util.Nacionalidade;
import com.github.jops425.dto.util.Municipio;
import com.github.jops425.dto.util.Estado;
import com.github.jops425.dto.util.NascimentoOrdem;
import com.github.jops425.dto.util.Pais;

/**
 * Classe Dado Demográfico DTO.
 */
public class DadoDemograficoDTO implements DTO {

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
    private NascimentoSeguimento dataSeg;

    /**
     * Nascimento pluralidade.
     */
    private NascimentoPluralidade nascPl;

    /**
     * Nascimento ordem.
     */
    private NascimentoOrdem nascOrdem;

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
    private ObitoFonte obitoFonte;

    /**
     * Sexo.
     */
    private Sexo sexo;

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
    private SituacaoFamiliar sitFam;

    /**
     * Etnia.
     */
    private Raca raca;

    /**
     * Comentário.
     */
    private String comentario;

    /**
     * Nacionalidade.
     */
    private Nacionalidade nacio;

    /**
     * Código do município.
     */
    private Municipio muni;

    /**
     * Código do estado.
     */
    private Estado estado;

    /**
     * Código do país.
     */
    private Pais pais;

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
