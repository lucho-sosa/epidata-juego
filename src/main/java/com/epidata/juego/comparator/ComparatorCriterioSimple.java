package com.epidata.juego.comparator;

import com.epidata.juego.enfrentable.Enfrentable;

public class ComparatorCriterioSimple implements Comparador {
	
	private String atributo;

	@Override
	public int compare(Enfrentable e1, Enfrentable e2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ComparatorCriterioSimple(String atributo) {
		super();
		this.atributo = atributo;
	}
}
