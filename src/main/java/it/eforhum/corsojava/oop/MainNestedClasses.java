package it.eforhum.corsojava.oop;

import it.eforhum.corsojava.oop.bean.Persona;

public class MainNestedClasses {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("mario", "rossi");
//		p1.setAbitazione(new Persona.Abitazione("via roma", "20100", "Milano"));
		p1.setAbitazione(p1.new Abitazione("via roma", "20100", "Milano"));//nested class, per forza riferirsi alla classe 'principale'
		p1.setRecapito(new Persona.Recapito("340", "1234567", Persona.TipoRecapito.CELLULARE));
		
		p1.getAbitazione().stampaIndirizzo();
		
		p1.getRecapito().stampaRecapito();
	}
}
