package it.eforhum.corsojava.oop;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.eforhum.corsojava.oop.bean.Documento;
import it.eforhum.corsojava.oop.bean.GestoreDocumento;
import it.eforhum.corsojava.oop.enums.StatoDocumento;

public class MainEnum {

	private static Logger log = LogManager.getLogger(MainEnum.class); 
	
	public static void main(String[] args) {
		
		log.info("Inizia l'applicazione");
		
		GestoreDocumento manager = new GestoreDocumento();
		
		manager.addDocumento(Documento.build(1, "00010", "documento 1", StatoDocumento.NUOVO));
		manager.addDocumento(Documento.build(2, "00020", "documento 2", StatoDocumento.NUOVO));
		manager.addDocumento(Documento.build(3, "00030", "documento 3", StatoDocumento.NUOVO));
		
		log.debug("Aggiunti 3 documenti alla lista principale");
		
		manager.approvaDocumento(1);
		manager.annullaDocumento(2);
		
		List<Documento> list = manager.getDocumentList();
		
		log.debug("Numero di documenti presenti in lista " + list.size());
		
//		dovrebbe essere possibile compiere questa operazione???
		list.remove(1);
		
		log.debug("Numero di documenti presenti in lista " + list.size());
		
		log.info("Termine dell'applicazione");
	}
}
