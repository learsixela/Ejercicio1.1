package com.celular.clientes;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
/*Clase Cliente: 
 * rut, 
 * nombre, 
 * edad, 
 * sexo (Masculino:  ́M ́, Femenino: ‘F’),
 * plan (Tiene Plan: true,No Tiene Plan: false), 
 * celular.*/

	private String rut;
	private String nombre;
	private int edad;
	private char sexo;
	private boolean plan;
	private Celular[] celular;
	private ArrayList<Celular> celulares;
	private Celular celu;
	//char[] sexo = {'m','f'};
	
	public Cliente() {};
	public Cliente(String rut, String nombre, int edad, char sexo, boolean plan,Celular celu) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.plan = plan;
		this.celu = celu;
	}
	
	public Cliente(String rut, String nombre, int edad, char sexo, boolean plan, Celular[] celular,ArrayList<Celular> celulares,Celular celu) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.plan = plan;
		this.celular = celular;
		this.celulares = celulares;
		this.celu = celu;
	}
	
	//metodos
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", plan=" + plan
				+ ", celular=" + Arrays.toString(celular) + ", celulares=" + celulares + ", celu=" + celu + "]";
	}
	
	//metodo imprimir: retornará todos los atributos de Cliente
	public String imprimir() {
		return "Cliente [rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", plan=" + plan
				+ ", celular=" + celular + "]";
	}
	
	
	//get and set

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isPlan() {
		return plan;
	}

	public void setPlan(boolean plan) {
		this.plan = plan;
	}

	public Celular[] getCelular() {
		return celular;
	}

	public void setCelular(Celular[] celular) {
		this.celular = celular;
	}

	public ArrayList<Celular> getCelulares() {
		return celulares;
	}

	public void setCelulares(ArrayList<Celular> celulares) {
		this.celulares = celulares;
	}

	public Celular getCelu() {
		return celu;
	}

	public void setCelu(Celular celu) {
		this.celu = celu;
	}
	


	

	

}
