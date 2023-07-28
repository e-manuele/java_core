import java.util.*;
import java.time.LocalDate;


public class GestoreMerci {
    private ArrayList<AreaMagazzino> magazzino;//= new ArrayList<AreaMagazzino>();
    private ArrayList<Scaffale> scaffali;// = new ArrayList<Scaffale>();
    private ArrayList<Merce> merceInArrivo ;//= new ArrayList<Merce>();
    HashMap<LocalDate, ArrayList> StoricoMerceMagazzino;// = new HashMap<LocalDate, ArrayList>();
    HashMap<LocalDate, ArrayList> StoricoMerceScaffali ;//= new HashMap<LocalDate, ArrayList>();

   public void aggiungiScaffale(Scaffale scaffale){
       scaffali.add(scaffale);
   }


    public  GestoreMerci(){
        magazzino= new ArrayList<AreaMagazzino>();
        scaffali = new ArrayList<Scaffale>();
        merceInArrivo = new ArrayList<Merce>();
        StoricoMerceMagazzino = new HashMap<LocalDate, ArrayList>();
        StoricoMerceScaffali = new HashMap<LocalDate, ArrayList>();
    }
    public void aggiungiMerceScaffale(Merce merce, Scaffale scaffale){
       scaffale.addMerce(merce);
    }
    public void esponiMerceDaMagazzino(Merce merce, int quantita, Scaffale scaffale){
        // vado in lista magazzino cerco la merce e la sposto
    }
    public void inserisciInMagazzino(Merce merce, AreaMagazzino areamagazzino){
        // vado su array list, se c'è spazion inserirsco se no dico che non ce spazion
    }
    public void togliDaEsposizione(Merce merce, Scaffale scaffale, AreaMagazzino areamagazzino){

    }
    public void resocontoGiornata(){
        StoricoMerceMagazzino.put(LocalDate.now() , magazzino);
        StoricoMerceScaffali.put(LocalDate.now(), scaffali);
    }
    public void merceEsposta(String merce ,LocalDate data){
        ArrayList<Scaffale> estrazioneMerce = StoricoMerceScaffali.get(data);
        for(Scaffale scaffale : estrazioneMerce){
            for(Merce mercia : scaffale.merceInScaffale){
            if(mercia.getMarca() == merce ){
                System.out.println( mercia.toString());
            }

            }
        }}}



    /*

    public void inserisciMerce(merce merce){
        this.merceInMagazzino.add(merce);
        this.quantitaDisponibile = quantitaDisponibile - merce.getQuantita();
    }
    public void esponiMerce(Scaffale scaffale, merce merce, int quantita){
        int cacca = merce.getQuantita() - quantita;
    }

     */

