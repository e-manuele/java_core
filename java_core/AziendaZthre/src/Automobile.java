/**
 * Rappresenta il veicolo da noleggiare
 * @author sebastianrodriguez
 *
 */
public class Automobile {

	private String marca;
	private String modello;
	private String annoImmatricolazione;
	private String targa;
	private long chilometraggio;
	private double costoRataMensile;
	private double costoRiscatto;
	private StatoOccupazione statoAuto;
	
	/**
	 * Costruttore automobile
	 * @param marca
	 * @param modello
	 * @param annoImmatricolazione
	 * @param targa
	 * @param chilometraggio
	 * @param costoRataMensile
	 * @param costoRiscatto
	 */
	public Automobile(String marca, String modello, String annoImmatricolazione, String targa, long chilometraggio,
			double costoRataMensile, double costoRiscatto) {
		
		this.marca = marca;
		this.modello = modello;
		this.annoImmatricolazione = annoImmatricolazione;
		this.targa = targa;
		this.chilometraggio = chilometraggio;
		this.costoRataMensile = costoRataMensile;
		this.costoRiscatto = costoRiscatto;
		this.statoAuto = StatoOccupazione.DISPONIBILE;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getAnnoImmatricolazione() {
		return annoImmatricolazione;
	}

	public void setAnnoImmatricolazione(String annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public long getChilometraggio() {
		return chilometraggio;
	}

	public void setChilometraggio(long chilometraggio) {
		this.chilometraggio = chilometraggio;
	}

	public double getCostoRataMensile() {
		return costoRataMensile;
	}

	public void setCostoRataMensile(double costoRataMensile) {
		this.costoRataMensile = costoRataMensile;
	}

	public double getCostoRiscatto() {
		return costoRiscatto;
	}

	public void setCostoRiscatto(double costoRiscatto) {
		this.costoRiscatto = costoRiscatto;
	}

	public StatoOccupazione getStatoAuto() {
		return statoAuto;
	}

	public void setStatoAuto(StatoOccupazione statoAuto) {
		this.statoAuto = statoAuto;
	}
	
}
