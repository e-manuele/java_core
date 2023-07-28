/**
 * Rappresebta il clente che effettuerà il noleggio
 *  @author sebastianrodriguez
 *
 */
public class Cliente {

	private String nome;
	private String cognome;
	private String indirizzoEmail;
	private String numeroTelefonico;
	private long chilometriPercorsi;
	private boolean volonntaRiscatto;
	
	/**
	 * Costruttore cliente
	 * @param nome
	 * @param cognome
	 * @param indirizzoEmail
	 * @param numeroTelefonico
	 * @param chilometriPercorsi
	 */
	public Cliente(String nome, String cognome, String indirizzoEmail, String numeroTelefonico,
			long chilometriPercorsi) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzoEmail = indirizzoEmail;
		this.numeroTelefonico = numeroTelefonico;
		this.chilometriPercorsi = chilometriPercorsi;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzoEmail() {
		return indirizzoEmail;
	}

	public void setIndirizzoEmail(String indirizzoEmail) {
		this.indirizzoEmail = indirizzoEmail;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public long getChilometriPercorsi() {
		return chilometriPercorsi;
	}

	public void setChilometriPercorsi(long chilometriPercorsi) {
		this.chilometriPercorsi = chilometriPercorsi;
	}



	public boolean isVolonntaRiscatto() {
		return volonntaRiscatto;
	}



	public void setVolonntaRiscatto(boolean volonntaRiscatto) {
		this.volonntaRiscatto = volonntaRiscatto;
	}
	
	
	
}
