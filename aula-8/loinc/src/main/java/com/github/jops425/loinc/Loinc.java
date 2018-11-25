package com.github.jops425.loinc;

/**
 * Model para entidade Loinc.
 * @author joao
 *
 */
public class Loinc {

    /**
     * Identificação.
     */
    private String loincNum;

    /**
     * Component.
     */
    private String component;

    /**
     * Property.
     */
    private String property;

    /**
     * Time Aspct.
     */
    private String timeAspct;

    /**
     * System.
     */
    private String system;

    /**
     * Scale typ.
     */
    private String scaleTyp;

    /**
     * Obtém loincNum.
     *
     * @return loincNum.
     */
    public final String getLoincNum() {
        return loincNum;
    }

    /**
     * Altera loincNum.
     *
     * @param loincNum1 loincNum a ser alterado.
     */
    public final void setLoincNum(final String loincNum1) {
        this.loincNum = loincNum1;
    }

    /**
     * Obtém component.
     *
     * @return component.
     */
    public final String getComponent() {
        return component;
    }

    /**
     * Altera component.
     *
     * @param component1 component a ser alterado.
     */
    public final void setComponent(final String component1) {
        this.component = component1;
    }

    /**
     * Obtém property.
     *
     * @return property.
     */
    public final String getProperty() {
        return property;
    }

    /**
     * Altera property.
     *
     * @param property1 property a ser alterado.
     */
    public final void setProperty(final String property1) {
        this.property = property1;
    }

    /**
     * Obtém timeAspct.
     *
     * @return timeAspct.
     */
    public final String getTimeAspct() {
        return timeAspct;
    }

    /**
     * Altera timeAspct.
     *
     * @param timeAspct1 timeAspct a ser alterado.
     */
    public final void setTimeAspct(final String timeAspct1) {
        this.timeAspct = timeAspct1;
    }

    /**
     * Obtém system.
     *
     * @return system.
     */
    public final String getSystem() {
        return system;
    }

    /**
     * Altera system.
     *
     * @param system1 system a ser alterado.
     */
    public final void setSystem(final String system1) {
        this.system = system1;
    }

    /**
     * Obtém scaleTyp.
     *
     * @return scaleTyp.
     */
    public final String getScaleTyp() {
        return scaleTyp;
    }

    /**
     * Altera scaleTyp.
     *
     * @param scaleTyp1 scaleTyp a ser alterado.
     */
    public final void setScaleTyp(final String scaleTyp1) {
        this.scaleTyp = scaleTyp1;
    }

    /**
     * Retorna uma string com os atributos.
     * @return String correspondente ao objeto.
     */
    public final String toString() {
        String loinc = null;
        loinc = this.loincNum + " " + this.component + " "
                + this.property + " " + this.timeAspct + " "
                + this.system + " " + this.scaleTyp;
        return loinc;
    }

}
