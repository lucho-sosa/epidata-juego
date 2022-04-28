package com.epidata.juego.comparator;

public class ComparatorCriterioSimple implements Enfrentable {
	
	private String atributo;
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

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
