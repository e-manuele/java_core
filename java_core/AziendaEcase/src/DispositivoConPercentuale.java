public class DispositivoConPercentuale extends Dispositivo{
    private int percentuale;
    public DispositivoConPercentuale(String nome,String stanza) {
        super(nome,stanza);
    }
    public DispositivoConPercentuale(String nome,String stanza, StatoDispositivo statoDispositivo) {
        super(nome,stanza, statoDispositivo);
    }


    public DispositivoConPercentuale(String nome,String stanza, StatoDispositivo statoDispositivo, int percentuale) {
        super(nome, stanza, statoDispositivo);
        this.percentuale = percentuale;
    }


    public int getPercentuale() {
        return percentuale;
    }

    /**
     * @param percentuale
     * @throws PercentualeNonCorrettaException
     * @throws DispositivoSpentoException
     */
    public void setPercentuale(int percentuale) throws PercentualeNonCorrettaException,DispositivoSpentoException{
        try{
            if(this.getStatoDispositivo() ==StatoDispositivo.ACCESO){
                try {
                    if (percentuale < 100 && percentuale > 0){
                        this.percentuale = percentuale;
                    }else {
                        throw new PercentualeNonCorrettaException();
                    }}
                catch (PercentualeNonCorrettaException e) {
                    System.out.println(e.toString());
                }
            } else {
                throw new DispositivoSpentoException();
            }}catch (DispositivoSpentoException e){
            System.out.println(e.toString());
        }
        }
    public String toString(){
        return "Nome dispositivo: "+ this.getNome() +
                " di tipo: "+ this.getClass()+
                " nella stanza: "+ this.getStanza() +
                " ed il dispositivo è: " + this.getStatoDispositivo() +
                " con percentuale potenza: "+ getPercentuale()+ "\n";

    }
}
