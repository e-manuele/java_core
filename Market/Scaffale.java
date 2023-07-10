package Market;

import java.util.ArrayList;

public class Scaffale {
    String id;
    ArrayList<Merce> merceInScaffale;

    /**
     *
     * @param id
     * @param quantitaTotale
     */
    public Scaffale(String id, int quantitaTotale){
        this.id = id;
        this.merceInScaffale = new ArrayList<Merce>();
        this.quantitaDisponibile = quantitaTotale;
    }

    int quantitaDisponibile;

    /**
     * @param merce
     */
    public void addMerce(Merce merce){
        merceInScaffale.add(merce);
    }


    @Override
    public String toString() {
        return "scaffale{" +
                "id='" + id + '\'' +
                ", merceInScaffale=" + merceInScaffale +
                ", quantitaDisponibile=" + quantitaDisponibile +
                '}';
    }
}
