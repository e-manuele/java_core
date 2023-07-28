/**
 * Rappresenta la calusola sui servizi richiesti dal cliente per l'automobile noleggiata
 * @author sebastianrodriguez
 *
 */
public class Servizi {

	
	private TipiServizi servizioRichiesto;
	private double prezzo;
	
	/**
	 * Costruttore dei servizi
	 * @param servizioRichiesto
	 * @param prezzo
	 */
	public Servizi(TipiServizi servizioRichiesto, double prezzo) {
		this.servizioRichiesto = servizioRichiesto;
		this.prezzo = prezzo;
	}

	public TipiServizi getServizioRichiesto() {
		return servizioRichiesto;
	}

	public void setServizioRichiesto(TipiServizi servizioRichiesto) {
		this.servizioRichiesto = servizioRichiesto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
