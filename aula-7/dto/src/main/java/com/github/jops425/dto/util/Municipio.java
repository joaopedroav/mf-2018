package com.github.jops425.dto.util;

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
	public final String getCodigo() {
		return codigo;
	}

	/** Setter para código.
	 * @param cod O código.
	 */
	public final void setCodigo(final String cod) {
		this.codigo = cod;
	}

	/**
	 * Getter para estado.
	 * @return O estado.
	 */
	public final String getEstado() {
		return estado;
	}

	/**
	 * Setter para estado.
	 * @param est O estado.
	 */
	public final void setEstado(final String est) {
		this.estado = est;
	}

	/**
	 * Getter para município.
	 * @return O município.
	 */
	public final String getMunicipio() {
		return municipio;
	}

	/**
	 * Setter para município.
	 * @param mun O município.
	 */
	public final void setMunicipio(final String mun) {
		this.municipio = mun;
	}

}
