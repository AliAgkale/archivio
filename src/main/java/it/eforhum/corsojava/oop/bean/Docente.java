package it.eforhum.corsojava.oop.bean;

public class Docente extends Persona {

	private String materia;
	
	public Docente(String nome, String cognome, String materia) {
		super(nome, cognome);
//		this(materia);
		this.materia = materia;
	}
	
	public Docente(String materia) {
		super("", "");
		this.materia = materia;
	}
	
	@Override
	public void stampaCompleta() {
		
		// TODO completare...vedi classe Studente
		System.out.println("stampa completa del docente");
		super.stampaCompleta();
		System.out.println("Materia: "+this.materia);
		
	}

	public String getMateria() {
		return materia;
	}
}
