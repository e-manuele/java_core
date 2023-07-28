import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {


        Bank.readInput();
        Utente MarioRossi = new Utente("Mario","Rossi");
        ContoCorrente nuovoConto = new ContoCorrente(MarioRossi);
        {try {
            nuovoConto.operazione("versamento", 200);
            nuovoConto.operazione("versamento", 2);
            nuovoConto.operazione("versamento", 2);
            nuovoConto.operazione("versamento", 2);
            nuovoConto.operazione("versamento", 2);
            nuovoConto.operazione("prelievo", 500);
        }catch (Exception e){System.out.println(" eee");

            /*
            nuovoConto.operazione("prelievo", 50);
            nuovoConto.operazione("versamento", 200);
            nuovoConto.operazione("prelievo", 50);
            nuovoConto.operazione("prelievo", 50);
            nuovoConto.operazione("versamento", 200);
            System.out.println(nuovoConto.getSaldo());
            nuovoConto.operazione("prelievo", 500);*/
            System.out.println(nuovoConto.getOperazioniConto());
            System.out.println(nuovoConto.getUtente());
            Bank.readInput();
        } //catch (Exception e){System.out.println(" eee");

    }

}}