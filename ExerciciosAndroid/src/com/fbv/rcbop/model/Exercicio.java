package com.fbv.rcbop.model;

public class Exercicio {
	
	private int id;
	private String descricao;
	
	public Exercicio(int id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

}
