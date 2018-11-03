package com.github.jops425.dto.util;

/**
 * Classe estado.
 * @author joao
 *
 */
public class Estado {

	/**
	 * Código.
	 */
	private String codigo;

	/**
	 * Descrição.
	 */
	private String descricao;

	/**
	 * Getter para código.
	 * @return O código.
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código;
	 * @param codigo O código.
	 */
	public void setCodigo(String codigo) {
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
