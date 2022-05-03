package com.epidata.juego.enfrentable;

import java.util.ArrayList;

public class Liga extends Enfrentable{
//Attr
	private ArrayList<Enfrentable> integrantes = new ArrayList<Enfrentable>();;
	
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
		integrantes.add(e);
		return true;
	}
	
	public float getValorAtributo(String key) {
		int cont = 0;
		float acc = 0;
		
		for (Enfrentable elem: integrantes) {
			float valor = elem.getValorAtributo(key);
			if ( valor == 0f) {
				continue;
			}
			cont++;
			acc += valor;
		}
		
		if (cont == 0) return 0.0f;
		return acc / cont;
	}

	protected ArrayList<Personaje> getPesonajes(){
		
		return null;
		
	}
}
