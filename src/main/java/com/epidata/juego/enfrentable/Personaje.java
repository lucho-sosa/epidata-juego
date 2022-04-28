package com.epidata.juego.enfrentable;

import java.util.ArrayList;
import java.util.HashMap;

import com.epidata.juego.atributo.Atributo;

public class Personaje extends Enfrentable {
	/*
	 * En getValorAtributo, en caso de no encontrarse el atributo solicitado,
	 * se debe retornar 0. 
	 * En getPersonaje, debe retornar una lista consigo mismo.
	 * */
	private HashMap<String, Atributo> atributos;

	public Personaje(String nombre, String nombreFantasia) {
		super(nombre, nombreFantasia);
		// TODO Auto-generated constructor stub
	}

	public float getValorAtributo(String key) {
		return 0.0f;
	}
	
	protected ArrayList<Personaje> getPersonajes() {
		return new ArrayList<Personaje>();
	}
	
	public boolean addAtributo(String k, Atributo A) {
		return false;
	}
		
}
