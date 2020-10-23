package it.eforhum.corsojava.oop.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fattura {

	private static Logger log = LogManager.getLogger(Fattura.class);
	
	private static final int MAX_FATTURA = 1000;
	private static double totaleFatture;
	
	private double importo;
	
	static {
		
		log.debug("Porzione di codice statica, richiamata prima dell'istanza della classe");
	}
	
	public Fattura(double importo) {
		
		log.debug("Creato oggetto fattura con importo " + importo);
		
		if (importo < MAX_FATTURA) {

			this.importo = importo;
			Fattura.totaleFatture += this.importo;
			
		} else {
			log.warn("Si è cercato di registrare una fattura con valore superiore al massimo impostato!");
		}
		
		
		log.debug("Il totale fatture al momento ammonta a " + totaleFatture);
	}
	
	public double getImporto() {
		return importo;
	}
	
	public static double getTotaleFatture() {
		return totaleFatture;
	}
}
