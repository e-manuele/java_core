import java.util.ArrayList;

public class GestoreDispositivi {
    private ArrayList<Dispositivo> dispositivi;
    public GestoreDispositivi(){
        dispositivi = new ArrayList<Dispositivo>();

    }

    public GestoreDispositivi(Dispositivo dispositivo){
        dispositivi = new ArrayList<Dispositivo>();
        dispositivi.add(dispositivo);
    }

    public void aggiungiDispositivo(Dispositivo dispositivo) {
        dispositivi.add(dispositivo);
    }
    public void statoImpianto() {
        for (Dispositivo i : dispositivi) {
            System.out.println(i);
        }
    }

    /**
     *
     */
    public void configuraCasa(){
        for(int i = 0; i < ListaDispositiviComprati.elencoDispositivi.length; i++) {
            dispositivi.add(ListaDispositiviComprati.elencoDispositivi[i]);
        }
    }
    public void configuraCasa(ArrayList<DispositivoConPercentuale> arrayListDispositivi){
        for(int i = 0; i < ListaDispositiviComprati.elencoDispositivi.length; i++) {
                dispositivi.add(ListaDispositiviComprati.elencoDispositivi[i]);
            }
        for(DispositivoConPercentuale i : arrayListDispositivi){
            aggiungiDispositivo(i);
        }
    }
    public void modificaPercentuale(Dispositivo dispositivo, int percentuale)throws PercentualeNonCorrettaException,DispositivoSpentoException{
        try {
            dispositivo.setPercentuale(percentuale);
        } catch (PercentualeNonCorrettaException e) {
            throw new RuntimeException(e);
        } catch (DispositivoSpentoException e1) {
            throw new RuntimeException(e1);
        } catch (DispositivoSenzaPercentualeException e) {
            throw new RuntimeException(e);
        }
    }

    /** invia il comando di accendi e spegni o altri comandi senza parametri da implementare
     * @param nomeDispositivo utilizza il nome per identifcare nella lista il dispositivo
     * @param comando
     */
    public void inviaComando(String nomeDispositivo,String comando){
        for(Dispositivo i: dispositivi){
            if( i.getNome() == nomeDispositivo){
                switch(comando){
                    case "spegni":
                        i.setStatoDispositivo( StatoDispositivo.SPENTO);
                    case "accendi":
                        i.setStatoDispositivo( StatoDispositivo.ACCESO);
                }
            }
        }}

    /** invia il comando di cambiare la percentuale e da eccezione se la percentuale non è corretta,
     *  possibile modifica anche con valori diversi da percentuale
     * aumentando il case
     * @param nomeDispositivo stringa con il nome del dispositivo
     * @param comando
     * @param percentuale
     * @throws PercentualeNonCorrettaException
     * @throws DispositivoSpentoException
     */
    public void inviaComando(String nomeDispositivo,String comando, int percentuale) throws PercentualeNonCorrettaException, DispositivoSpentoException {
        for(Dispositivo i: dispositivi){
            if( i instanceof DispositivoConPercentuale ){
            if( i.getNome() == nomeDispositivo){
                switch(comando){
                    case "modifica percentuale":
                        modificaPercentuale(i,  percentuale);
                }
            }
        }}}

    /** comando da utilizzare nel caso in cui il dispositrivo necessiti di autorizzazione
     * @param nomeDispositivo
     * @param comando
     * @param utente
     * @param password
     * @throws UtenteNonAutenticatoException
     */
    public void inviaComandoConAutenticazione(String nomeDispositivo,String comando,String utente,String password) throws UtenteNonAutenticatoException {
        for(Dispositivo i: dispositivi){
            if( i.getNome() == nomeDispositivo){
                switch(comando){
                    case "spegni":
                        i.setStatoDispositivo( utente, password,StatoDispositivo.SPENTO);
                    case "accendi":
                        i.setStatoDispositivo(utente, password, StatoDispositivo.ACCESO);
                }
            }
        }}



    //
}
