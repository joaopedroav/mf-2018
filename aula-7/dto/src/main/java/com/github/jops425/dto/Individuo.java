package com.github.jops425.dto;

public class Individuo implements DTO {

	private String id;

	/**
     * Getter para id.
     *
     * @return Variavel id.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter para id.
     *
     * @param id Variável id a ser editada.
     */
    public void setId(String id) {
        this.id = id;
    }

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
