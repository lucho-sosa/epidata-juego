package com.epidata.juego.enfrentable;

import java.util.ArrayList;
import java.util.HashMap;

import com.epidata.juego.atributo.Atributo;

public class Personaje extends Enfrentable {
	
//Attr
	private HashMap<String, Atributo> atributos;

//CONSTRUCTORS
	public Personaje(String nombre, String nombreFantasia) {
		super(nombre, nombreFantasia);
		this.atributos = new HashMap<String, Atributo>();
		// TODO Auto-generated constructor stub
	}
	
//GETTERS AND SETTERS

	public HashMap<String, Atributo> getAtributos() {
		return atributos;
	}

	public void setAtributos(HashMap<String, Atributo> atributos) {
		this.atributos = atributos;
	}
	
	public float getValorAtributo(String key) {
		float valor = this.atributos.get(key).getValor(this);
		return valor == 0 ?  0 : valor;
	}
	// En getPersonaje, debe retornar una lista consigo mismo.
	protected ArrayList<Personaje> getPersonajes() {
		ArrayList<Personaje> personaje = new ArrayList<Personaje>();
		personaje.add(this);
		return personaje;
	}
	
	public boolean addAtributo(String k, Atributo A) {
		if (k == "" || A == null) {
			return false;
		}
		atributos.put(k, A);
		return true;
	}
		
}
