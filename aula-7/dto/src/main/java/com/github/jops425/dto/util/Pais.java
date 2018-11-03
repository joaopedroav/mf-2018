package com.github.jops425.dto.util;

/**
 * Classe país.
 *
 * @author joao
 *
 */
public class Pais {

	/**
	 * Código do país.
	 */
	private int codigo;

	/**
	 * Nome do país.
	 */
	private String nome;

	/**
	 * Getter para código.
	 * @return codigo.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código.
	 * @param codigo O código do país.
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter para nome.
	 * @return O nome do país.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Setter para nome.
	 * @param nome O nome do país.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

}
