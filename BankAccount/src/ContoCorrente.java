import java.util.ArrayList;
import java.util.Objects;

public class ContoCorrente {

    private double saldo;
    private Utente utente;

    public double getSaldo() {
        return saldo;
    }

    public Utente getUtente() {
        return utente;
    }



    private ArrayList<OperazioneConto> operazioneConto;

    public ContoCorrente(Utente utente) {
        this.saldo = 0;
        this.utente = utente;
        this.operazioneConto = new ArrayList<OperazioneConto>();

    }

    public void operazione(String tipoOperazine ,double quantita) throws Exception {
        operazioneConto.add(new OperazioneConto(tipoOperazine, quantita));
        if(Objects.equals(tipoOperazine, "versamento")){
            saldo = saldo + quantita;
        }else {
            if (quantita > saldo){
                throw new RuntimeException("La quantita richiesta è maggiore di quella presente");
            }
            saldo = saldo - quantita; /// throws

        }
    }



    public String getOperazioniConto() {
        String operazioni = "Ultimi 5 movimenti: \n";

        for (int i = 0; i < 5; i++) {
            operazioni += "\t" + operazioneConto.get(operazioneConto.size() - i - 1) + "\n";
        }
        return operazioni;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "saldo=" + saldo +
                ", utente=" + utente +
                ", operazioneConto=" + operazioneConto +
                '}';
    }
}
/*
inserisci utente mario luigi
ContoCorrente{saldo=0.0, utente=Utente: nome='mario', cognome='luigi', operazioneConto=[]}
operazione utente mario luigi versamento 20
Opzione non valida
operazione utente mario luigi versamento 20.0
 */