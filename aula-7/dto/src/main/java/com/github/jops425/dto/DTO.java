package com.github.jops425.dto;

/**
 * Interface com os métodos DTO.
 *
 * @author joaopedro
 *
 */
public interface DTO {

    /**
     * Serializa json para objeto.
     */
    void fromJson();

    /**
     * Serializa objeto para json.
     */
    void toJson();

    /**
     * Serializa xml para objeto.
     */
    void fromXML();

    /**
     * Serializa objeto para xml.
     */
    void toXML();
}
