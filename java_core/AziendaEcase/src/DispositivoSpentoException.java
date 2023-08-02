public class DispositivoSpentoException extends Exception{


    public DispositivoSpentoException() {
        super("Accendere il dispositivo per interagire");
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

