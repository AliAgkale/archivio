package it.eforhum.corsojava.oop.bean;

public class Singleton {

	private static Singleton instance;
	
//	come seconda alternativa abbiamo la creazione dell'istanza direttamente nella dichiarazione statica della variabile
//	private static Singleton instance = new Singleton();

	private String property;
	
	private Singleton() {
		
//		rendo privato il costruttore in modo da non poter essere richiamato dall'esterno
	}
	
	public static Singleton getInstance() {
		
		if (instance == null) {
			
			instance = new Singleton();
		}
		
		return instance;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}
	
}
