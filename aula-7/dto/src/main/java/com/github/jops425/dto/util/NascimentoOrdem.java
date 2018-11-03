package com.github.jops425.dto.util;

/**
 * Classe Nascimento Ordem.
 * @author joao
 *
 */
public class NascimentoOrdem {

	/**
	 * Código NO.
	 */
	private int codigo;

	/**
	 * Descrição NO.
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
	 * @return Descrição NO.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param descricao A descrição NO.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
