public class NotTypeException extends Exception {

	public NotTypeException() {
            super("Nessuna automobile disponibile");
        }

        @Override
        public String toString() {
            return getMessage();
        }
    }

