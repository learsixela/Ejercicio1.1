package com.everis.main;

public class Persona {
//atributos
	private String nombre;
	private String apellido;
	private int edad;
	private String mail;
	private String rut;
	
	//Constructores (vacio, con parametros)
	
	public Persona() {
		super();
	}
	

	public Persona(String nombre, String apellido, int edad, String mail, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.mail = mail;
		this.rut = rut;
	}
	public Persona(String nombre, String apellido, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
	}
	
	//Metodos o funciones
	
	//getter & setter 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	

}
