package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Comunicacao;

public class Comunicacoes {

	private ArrayList<Comunicacao> comunicacoes;

	/**
	 * Getter para comunicacoes.
	 *
	 * @return Variável comunicacoes.
	 */
	public final ArrayList<Comunicacao> getComunicacoes() {
		return comunicacoes;
	}

	/**
	 * Setter para comunicacoes.
	 *
	 * @param comunicacoes1 Variável comunicacoes a ser editada.
	 */
	public final void setComunicacoes(final
	        ArrayList<Comunicacao> comunicacoes1) {
		this.comunicacoes = comunicacoes1;
	}

}
