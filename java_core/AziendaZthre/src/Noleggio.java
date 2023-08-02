import java.util.Calendar;
import java.util.List;

/**
 * Rappresenta il noleggio delle automobili da parte di un cliente
 * @author sebastianrodriguez
 *
 */
public class Noleggio {


	static final double COSTO_EXTRA = 0.2;
	
	private Calendar dataInizioNoleggio;
	private Calendar dataFineNoleggio;
	private List<Servizi> listaClausole;
	private StatoNoleggio stato;
	private Automobile autoNoleggiata;
	private Cliente clienteRichiedente;
	private long chilometraggioMassimo;
	
	
	/**
	 * Costruttore noleggio 
	 */
	public Noleggio(List<Servizi> listaClausole, Calendar dataFineNoleggio, Automobile autoNoleggiata, Cliente clienteRichiedente) {
		this.setDataInizioNoleggio(Calendar.getInstance());
		this.setDataFineNoleggio(dataFineNoleggio);
		this.listaClausole = listaClausole;
		this.stato = StatoNoleggio.ATTIVO;
		this.autoNoleggiata = autoNoleggiata;
		this.clienteRichiedente = clienteRichiedente;
	}

	

	public List<Servizi> getListaClausole() {
		return listaClausole;
	}

	public void setListaClausole(List<Servizi> listaClausole) {
		this.listaClausole = listaClausole;
	}

	public StatoNoleggio getStato() {
		return stato;
	}

	public void setStato(StatoNoleggio stato) {
		this.stato = stato;
	}

	public Automobile getAutoNoleggiata() {
		return autoNoleggiata;
	}

	public void setAutoNoleggiata(Automobile autoNoleggiata) {
		this.autoNoleggiata = autoNoleggiata;
	}

	public Cliente getClienteRichiedente() {
		return clienteRichiedente;
	}

	public void setClienteRichiedente(Cliente clienteRichiedente) {
		this.clienteRichiedente = clienteRichiedente;
	}

	public long getChilometraggioMassimo() {
		return chilometraggioMassimo;
	}

	public void setChilometraggioMassimo(long chilometraggioMassimo) {
		this.chilometraggioMassimo = chilometraggioMassimo;
	}



	public Calendar getDataInizioNoleggio() {
		return dataInizioNoleggio;
	}



	public void setDataInizioNoleggio(Calendar dataInizioNoleggio) {
		this.dataInizioNoleggio = dataInizioNoleggio;
	}



	public Calendar getDataFineNoleggio() {
		return dataFineNoleggio;
	}



	public void setDataFineNoleggio(Calendar dataFineNoleggio) {
		this.dataFineNoleggio = dataFineNoleggio;
	}
	
	
	
}
