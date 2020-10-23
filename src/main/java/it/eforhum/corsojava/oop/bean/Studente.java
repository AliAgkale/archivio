package it.eforhum.corsojava.oop.bean;

public class Studente extends Persona {

	private String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		
		super(nome, cognome);
		this.matricola = matricola;
		
	}
	
//	esempio di modifica del modifiers del metodo
//	esempio con metodi statici (posso eseguire l'override di un metodo statico?)
//	esempio con ridefinizione del throws exception
	
	@Override
	public void stampaCompleta() {
		
		System.out.println("stampa completa dello studente");
//		come devo procere per completare l'implementazione???
		super.stampaCompleta();
		System.out.println("Matricola "+this.matricola);

	}

	public String getMatricola() {
		return matricola;
	}
	
	
	
}
