import java.util.ArrayList;
import java.util.Calendar;

public class Allarme extends Dispositivo {
    private String password;
    private String utente;
    private ArrayList<String> log;

    public Allarme(String nome, String stanza, StatoDispositivo statoDispositivo, String utente, String password) {
        super(nome, stanza, statoDispositivo);
        this.utente = utente;
        this.password = password;
        log = new ArrayList<>();
        log.add(Calendar.getInstance().getTime().toString() + " Allarme creato da " + utente);
    }
    public boolean autentica(String utente, String password) {
            if (this.utente == utente && this.password == password) {
                return true;
            } else {
                return false;
            }
    }


    public void setStatoDispositivoConAutenticazione(String utente, String password, StatoDispositivo statoDispositivo) throws UtenteNonAutenticatoException {
        try {
            if (autentica( utente,  password)) {
                this.setStatoDispositivo(utente, password, statoDispositivo);
                log.add(Calendar.getInstance().getTime().toString() + " Stato allarme settato su: " + statoDispositivo + " da " + utente);
            } else {
                log.add(Calendar.getInstance().getTime().toString() + " Tentativo di accesso fallito: " + utente + " " + password);
                throw new UtenteNonAutenticatoException();
            }
        } catch (UtenteNonAutenticatoException e) {
            System.out.println(e.toString());
        }
    }
    public void mostraLog(String utente, String password){
        try{
            if (autentica(utente, password)){
                for(String i:  this.log){
                    System.out.println(i);
        }}else {
                    log.add(Calendar.getInstance().getTime().toString() + " Tentativo di accesso fallito: " + utente + " " + password);
                    throw new UtenteNonAutenticatoException();
                }
            } catch (UtenteNonAutenticatoException e) {
                System.out.println(e.toString());
            }
        }
}




// calendar.getTime()
