package com.celular.clientes;

import java.util.ArrayList;

public class Compania {

	/*
	 * Clase Compañia: 
	 * nombre, 
	 * clienteCelular[] (arreglo con objetos de ClienteCelular), 
	 * cantidad de clientes (registro de clientes), 
	 * capacidad máxima (cantidad de clientes).
	 * */
	
	private String nombre;
	private Cliente[] clienteCelular;
	private ArrayList<Cliente> clienteCelulares;
	private int cantidadClientes;
	private int capacidadMaxima;//10
	
	public Compania() {};
	//Constructor recibe parámetro para recibir capacidad máxima en Compañia.
	
	public Compania(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	
	public Compania(String nombre, Cliente[] clienteCelular,ArrayList<Cliente> clienteCelulares, int cantidadClientes, int capacidadMaxima) {
		super();
		this.nombre = nombre;
		this.clienteCelular = clienteCelular;
		this.cantidadClientes = cantidadClientes;
		this.capacidadMaxima = capacidadMaxima;
		this.clienteCelulares = clienteCelulares;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadClientes() {
		return cantidadClientes;
	}
	public void setCantidadClientes(int cantidadClientes) {
		this.cantidadClientes = cantidadClientes;
	}
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	public Cliente[] getClienteCelular() {
		return clienteCelular;
	}
	public void setClienteCelular(Cliente[] clienteCelular) {
		this.clienteCelular = clienteCelular;
	}
	
	public ArrayList<Cliente> getClienteCelulares() {
		return clienteCelulares;
	}
	public void setClienteCelulares(ArrayList<Cliente> clienteCelulares) {
		this.clienteCelulares = clienteCelulares;
	}
	//metodos
	//agregarCliente: agrega un cliente al arreglo 
	//validando que no supere la capacidad máxima.
	public void agregarCliente(Cliente cliente) {
		clienteCelulares = new ArrayList<Cliente>();
		if(this.cantidadClientes < this.capacidadMaxima) {
			this.clienteCelulares.add(cliente);
		}
	}
	/*buscarCliente: busca un cliente por su rut, si existe retorna true sino false.*/
	public boolean buscarCliente(String rut) {
		
		for(int i =0; i < this.clienteCelulares.size();i++) {
			
			Cliente cliente = this.clienteCelulares.get(i);
			if(cliente.getRut().equals(rut)) {
				return true;
			}
		}
		
		return false;
	}
	/*modificarCelular: el cual recibe un rut de cliente y número nuevo, 
	 * si se encuentra el cliente dentro del arreglo, 
	 * se procederá a cambiar el número de celular por el nuevo número
	 */
	
	public void modificarCelular(String rut,String numero){
		for(Cliente cliente : this.clienteCelulares) {
			if(cliente.getRut().equals(rut)) {
				cliente.getCelu().setNumero(numero);
			}
		}
	}
	
	/*listarClientes: el cual imprimirá el número de celular, el nombre del cliente y si posee o no plan.
*/
	public void listarClientes() {
		
		for(int i =0; i < this.clienteCelulares.size();i++) {
			System.out.println("*******");
			System.out.println("numero: "+this.clienteCelulares.get(i).getCelu().getNumero());
			System.out.println("nombre: "+this.clienteCelulares.get(i).getNombre());
			if(this.clienteCelulares.get(i).isPlan()) {
				System.out.println("Cliente tiene plan");
			}else {
				System.out.println("Cliente NO tiene plan...");
			}
			
		}
	}
	
}
