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
     * Longitude
     */
    private String lng;

    /**
     * Construtor.
     *
     * @param coCnes Código do estabelecimento.
     * @param razaoSocial Razão social.
     * @param lat Latitude.
     * @param lgn Longitude.
     */
    public Estabelecimento(final String coCnes, final String razaoSocial,
    final String lat, final String lng) {
        this.coCnes = coCnes;
        this.razaoSocial = razaoSocial;
        this.lat = lat;
        this.lng = lng;
    }

    public String lng() {
        return this.lng;
    }

    public String getLat() {
        return this.lat;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    public String getCoCnes() {
        return this.coCnes;
    }

    public String toString() {
        String estabelecimento =
        this.coCnes + " " + this.razaoSocial + " " +
        this.lat + " " + this.lng;
        return estabelecimento;
    }
}