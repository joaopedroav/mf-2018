package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.Comunicacao;

public class Comunicacoes {

	private ArrayList<Comunicacao> comunicacoes = new ArrayList<Comunicacao>();

	/**
	 * Getter para comunicacoes.
	 *
	 * @return Variável comunicacoes.
	 */
	public ArrayList<Comunicacao> getComunicacoes() {
		return comunicacoes;
	}

	/**
	 * Setter para comunicacoes.
	 *
	 * @param comunicacoes Variável comunicacoes a ser editada.
	 */
	public void setComunicacoes(ArrayList<Comunicacao> comunicacoes) {
		this.comunicacoes = comunicacoes;
	}

}
