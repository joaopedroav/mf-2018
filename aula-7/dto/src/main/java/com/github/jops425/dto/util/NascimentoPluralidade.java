package com.github.jops425.dto;

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
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código.
	 * @param codigo Código NP.
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter para descrição.
	 * @return descrição NP.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param descricao Descrição NP.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
