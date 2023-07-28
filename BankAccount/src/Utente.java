public class Utente {
    String nome;
    String cognome;

    @Override
    public String toString() {
        return "Utente: " +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' ;
    }

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;

    }
    public String getNomeCognome(){
        return nome+cognome;
    }
}
