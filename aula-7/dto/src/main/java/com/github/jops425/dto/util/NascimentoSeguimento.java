package com.github.jops425.dto;

/**
 * Classe Nascimento Seguimento.
 * @author joao
 *
 */
public class NascimentoSeguimento {

	/**
	 * Código NS.
	 */
	private int codigo;

	/**
	 * Descrição NS.
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
	 * @return Descrição NS.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param descricao A descrição NS.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
