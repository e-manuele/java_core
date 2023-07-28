public class PercentualeNonCorrettaException extends Exception{

    public PercentualeNonCorrettaException() {
        super("La percentuale deve essere tra 0% e 100%");
    }

    @Override
    public String toString() {
        return getMessage();
    }
}


