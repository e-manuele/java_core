import java.time.LocalDate;

public class OperazioneConto {
    LocalDate data;
    String tipoOperazione;

    double quantita;
    public OperazioneConto( String tipoOperazione, double quantita) {
        this.data = LocalDate.now();
        this.tipoOperazione = tipoOperazione;
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "OperazioneConto: " +
                "data=" + data +
                ", tipoOperazione='" + tipoOperazione + '\'' +
                ", quantita=" + quantita ;
    }
}
