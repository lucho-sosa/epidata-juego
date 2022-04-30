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
		float valor = e.getValorAtributo(key1) * e.getValorAtributo(key2);
		return valor;
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	@Override
	public String toString() {
		return "AtributoOperacion [key1=" + key1 + ", key2=" + key2 + "]";
	}
	
	
}
