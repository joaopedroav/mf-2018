package com.github.jops425.dto;

/**
 * Classe município.
 * @author joao
 *
 */
public class Municipio {

	/**
	 * Código do município.
	 */
	private String codigo;

	/**
	 * Estado cujo município faz parte.
	 */
	private String estado;

	/**
	 * O município.
	 */
	private String municipio;

	/**
	 * Getter para código.
	 * @return O código.
	 */
	public String getCodigo() {
		return codigo;
	}

	/** Setter para código.
	 * @param codigo O código.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter para estado.
	 * @return O estado.
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Setter para estado.
	 * @param estado O estado.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * Getter para município.
	 * @return O município.
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * Setter para município.
	 * @param municipio O município.
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

}
