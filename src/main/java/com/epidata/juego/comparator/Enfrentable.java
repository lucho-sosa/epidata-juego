package com.epidata.juego.comparator;

import java.util.Comparator;

public interface Enfrentable extends Comparator<Object>{
	public int compare(Enfrentable e1, Enfrentable e2);
}
