package com.epidata.juego.atributo;

import com.epidata.juego.enfrentable.Enfrentable;

public class AtributoSimple implements Atributo {
	
	private float value;
		
	public AtributoSimple(float value) {
		this.setValue(value);
	}
	
	@Override
	public float getValor(Enfrentable e) {
		return value;
	}
	
	public void setValor(float value) {
		this.setValue(value);
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
}
