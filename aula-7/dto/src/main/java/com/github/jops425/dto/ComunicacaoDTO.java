package com.github.jops425.dto;

/**
 * @author aluno
 *
 */
public class ComunicacaoDTO {

    private IndividuoDTO id;

    private String meio;

    private String preferencia;

    private String detalhe;

    private String uso;

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
     * @param meio Variável meio a ser editada.
     */
    public void setMeio(String meio) {
        this.meio = meio;
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
     * @param preferencia Variável preferencia a ser editada.
     */
    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
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
     * @param detalhe Variável detalhe a ser editada.
     */
    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
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
     * @param uso Variável uso a ser editada.
     */
    public void setUso(String uso) {
        this.uso = uso;
    }


}
