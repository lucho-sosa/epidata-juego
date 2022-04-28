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
		return 0; //si no hay valor devolver por defecto
	}
	// En getPersonaje, debe retornar una lista consigo mismo.
	protected ArrayList<Personaje> getPersonajes() {
		ArrayList<Personaje> personaje = new ArrayList<Personaje>();
		personaje.add(this);
		return personaje;
	}
	
	public boolean addAtributo(String k, Atributo A) {
		return false;
	}
		
}
