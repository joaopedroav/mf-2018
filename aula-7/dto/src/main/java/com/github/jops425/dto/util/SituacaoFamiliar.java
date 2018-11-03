package com.github.jops425.dto.util;

/**
 * Classe situação familiar.
 * @author joao
 *
 */
public class SituacaoFamiliar {

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
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código;
	 * @param codigo O código.
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter para descrição.
	 * @return Descrição.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param descricao A descrição.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
