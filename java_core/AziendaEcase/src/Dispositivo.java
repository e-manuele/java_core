public  class Dispositivo {
    private String nome;
    private String stanza;
    private StatoDispositivo statoDispositivo;
    public Dispositivo(String nome,String stanza) {
        this.stanza = stanza;
        this.nome = nome;
    }
    public Dispositivo(String nome,String stanza, StatoDispositivo statoDispositivo) {
        this.stanza = stanza;
        this.nome = nome;
        this.statoDispositivo = statoDispositivo;
    }
    public StatoDispositivo getStatoDispositivo() {
        return statoDispositivo;
    }

    public void setStatoDispositivo(StatoDispositivo statoDispositivo) {
        this.statoDispositivo = statoDispositivo;
    }
    public void setStatoDispositivo(String utente, String password, StatoDispositivo statoDispositivo) throws UtenteNonAutenticatoException {
        this.statoDispositivo = statoDispositivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPercentuale(int percentuale) throws PercentualeNonCorrettaException,DispositivoSpentoException,DispositivoSenzaPercentualeException{
        try{
            if(this.getStatoDispositivo() ==StatoDispositivo.ACCESO){
                try {
                    if (percentuale < 100 && percentuale > 0){
                        throw new DispositivoSenzaPercentualeException();
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
    public String getStanza() {
        return stanza;
    }

    public void setStanza(String stanza) {
        this.stanza = stanza;
    }
    public String toString(){
        return "Nome dispositivo: "+ this.getNome() +
                " di tipo: "+ this.getClass()+
                " nella stanza: "+ this.getStanza() +
                " ed il dispositivo è: " + this.getStatoDispositivo()+ "\n";

    }
}
