package com.github.jops425.dto;

import java.time.LocalDate;

/**
 * @author João
 *
 */
public class EnderecoDTO implements DTO {

    private Individuo id;

    private String ordem;

    private String linha;

    private String bairro;

    private String distrito;

    private int codigoMunicipio;

    private String cep;

    private String caixaPostal;

    private String pais;

    private String tipo;

    private LocalDate data;

    private String acuracia;

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
