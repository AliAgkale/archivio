package it.eforhum.corsojava.oop;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.eforhum.corsojava.oop.bean.Docente;
import it.eforhum.corsojava.oop.bean.Persona;
import it.eforhum.corsojava.oop.bean.Studente;

public class MainInheritance {

	private static Logger log = LogManager.getLogger(MainInheritance.class);
	
	public static void main(String[] args) {
		
		log.info("Inizio Applicazione");
		
		//2 opzioni
		Studente p1 = new Studente("mario", "rossi", "M00991");
		Persona p2 = new Studente("anna", "verdi", "M00888");
		
		System.out.println("Matricola p1"+p1.getMatricola());
		System.out.println("Matricola p2"+((Studente)p2).getMatricola());
		
		Docente p3 = new Docente("marco", "conti", "informatica");
		Docente p4 = new Docente("mauro", "santini", "elettronica");
		
		System.out.println("Materia p3"+((Docente)p3).getMateria());
		System.out.println("Materia p4"+((Docente)p4).getMateria());

		
//		p3 = p2;
//		p3.stampaCompleta();
		
		List<Persona> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
		for (Persona persona : list) {
			
			log.debug("L'elemento della lista è di tipo...");
//			stampare la tipologia dell'elemento persona
			
			String nomeClasse=persona.getClass().getName();
			log.debug(nomeClasse);
			
//			log.debug(persona.getClass().getTypeName());
			
			if(persona instanceof Studente) {
				log.debug("Studente");
			}
			else if(persona instanceof Docente) {
				log.debug("Docente");
			}
			else {
				log.debug("Persona");
			}
			
			persona.stampaCompleta();
			
			
		}
		
		log.info("Fine Applicazione");
	}
}
