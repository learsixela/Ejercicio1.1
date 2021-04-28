package com.everis.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo!");
		System.out.println();
		//instancia de clase
		Persona persona = new Persona();
		//agregar informacion (SET)
		persona.setNombre("Israel");
		//consultar
		System.out.println(persona.getNombre());
		System.out.println(persona.getApellido());
	
		//nueva instancia de clase
		Persona persona2 = new Persona("Alexis","Palma",41,"a@a.cl","1-9");
		System.out.println(persona2.getNombre());
		System.out.println(persona2.getApellido());
	}

}
