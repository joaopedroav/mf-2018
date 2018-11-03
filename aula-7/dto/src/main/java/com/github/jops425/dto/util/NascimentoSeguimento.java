package com.github.jops425.dto.util;

/**
 * Classe Nascimento Seguimento.
 * @author joao
 *
 */
public class NascimentoSeguimento {

	/**
	 * Código NS.
	 */
	private String codigo;

	/**
	 * Descrição NS.
	 */
	private String descricao;

	/**
	 * Getter para código.
	 * @return O código.
	 */
	public final String getCodigo() {
		return codigo;
	}

	/**
	 * Setter para código.
	 * @param cod O código.
	 */
	public final void setCodigo(final String cod) {
		this.codigo = cod;
	}

	/**
	 * Getter para descrição.
	 * @return Descrição NS.
	 */
	public final String getDescricao() {
		return descricao;
	}

	/**
	 * Setter para descrição.
	 * @param desc A descrição NS.
	 */
	public final void setDescricao(final String desc) {
		this.descricao = desc;
	}

}
