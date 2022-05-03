package com.epidata.juego.rol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import com.epidata.juego.atributo.AtributoCondicional;
import com.epidata.juego.atributo.AtributoOperacion;
import com.epidata.juego.atributo.AtributoSimple;
import com.epidata.juego.comparator.Comparador;
import com.epidata.juego.comparator.ComparatorNombre;
import com.epidata.juego.enfrentable.*;

public class Juego 
{
	/*
	 * Opcional. Chequear que el ordenarPesonajes no retorne Personajes repetidos. 
	 * Considere lo métodos adicionales que necesite para controlar la condición.
	 * */
	private ArrayList<Enfrentable> enfrentables;
	//MÉTODOS FINALIZADOS
	public Juego() {
		super();
		enfrentables = new ArrayList<Enfrentable>();
	}
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
    //GETTERS AND SETTERS    
    public ArrayList<Enfrentable> getEnfrentables() {
		return enfrentables;
	}
	public void setEnfrentables(ArrayList<Enfrentable> enfrentables) {
		this.enfrentables = enfrentables;
	}
	
	//TODO: Métodos por terminar	
	public Enfrentable Enfrentar(Enfrentable e1, Enfrentable e2) {
		
		return e2;
    }	
	
    //TODO: *opcional -> evitar que retorne personajes repetidos.
    public ArrayList<Personaje> ordenarPersonajes(Comparador c){
    	ArrayList<Personaje> personajesAOrdenar = new ArrayList<Personaje>();
     	//puedo crear una nueva función que retorne los personajes usando getPersonajes que es protected
    	Collections.sort(personajesAOrdenar, c);
    	return personajesAOrdenar;
    }
    
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
    	System.out.println("se ha creado el juego");
    	//crear los atributos
    	//--simples
    	AtributoSimple ataque10 = new AtributoSimple(10);
    	AtributoSimple ataque20 = new AtributoSimple(20);
    	AtributoSimple ataque30 = new AtributoSimple(30);
    	AtributoSimple defensa = new AtributoSimple(10);
    	AtributoSimple velocidad = new AtributoSimple(10);
    	AtributoSimple agilidad = new AtributoSimple(15);
    	//--Operacion
    	AtributoOperacion vida = new AtributoOperacion("Defensa", "Velocidad");
    	//--Condicional
    	AtributoCondicional destreza = new AtributoCondicional("Velocidad", "Agilidad", velocidad, agilidad);
    	
    	//creamos personajes
    	Personaje claudia = new Personaje("Claudia", "Clau");
    	Personaje lucho = new Personaje("Lucho", "Kurgan");
    	Personaje ayelen = new Personaje("Ayelen", "Aye");
    	Personaje tomas = new Personaje("Tomas", "Tomi");
    	Personaje ami = new Personaje("Amilcar", "Ami");
    	Personaje carlos = new Personaje("Carlos", "Carlitos");
    	
    	//les damos atributos
    	claudia.addAtributo("Ataque", ataque10);
    	lucho.addAtributo("Ataque", ataque20);
    	ayelen.addAtributo("Ataque)", ataque10);
    	tomas.addAtributo("Ataque", ataque20);
    	ami.addAtributo("Ataque", ataque20);
    	carlos.addAtributo("Ataque", ataque20);
    	
    	//creamos ligas
    	Liga ligaSosa = new Liga("Liga", "Sosa");
    	Liga ligaCrespi = new Liga("Liga", "Crespi");
    	
    	//creamos la estructaura de ligas y personajes
    	juego.addEnfrentable(claudia);
    	juego.addEnfrentable(lucho);
    	juego.addEnfrentable(ligaSosa);
    	
    	ligaSosa.addIntegrante(ayelen);
    	ligaSosa.addIntegrante(ligaCrespi);
    	
    	ligaCrespi.addIntegrante(ami);
    	ligaCrespi.addIntegrante(tomas);
    	ligaCrespi.addIntegrante(carlos);

    	juego.ordenarPersonajes(new ComparatorNombre()).forEach( el -> {
    		System.out.println(el.getNombre());
    	});
    	    	
   }
}
