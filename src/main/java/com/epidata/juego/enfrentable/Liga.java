package com.epidata.juego.enfrentable;

import java.util.ArrayList;

public class Liga extends Enfrentable{
//Attr
	private ArrayList<Enfrentable> integrantes;
	
//CONSTRUCTORS
	public Liga(String nombre, String nombreFantasia) {
		super(nombre, nombreFantasia);
	}
	
	public Liga(String nombre, String nombreFantasia, ArrayList<Enfrentable> integrantes) {
		super(nombre, nombreFantasia);
		this.setIntegrantes(integrantes);
	}
//END CONSTRUCTORS

//------------------

//GETTERS AND SETTERS
	public ArrayList<Enfrentable> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Enfrentable> integrantes) {
		this.integrantes = integrantes;
	}
//END GETTERS AND SETTERS
//------------------
	
	public boolean addIntegrante(Enfrentable e) {
		return false;
	}
	
	public float getValorAtributo(String key) {
		return 0.0f;
	}


}
