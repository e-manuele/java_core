public class Luce extends DispositivoConPercentuale {
    public Luce(String nome,String stanza ) {
        super(nome,stanza);
    }

    public Luce(String nome,String stanza ,StatoDispositivo statoDispositivo) {
        super(nome,stanza, statoDispositivo);
    }
     public Luce(String nome,String stanza, StatoDispositivo statoDispositivo, int percentualePotenza) {
            super(nome, stanza, statoDispositivo, percentualePotenza);
        }
    public String toString(){
       return "Nome luce: "+ this.getNome() +
               " nella stanza: "+ this.getStanza() +
               " ed il dispositivo è: " + this.getStatoDispositivo() +
               " con percentuale potenza: "+ getPercentuale() + "\n";

    }
}
