package com.epidata.juego.comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorCompuesto implements Enfrentable{

	private ArrayList<Comparator> comparators;
	
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

	public ComparatorCompuesto(ArrayList<Comparator> comparators) {
		super();
		this.comparators = comparators;
	}

	public ComparatorCompuesto() {
		super();
	}
	
	public boolean addComparator(Comparator c) {
		return false;
	}
	
	public boolean addComparator(Comparator c, int index) {
		return false;
	}
	
}
