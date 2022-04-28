package com.epidata.juego.comparator;

import java.util.Comparator;

import com.epidata.juego.enfrentable.Enfrentable;

public interface Comparador extends Comparator<Enfrentable>{
	public int compare(Enfrentable e1, Enfrentable e2);
}
