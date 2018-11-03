package com.github.jops425.dto;

import java.time.LocalDate;

public class DadoDemograficoDTO implements DTO {

	private String individuo;

	private LocalDate nascimento;

	private String nascimentoAcuracia;

	private int nascimentoPluralicade;

	private int nascimentoOrdem;

	private LocalDate obito;

	private String obitoAcuracia;

	private int obitoFonte;

	private int sexo;

	private String mae;

	private String pai;

	private int situacaoFamiliar;

	private int raca;

	private String comentario;

	private int nacionalidade;

	private int municipio;

	private String estado;

	private int pais;

	private LocalDate dataEntradaPais;

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
