import java.util.ArrayList;

public class AreaMagazzino {
    String nome;
    ArrayList<Merce>  merceInMagazzino;
    int quantitaDisponibile;

    public  AreaMagazzino(String nome, int quantitaTotale){
        this.nome = nome;
        this.merceInMagazzino = new ArrayList<Merce>();
        this.quantitaDisponibile = quantitaTotale;
    }

}
