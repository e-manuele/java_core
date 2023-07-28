import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {
    static List<ContoCorrente> listaContiCorrenti = new ArrayList<>();

    public static void readInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        boolean inputHasNextLine = true;
        while (inputHasNextLine) {
            String in = scanner.nextLine();
            if (in.equals("close")) {
                inputHasNextLine = false;
            } else {
                try {
                    System.out.println(doBankStuff(in));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    private static String doBankStuff(String in) throws Exception {
        Pattern patternStampaUtenti = Pattern.compile("(\\s*stampa\\s*utenti)");
        Matcher matcherStampaUtenti = patternStampaUtenti.matcher(in);
        Pattern patternInserisciUtente = Pattern.compile("(\\s*inserisci\\s*utente)\\s*([a-zA-Z]+)\\s*([a-zA-Z]+)");
        Matcher matcherInserisciUtente = patternInserisciUtente.matcher(in);
        Pattern patternOperazioneUtente = Pattern.compile("(\\s*operazione\\s*utente)\\s*([a-zA-Z]+)\\s*([a-zA-Z]+)\\s*([a-zA-Z]+)\\s*(\\d+\\.\\d*)");
        Matcher matcherOperazioneUtente = patternOperazioneUtente.matcher(in);
        if (matcherStampaUtenti.matches()) {
            String listaUtenti = "";
            for (ContoCorrente conto : listaContiCorrenti) {
                listaUtenti += conto.getUtente();
            }
            return listaUtenti;
        } else if (matcherInserisciUtente.matches()) {
            listaContiCorrenti.add(new ContoCorrente(new Utente(matcherInserisciUtente.group(2), matcherInserisciUtente.group(3))));
            return listaContiCorrenti.get(listaContiCorrenti.size() - 1).toString();
        } else if (matcherOperazioneUtente.matches()) {
            String nome = matcherOperazioneUtente.group(2);
            String cognome = matcherOperazioneUtente.group(3);
            String tipoOperazione = matcherOperazioneUtente.group(4);
            String importo = matcherOperazioneUtente.group(5);
            findContoAndDoOp(nome, cognome, tipoOperazione, importo);
        }else {
        return "Opzione non valida";}
        return "in";
    }

    private static void findContoAndDoOp(String nome, String cognome, String tipoOperazione, String importo) {

        for (ContoCorrente conto : listaContiCorrenti) {
            if (conto.getUtente().getNomeCognome().equals(nome + cognome)) {
                try {
                    conto.operazione(tipoOperazione, Double.parseDouble(importo));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            //throw new Exception("This account is no in database");

        }
    }}
