package it.eforhum.corsojava.oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainExceptions {
	
/*
                   +-----------+
                   | Throwable |
                   +-----------+
                    /         \
                   /           \
          +-------+          +-----------+
          | Error |          | Exception |
          +-------+          +-----------+
           /  |  \           /     |        \
          \________/        \______/         \
                            
           unchecked        checked          
                                    +------------------+
                                    | RuntimeException |
                                    +------------------+
                                      /   |    |      \
                                     \_________________/
                       
                                         unchecked 
*/

	private static Logger log = LogManager.getLogger(MainExceptions.class);
	
	public static void main(String[] args) {
		
		uncheckedExceptions();
		
		checkedExceptions();
		
//		propagazione delle eccezioni all'interno di metodi di classi richiamate
//		costruiamo insieme un esempio di classe che rilancia un eccezione a fronte di un'operazione non andata a buon fine
//		usiamo la classe CustomException per aiutarci
		
	}

	private static void uncheckedExceptions() {

		log.info("Esempio di unchecked exceptions ");
		
		int[] valori = {0, 100,0};

		log.debug("Provo ad assegnare all'ultimo elemento dell'array il risultato dell'operazione");
		valori[2] = 100 / valori[1];
		
		log.debug("Risultato operazione: " + valori[2]);
		
	}

	private static void checkedExceptions() {

		log.info("Esempio di checked exceptions ");
		
		String filePath = "c:\\temp\\prova.txt";
		
		File file = new File(filePath);
		
		log.debug("Il file " + filePath + " esiste? " + file.exists());
		
		log.debug("La dimensione del file è (byte) " + file.length());
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			
			log.debug("Nella prima riga del file c'è scritto");
			log.debug(line);
			
		} catch (FileNotFoundException e) {
//			casistica da gestire
		} catch (IOException e) {
//			casistica da gestire
		}
	}
}
