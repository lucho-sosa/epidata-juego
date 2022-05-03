package com.epidata.juego.comparator;

import com.epidata.juego.enfrentable.Enfrentable;

public class ComparatorNombre implements Comparador{

	@Override
	public int compare(Enfrentable e1, Enfrentable e2) {
		return e1.getNombre().compareTo(e2.getNombre());
	}
}
