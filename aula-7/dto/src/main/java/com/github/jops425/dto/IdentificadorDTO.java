package com.github.jops425.dto;

import java.time.LocalDate;

public class IdentificadorDTO implements DTO {

    private Individuo id;

    private String designacao;

    private String area;

    private String emissor;

    private LocalDate data;

    private String tipo;

    private String serie;

    private String estado;

    private String tipoCertidao;

    private String cartorioCertidao;

    private String livroCertidao;

    private String folhaCertidao;

    private String termoCertidao;

    private String secaoTitulo;

    private String zonaTitulo;

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
