package com.github.jops425.dto.util;

/**
 * Classe Sexo.
 * @author joao
 *
 */
public class Sexo {

	/**
	 * Código do sexo.
	 */
	private int codigo;

	/**
	 * Descrição do sexo.
	 */
	private String descricao;

	/**
	 * Valor alternativo.
	 */
	private String alternativo;

	/**
	 * Getter para código.
	 * @return O código.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código.
	 * @param codigo Código do sexo.
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter para descrição.
	 * @return descrição.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param descricao Descrição do sexo.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Getter para alternativo.
	 * @return O valor 'alternativo'.
	 */
	public String getAlternativo() {
		return alternativo;
	}

	/**
	 * Setter para alternativo.
	 * @param alternativo O valor 'alternativo'.
	 */
	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}

}
