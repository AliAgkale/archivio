package it.eforhum.corsojava.oop.bean;

import it.eforhum.corsojava.oop.enums.StatoDocumento;

public class Documento {

	private int id;
	private String cod;
	private String descrizione;
	private StatoDocumento stato;

	public Documento() {

	}
	
	public static Documento build(int id, String cod, String descrizione, StatoDocumento stato) {
		
		Documento doc = new Documento();
		doc.id = id;
		doc.cod = cod;
		doc.descrizione = descrizione;
		doc.stato = stato;
		
		return doc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public StatoDocumento getStato() {
		return stato;
	}

	public void setStato(StatoDocumento stato) {
		this.stato = stato;
	}

}
