public class DispositivoSenzaPercentualeException extends Exception{


    public DispositivoSenzaPercentualeException() {
        super("Il dispositivo non ha un parametro in percentuale da modificare");
    }

    @Override
    public String toString() {
        return getMessage();
    }
}