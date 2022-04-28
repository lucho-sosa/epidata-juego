package com.epidata.juego.atributo;

import com.epidata.juego.enfrentable.Enfrentable;

public class AtributoOperacion implements Atributo {
	/*
	 * Esto representa de ejemplo Resistencia en el que hay que realizar un cálculo entre dos valores.
	 * Tengan en cuenta que abstraer al AtributoOperacion de la realización de esa operación.
	 * */
	protected String key1;
	protected String key2;
	
	public AtributoOperacion(String key1, String key2) {
		super();
		this.key1 = key1;
		this.key2 = key2;
	}

	@Override
	public float getValor(Enfrentable e) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
