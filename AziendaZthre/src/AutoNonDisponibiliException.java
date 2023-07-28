public class AutoNonDisponibiliException extends Exception {

	public AutoNonDisponibiliException() {
		super("Nessuna automobile disponibile");
	}
	
	@Override
	public String toString() {
		return getMessage();
	}
}
