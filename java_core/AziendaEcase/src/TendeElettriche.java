public class TendeElettriche extends DispositivoConPercentuale{
    public TendeElettriche(String nome, String stanza, StatoDispositivo statoDispositivo) {
        super(nome, stanza, statoDispositivo);
    }

    public TendeElettriche(String nome, String stanza, StatoDispositivo statoDispositivo, int percentualePotenza) {
        super(nome, stanza, statoDispositivo, percentualePotenza);
    }
}
