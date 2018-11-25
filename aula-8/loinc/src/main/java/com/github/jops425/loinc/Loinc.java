package com.github.jops425.loinc;

/**
 * Model para entidade Loinc.
 * @author joao
 *
 */
public class Loinc {

    /**
     * Chave primária do banco.
     */
    private String loincNum = null;

    /**
     * MapTo.
     */
    private String mapTo = null;

    /**
     * Comment.
     */
    private String comment = null;

    /**
     * Obtém loincNum.
     *
     * @return loincNum.
     */
    public final String getLoincNum() {
        return loincNum;
    }

    /**
     * Obtém mapTo.
     *
     * @return mapTo.
     */
    public final String getMapTo() {
        return mapTo;
    }

    /**
     * Obtém comment.
     *
     * @return comment.
     */
    public final String getComment() {
        return comment;
    }

    /**
     * Altera loincNum.
     *
     * @param loincNum loincNum a ser alterado.
     */
    public void setLoincNum(String loincNum) {
        this.loincNum = loincNum;
    }

    /**
     * Altera mapTo.
     *
     * @param mapTo mapTo a ser alterado.
     */
    public void setMapTo(String mapTo) {
        this.mapTo = mapTo;
    }

    /**
     * Altera comment.
     *
     * @param comment comment a ser alterado.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
