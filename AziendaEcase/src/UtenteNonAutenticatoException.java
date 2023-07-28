public class UtenteNonAutenticatoException extends Exception{


    public UtenteNonAutenticatoException() {
        super("Il nome utente o password errati. Ritentare. ");
    }

    @Override
    public String toString() {
        return getMessage();
    }
}