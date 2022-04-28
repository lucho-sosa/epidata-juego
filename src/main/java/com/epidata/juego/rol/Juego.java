package com.epidata.juego.rol;

import java.util.ArrayList;

import com.epidata.juego.comparator.Comparador;
import com.epidata.juego.enfrentable.*;

public class Juego 
{
	/*
	 * Opcional. Chequear que el ordenarPesonajes no retorne Personajes repetidos. 
	 * Considere lo métodos adicionales que necesite para controlar la condición.
	 * */
	private ArrayList<Enfrentable> enfrentables;
	//MÉTODO FINALIZADO
	public Juego() {
		super();
	}
	//MÉTODO FINALIZADO
    public Juego(ArrayList<Enfrentable> enfrentables) {
		super();
		this.enfrentables = enfrentables;
	}
    

    public boolean addEnfrentable(Enfrentable e) { 
    	if (e.equals(null)) {
    		return false;
    	}
    	enfrentables.add(e);
    	return true;
    }
    
    //TODO: *opcional -> evitar que retorne personajes repetidos.
    public ArrayList<Personaje> ordenarPersonajes(Comparador c){
    	return new ArrayList<Personaje>();
    }
    
    public Enfrentable Enfrentar(Enfrentable e1, Enfrentable e2) {
    	return e2;
    }
    
    /*
     * Description: devolvera la lista de ligas y personajes que le ganan a un Enfrentable en cuestion.
     * 
     * parameters: 
     * --Enfrentable: Personaje o liga a vencer.
     * --Comparador: forma en la que se compararan las habilidades. (ComparatorCriterioSimple || ComparatorCompuesto)
     * 
     * Return Value:
     * --ArrayList<Enfrentables>: Lista de ligas y personajes que ganan. Puede resultar vacia.
     * */
    public ArrayList<Enfrentable> getQuienesGanan(Enfrentable e, Comparador c){
    	ArrayList<Enfrentable> ganadores = new ArrayList<Enfrentable>();
    	enfrentables.forEach((atacante) ->{
    		if (0 == c.compare(atacante, e)) {
    			ganadores.add(atacante);
    		}
    	});
    	return ganadores;
    }
    
    public static void main( String[] args )
    {
    	//instanciamos el juego
    	Juego juego = new Juego();
    	//creamos personajes
    	Personaje lucho = new Personaje("Lucho", "Kurgan");
    	Personaje amilcar = new Personaje("Amilcar", "kurgan");
    	Personaje tomas = new Personaje("Tomas", "kurgan");
    	Personaje carlos = new Personaje("Carlos", "kurgan");
    	Personaje claudia = new Personaje("Claudia", "kurgan");
    	//creamos ligas
    	Liga liga1 = new Liga("Liga 1", "Sosa");
    	Liga liga2 = new Liga("Liga 2", "Crespi");
    	Liga liga3 = new Liga("Liga 3", "Sosa2");
    	
    	//creamos atributos para los personajes
    	
    	
    	//agreamos una liga y un personaje al juego
    	juego.addEnfrentable(claudia);
    	juego.addEnfrentable(liga1);
    	
    	//agregamos un personaje y 2 ligas a una liga
    	liga1.addIntegrante(lucho);
    	liga1.addIntegrante(liga2);
    	liga1.addIntegrante(liga3);
    	
    	//agreamos 2 personajes a una liga que esta dentro e liga1
    	liga2.addIntegrante(tomas);
    	liga2.addIntegrante(carlos);
    	
    	//agregamos un pesonaje a una liga que esta dentro de liga2
    	liga3.addIntegrante(amilcar);
    	 	
    	//crear los atributos
    	
    }
}
