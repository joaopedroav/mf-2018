package com.github.jops425.dto.collections;

import java.util.ArrayList;

import com.github.jops425.dto.models.DadoDemografico;

public class Dados {

	private ArrayList<DadoDemografico> dados;

	/**
	 * Getter para dados.
	 *
	 * @return Variável dados.
	 */
	public ArrayList<DadoDemografico> getDados() {
		return dados;
	}

	/**
	 * Setter para dados.
	 *
	 * @param dados Variável dados a ser editada.
	 */
	public void setDados(ArrayList<DadoDemografico> dados) {
		this.dados = dados;
	}

}
