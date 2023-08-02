import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 * Rappresenta la gestione dei i noleggi attivi/inattivi
 * @author sebastianrodriguez
 *
 */
public class GestoreNoleggio {

	private List<Noleggio> listaNoleggi;
	
	/**
	 * Estraggo dal parco auto i veicoli diponibili
	 */
	public List<Automobile> veicoliDisponibili() throws AutoNonDisponibiliException {
		List<Automobile> automobiliDisponibili = new ArrayList<Automobile>();
		
		try {
			if(!ParcoAuto.parcoAutomobili.equals(null)) {
			for(int i = 0; i < ParcoAuto.parcoAutomobili.length; i++) {
				if(ParcoAuto.parcoAutomobili[i].getStatoAuto().equals(StatoOccupazione.DISPONIBILE)) {
					automobiliDisponibili.add(ParcoAuto.parcoAutomobili[i]);
				}
			}
		
		return automobiliDisponibili;
			} else {
				throw new AutoNonDisponibiliException();
			}
		} catch (AutoNonDisponibiliException e) {
			System.out.println(e.toString());
		}
	
		return null;
	}
	
	/**
	 * Calcolo il preventivo di un noleggio in base al cliente, ai servizi che esso richiede
	   e al numero di mesi richiesti
	 * @param c, Cliente richiedente 
	 * @param ls, lista di servizi. può essere nulla
	 * @param mesi, numero di mesi maggiore di 0
	 * @param auto, numero dell'automobile nel parco auto. deve essere maggiore o uguale a zero
	 * @return ammontare, il prezzo totale. Dev'essere maggiore di zero
	 */
	public double preventivoNoleggio(Cliente c, List<Servizi> ls, int mesi, int auto) {
		assert(mesi > 0 && auto >=0);		
		//preventivo calcolato su una specifica auto presa dal parco auto ParcoAuto.parcoAuto[auto].
		Noleggio preventivoNoleggio = new Noleggio(ls, Calendar.getInstance(), ParcoAuto.parcoAutomobili[auto], c);
		double ammontare = 0.0;
		ammontare = preventivoNoleggio.getAutoNoleggiata().getCostoRataMensile()*mesi;
		
		for(Servizi s : preventivoNoleggio.getListaClausole()) {
			ammontare += s.getPrezzo(); 
		}
		
		return ammontare;
	}
	

	/**
	 * Calcolo la rata base di un automobile in base al numero di mesi voluti
	 * @param auto, intero che estrae l'automobile dal parco auto. deve essere maggiore o uguale a zero
	 * @param mesi, intero diverso da 0 che rappresenta il numero di mesi 
	 */
	public double memorizzaRataBase(int auto, int mesi) {
		assert(mesi > 0 && auto >=0);
		
		double ammontareRataBase= 0.0;
		
		 ammontareRataBase += ParcoAuto.parcoAutomobili[auto].getCostoRataMensile() * mesi;
		
		return ammontareRataBase;
	}
	
	/**
	 * Estraggo le automobili riscattate e salvo la data del riscatto
	 * @param n, noleggio effettuato dal cliente
	 */
	public void memorizzaRiscatto(Noleggio n) {
		HashMap<Automobile, LocalDate> memorizzatoreAutomobiliRiscattate = new HashMap<Automobile, LocalDate>();
		
		if(n.getClienteRichiedente().isVolonntaRiscatto()==true) {
			System.out.println(n.getAutoNoleggiata().getCostoRiscatto());
			memorizzatoreAutomobiliRiscattate.put(n.getAutoNoleggiata(), LocalDate.now());
		}
		
	}
	
	/**
	 * Memorizzo il prezzo dell'automobile associato alle rate optional associate e al numero di mesu
	 * @param mesi
	 * @return
	 */
	public double memorizzaRataOptional(int mesi) {
		assert(mesi>0);
		List<Double> listaAmmontareOptional = new ArrayList<Double>();
		Double ammontareOptional = 0.0;
		for(Noleggio n: listaNoleggi) {
			ammontareOptional = n.getAutoNoleggiata().getCostoRataMensile() * mesi;
			for (Servizi s: n.getListaClausole()) {
				ammontareOptional += s.getPrezzo();
				listaAmmontareOptional.add(ammontareOptional);
			}
			ammontareOptional = 0.0;
		}
		
		return 0.0;
	}


	/**
	 * Estraggio e successivamente elimino dalla lista il noleggio e calcolo il costo finale 
	 * @param n, noleggio che si vuole chiudere
	 * @return costo finale, double che indica il prezzo totale del noleggio
	 */
	public double chiusuraNoleggio(Noleggio n) {
		
		double costoFinale = 0;
		//modifiche al codice in modo che verifichi la durata effettiva del noleggio con quella della durata finale
		//applicando il 30% di sconto 
		double scontoRescissioneNoleggio = 0.30;
		
		//non presente la parte con lo sconto del 30%
		for (Noleggio noleggio : listaNoleggi) {
			if(noleggio.equals(n)) {
				if(n.getChilometraggioMassimo() < n.getClienteRichiedente().getChilometriPercorsi()) {
					double costoExtra = Noleggio.COSTO_EXTRA * (n.getChilometraggioMassimo() - n.getClienteRichiedente().getChilometriPercorsi());
					costoFinale =   costoExtra  * n.getAutoNoleggiata().getCostoRataMensile();//n.getDataFineNoleggio() *
				}
				
				listaNoleggi.remove(n);
			}
		}
		
		return costoFinale;
		
	}
	
	
}
