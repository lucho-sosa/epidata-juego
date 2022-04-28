package com.epidata.juego.rol;

import java.util.ArrayList;
import java.util.Comparator;

import com.epidata.juego.enfrentable.*;
public class Juego 
{
	/*
	 * Opcional. Chequear que el ordenarPesonajes no retorne Personajes repetidos. 
	 * Considere lo métodos adicionales que necesite para controlar la condición.
	 * */
	private ArrayList<Enfrentable> enfrentables;
	
	public Juego() {
		super();
	}
	
    public Juego(ArrayList<Enfrentable> enfrentables) {
		super();
		this.enfrentables = enfrentables;
	}
    
    public ArrayList<Enfrentable> getQuienesGanan(Enfrentable e, Comparator c){
    	return new ArrayList<Enfrentable>();
    }
    
    public Enfrentable Enfrentar(Enfrentable e1, Enfrentable e2) {
    	return e2;
    }
    
    public boolean addEnfrentable(Enfrentable e) {
//    	esto es muy Go refactorizar para que lance una excepción 
    	if (e.equals(null)) {
    		return false;
    	}
    	enfrentables.add(e);
    	return true;
    	
//    	try {
//    		enfrentables.add(e);
//        	return true;
//		} catch (Exception e2) {
//			System.out.println(e2.getMessage());
//			return false;
//		} 
    	
    }
    
    public ArrayList<Personaje> ordenarPersonajes(Comparator c){
    	return new ArrayList<Personaje>();
    }
    
    public static void main( String[] args )
    {
        //lanzamos el juego creando su instancia
    	//Juego juego = new Juego();
    	
    	//crear personajes
    	//crear ligas
    	//crear atributos
    	
    	
    	
    	
    }
}
