package com.github.jops425.dto.util;

/**
 * Classe Nascimento Pluralidade.
 * @author joao
 *
 */
public class NascimentoPluralidade {

	/**
	 * Código NP.
	 */
	private int codigo;

	/**
	 * Descrição NP.
	 */
	private String descricao;

	/**
	 * Getter para código.
	 * @return código.
	 */
	public final int getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código.
	 * @param cod Código NP.
	 */
	public final void setCodigo(final int cod) {
		this.codigo = cod;
	}

	/**
	 * Getter para descrição.
	 * @return descrição NP.
	 */
	public final String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param des Descrição NP.
	 */
	public final void setDescricao(final String des) {
		this.descricao = des;
	}

}
