package com.celular.clientes;

public class Celular {
	//atributos Clase Celular: número y marca.
	private String marca;
	private String numero;//+56 9 870
	
	public Celular() {};
	
	public Celular(String marca, String numero) {
		super();
		this.marca = marca;
		this.numero = numero;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	

}
