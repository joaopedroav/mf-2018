package com.github.jops425.dto.util;

/**
 * Classe nacionalidade.
 * @author joao
 *
 */
public class Nacionalidade {

	/**
	 * Código.
	 */
	private int codigo;

	/**
	 * Descrição.
	 */
	private String descricao;

	/**
	 * Getter para código.
	 * @return O código.
	 */
	public final int getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código.
	 * @param cod O código.
	 */
	public final void setCodigo(final int cod) {
		this.codigo = cod;
	}

	/**
	 * Getter para descrição.
	 * @return Descrição.
	 */
	public final String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param des A descrição.
	 */
	public final void setDescricao(final String des) {
		this.descricao = des;
	}

}
