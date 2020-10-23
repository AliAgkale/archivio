package it.eforhum.corsojava.oop;

import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.eforhum.corsojava.oop.bean.Coordinate;
import it.eforhum.corsojava.oop.bean.Fattura;

public class MainConstructors {

	private static Logger log = LogManager.getLogger(MainConstructors.class);
	
	public static void main(String[] args) {
		
		Coordinate istanza1 = new Coordinate(5, 10);
		
		Coordinate istanza2 = Coordinate.getInstance(7, 8);
		
//		esempio di metodo getInstance presente nelle classi fornite dalla JDK
		Calendar cal = Calendar.getInstance();
		
//		e se volessi usare solo il metodo statico per la costruzione delle istanze???
//		come devo modificare la classe Coordinate???
		
		Fattura fattura1 = new Fattura(99.99);
		Fattura fattura2 = new Fattura(198.99);
		Fattura fattura3 = new Fattura(1900.99);
		
		log.info("Totale delle fatture registrate: " + Fattura.getTotaleFatture());
		
	}
}
