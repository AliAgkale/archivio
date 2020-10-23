package it.eforhum.corsojava.oop.bean;

public class Coordinate {

	private int x;
	private int y;

//	ricordare che di default viene richiamato il costruttore della superclasse, in questo caso quello di Object
	public Coordinate(int x, int y) {
		
//		super(); chiamata al costruttore della superclasse è implicito e è la prima istruzione
		this.x = x;
		this.y = y;
	}
	
	public static Coordinate getInstance(int x, int y) {
		
		Coordinate instance = new Coordinate(x, y);
		
		return instance;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
