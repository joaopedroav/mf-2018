package com.github.jops425.dto;

import java.time.LocalDate;

public class NomeDTO implements DTO {

    private Individuo id;

	private String titulos;

	private String nomes;

	private String sobrenomes;

	private String sufixos;

	private int preferido;

	private int usoCondicional;

	private String uso;

	private LocalDate dataInicial;

	private LocalDate dataFinal;

	private String utilizacao;

	private String alternativa;

	@Override
	public void fromJson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toJson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fromXML() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void toXML() {
		// TODO Auto-generated method stub
		
	}

}
