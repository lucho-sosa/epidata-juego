package com.epidata.juego.rol;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import com.epidata.juego.atributo.Atributo;
import com.epidata.juego.atributo.AtributoCondicional;
import com.epidata.juego.atributo.AtributoOperacion;
import com.epidata.juego.atributo.AtributoSimple;
import com.epidata.juego.comparator.Comparador;
import com.epidata.juego.enfrentable.*;
import com.epidata.juego.errores.ExistAttrException;

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
		enfrentables = new ArrayList<Enfrentable>();
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
    	System.out.println("se ha creado el juego");
    	//crear los atributos
    	//--simples
    	AtributoSimple ataque = new AtributoSimple(10);
    	AtributoSimple defensa = new AtributoSimple(10);
    	AtributoSimple sabiduria = new AtributoSimple(10);
    	AtributoSimple velocidad = new AtributoSimple(10);
    	AtributoSimple agilidad = new AtributoSimple(15);
    	AtributoSimple conocimiento = new AtributoSimple(10);
    	//--Operacion
    	AtributoOperacion vida = new AtributoOperacion("Defensa", "Velocidad");
    	//--Condicional
    	AtributoCondicional destreza = new AtributoCondicional("Velocidad", "Agilidad", velocidad, agilidad);
    	
    	//creamos personajes
    	Personaje claudia = new Personaje("Claudia", "kurgan");
    	System.out.println("se ha creado el personaje Claudia");
    	claudia.addAtributo("Ataque", ataque);
    	claudia.addAtributo("Defensa", defensa);
    	claudia.addAtributo("Velocidad", velocidad);
    	claudia.addAtributo("Agilidad", agilidad);
    	claudia.addAtributo("Vida", vida);
    	claudia.addAtributo("Destreza", destreza);

    	//creamos ligas
    	Liga liga1 = new Liga("Liga 1", "Sosa");
    	Liga liga2 = new Liga("Liga 2", "Crespi");
    	Liga liga3 = new Liga("Liga 3", "Sosa2");
    	
    	//agreamos una liga y un personaje al juego
    	juego.addEnfrentable(claudia);
    	juego.addEnfrentable(liga1);
    	
    	claudia.getAtributos().forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v.getValor(claudia)));
    	
    	    	
    }
}
