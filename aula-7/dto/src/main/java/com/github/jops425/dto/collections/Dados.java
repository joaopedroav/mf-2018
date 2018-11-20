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
	public final ArrayList<DadoDemografico> getDados() {
		return dados;
	}

	/**
	 * Setter para dados.
	 *
	 * @param dados1 Variável dados a ser editada.
	 */
	public final void setDados(final ArrayList<DadoDemografico> dados1) {
		this.dados = dados1;
	}

}
