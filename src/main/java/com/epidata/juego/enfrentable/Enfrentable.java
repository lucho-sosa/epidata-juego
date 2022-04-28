package com.epidata.juego.enfrentable;

import java.util.ArrayList;
import java.util.Comparator;

public class Enfrentable {
	
	protected String nombre;
	protected String nombreFantasia;
	
	public Enfrentable(String nombre, String nombreFantasia) {
		this.nombre = nombre;
		this.nombreFantasia = nombreFantasia;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getNombreFantasia() {
		return this.nombreFantasia;
	}
	public float getValorAtributo(String key) {
		return 0.0f;
	}
	public Enfrentable enfrentar(Enfrentable e, Comparator c) {
		return new Enfrentable("", "");
	}
	public ArrayList<Personaje> ordenar(Comparator c){
		return new ArrayList<Personaje>();
	}
    protected ArrayList<Personaje> getPersonajes(){
    	return new ArrayList<Personaje>();
    }
	
}
