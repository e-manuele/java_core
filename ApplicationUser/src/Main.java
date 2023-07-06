import java.util.HashMap;
/*
    modellare 3 tipi di utenti:
        - admin
        - editor
        - user
    Un utente incapsula gli attributi "username" e "password"

    questi utenti sono inseriti all'interno di un database rappresentato dalla classe ApplicationUsers;
    il database va rappresentato da una struttura dati adeguata (List, Set, Map)
    La classe ApplicationUsers mi permette di verificare se la coppia <username, password> esiste ed é corretta.
    Se esiste allora ritorno il corrispondente utente.
    La classe ApplicationUsers mi permette di creare un utente dati uno username, password e ruolo.

 */
public class Main {
    public static void main(String[] args) {
        ApplicationUser.createUser("guido","lavespa", UserType.ADMIN);
        ApplicationUser.createUser("dario","lampa", UserType.EDITOR);
        ApplicationUser.createUser("dina","lampa", UserType.USER);
        ApplicationUser.createUser("loris","posta", UserType.ADMIN);


        ApplicationUser.findUser("franco","nontroppo");


        System.out.println(ApplicationUser.findUser("guido","lavespa"));





    }
}