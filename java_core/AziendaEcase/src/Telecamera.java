public class Telecamera extends Dispositivo{
    private  ModalitaAttivazione modalitaRegistrazione;
    private boolean streaming;
    private boolean registrazione;
    public Telecamera(String nome, String stanza, StatoDispositivo statoDispositivo) {
        super(nome, stanza, statoDispositivo);
        this.modalitaRegistrazione = ModalitaAttivazione.CONMOVIMENTO;
    }

    public ModalitaAttivazione getModalitaRegistrazione() {
        return modalitaRegistrazione;
    }

    public void setModalitaRegistrazione(ModalitaAttivazione modalitaRegistrazione) {
        this.modalitaRegistrazione = modalitaRegistrazione;
    }

    public boolean isStreaming() {
        return streaming;
    }

    public void setStreaming(boolean streaming) {
        this.streaming = streaming;
    }

    public boolean isRegistrazione() {
        return registrazione;
    }

    public void setRegistrazione(boolean registrazione) {
        this.registrazione = registrazione;
    }
}
