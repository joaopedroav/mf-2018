package com.github.jops425.cnes;

/**
 * Coleção para o estabelecimento.
 */
public class Estabelecimento {

    /**
     * Código do estabelecimento.
     */
    private String coCnes;

    /**
     * Razão social.
     */
    private String razaoSocial;

    /**
     * Latitude.
     */
    private String lat;

    /**
     * Longitude.
     */
    private String lng;

    /**
     * Construtor.
     *
     * @param cCnes Código do estabelecimento.
     * @param razaoSoc Razão social.
     * @param lt Latitude.
     * @param lg Longitude.
     */
    public Estabelecimento(final String cCnes, final String razaoSoc,
    final String lt, final String lg) {
        this.coCnes = cCnes;
        this.razaoSocial = razaoSoc;
        this.lat = lt;
        this.lng = lg;
    }

    /**
     * Getter p/ longitude.
     *
     * @return longitude.
     */
    public final String getLng() {
        return this.lng;
    }

    /**
     * Getter p/ latitude.
     *
     * @return latitude.
     */
    public final String getLat() {
        return this.lat;
    }

    /**
     * Getter p/ razão social.
     *
     * @return Razão social.
     */
    public final String getRazaoSocial() {
        return this.razaoSocial;
    }

    /**
     * Getter p/ Código do estabelecimento.
     *
     * @return Código do estabelecimento.
     */
    public final String getCoCnes() {
        return this.coCnes;
    }

    /**
     * Retorna coleção em String.
     *
     * @return Coleção.
     */
    public final String toString() {
        String estabelecimento = this.coCnes
        + " " + this.razaoSocial + " " + this.lat + " " + this.lng;
        return estabelecimento;
    }
}
