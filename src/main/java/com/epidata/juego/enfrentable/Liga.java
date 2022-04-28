package com.epidata.juego.enfrentable;

import java.util.ArrayList;

public class Liga extends Enfrentable{

	public Liga(String nombre, String nombreFantasia) {
		super(nombre, nombreFantasia);
		// TODO Auto-generated constructor stub
	}

	public Liga(String nombre, String nombreFantasia, ArrayList<Enfrentable> integrantes) {
		super(nombre, nombreFantasia);
		// TODO Auto-generated constructor stub
	}	
	
	public boolean addIntegrante(Enfrentable e) {
		return false;
	}
	
	public float getValorAtributo(String key) {
		return 0.0f;
	}
	
	protected ArrayList<Personaje> getPersonajes(){
		return new ArrayList<Personaje>();
	}
}
