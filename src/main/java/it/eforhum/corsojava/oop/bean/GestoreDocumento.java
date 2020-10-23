package it.eforhum.corsojava.oop.bean;

import java.util.ArrayList;
import java.util.List;

import it.eforhum.corsojava.oop.enums.StatoDocumento;

public class GestoreDocumento {

	private List<Documento> documentList = new ArrayList();
	
	public void addDocumento(Documento doc) {

//		l'id del documento viene valorizzato direttamente nell'oggetto
//		se volessi creare una sequenza all'interno del mio applicativo come dovrei fare???
//		proviamo a ragionare sulle visibilità che le variabili hanno in memoria
		
		this.documentList.add(doc);
	}
	
	public boolean approvaDocumento(int id) {
		
		for(Documento doc : this.documentList) {
			
			if (doc.getId() == id) {
//				elemento trovato, vado a modificare lo stato del documento
				doc.setStato(StatoDocumento.APPROVATO);
			}
		}
		
		return false;
	}

	public boolean annullaDocumento(int id) {
		
		for(Documento doc : this.documentList) {
			
			if (doc.getId() == id) {
//				elemento trovato, vado a modificare lo stato del documento
				doc.setStato(StatoDocumento.ANNULLATO);
			}
		}
		
		return false;
	}

	public List<Documento> getDocumentList() {
		
//		viene restituita la lista interna
//		cosa succede se il chiamante la modifica???
		return this.documentList;
	}
}
