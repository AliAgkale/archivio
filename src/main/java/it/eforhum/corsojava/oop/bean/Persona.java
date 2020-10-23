package it.eforhum.corsojava.oop.bean;

// abilitare la parola final per vedere cosa succede
public class Persona {

	private String nome;
	private String cognome;
	private String codiceFiscale;
	private Abitazione abitazione;
	private Recapito recapito;
	
	public Persona(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;
	}

//	esempio di modificatore "protected"
	protected String getCodiceFiscale() {
		return this.codiceFiscale;
	}

	public Abitazione getAbitazione() {
		return abitazione;
	}

	public void setAbitazione(Abitazione abitazione) {
		this.abitazione = abitazione;
	}

	public Recapito getRecapito() {
		return recapito;
	}
	
	public void setRecapito(Recapito recapito) {
		this.recapito = recapito;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	public void stampaCompleta() {
		
		System.out.println("Stampa completa della persona");
		System.out.println("Nome: "+this.nome);
		System.out.println("Cognome: "+this.cognome);
		System.out.println("Codice Fiscale: "+this.codiceFiscale);
//		this.abitazione.stampaIndirizzo();
//		this.recapito.stampaRecapito();
	}
	
//  in questo esempio meglio avere la classe "public" o "private"???
//	se diventa "private" cosa devo modificare?
	public class Abitazione {

		private String indirizzo;
		private String cap;
		private String citta;

		public Abitazione(String indirizzo, String cap, String citta) {

			this.indirizzo = indirizzo;
			this.cap = cap;
			this.citta = citta;
			
		}

		public String getIndirizzo() {
			return indirizzo;
		}

		public String getCap() {
			return cap;
		}

		public String getCitta() {
			return citta;
		}

		public void stampaIndirizzo() {
			
			StringBuilder sb = new StringBuilder();
			sb.append(nome + " " + cognome).append("\n");
			sb.append("abita in: ").append(indirizzo).append("(").append(cap).append(")\n");
			sb.append("citta: ").append(citta);

			System.out.println(sb);
		}
	}
	
	public static class Recapito {
		
		private String prefisso;
		private String numero;
		private TipoRecapito tipoRecapito;
		
		public Recapito(String prefisso, String numero, TipoRecapito tipoRecapito) {
			
			this.prefisso = prefisso;
			this.numero = numero;
			this.tipoRecapito = tipoRecapito;
		}
		
		public void stampaRecapito() {
			
			StringBuilder sb = new StringBuilder();
//			in questo caso non abbiamo la possibilità di accedere alle variabili di istanza della classe Persona
//			sb.append(nome + " " + cognome).append("\n"); //ambito statico, non ha visibilità
			sb.append("contatto: ").append(tipoRecapito).append("\n");
			sb.append("numero: ").append(prefisso).append(numero);

			System.out.println(sb);
			
		}
	}
	
	public enum TipoRecapito {
		
		CELLULARE,
		NUMERO_FISSO
	}
}
