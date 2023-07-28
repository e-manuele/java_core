import AziendaZtrhe.AutoNonDisponibiliException;

public class Merce {

    private String marca;
    private String origine;
    private int quantita;

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Merce{" +
                ", marca='" + marca + '\'' +
                ", origine='" + origine + '\'' +
                ", quantita=" + quantita +
                ", tipoMerce=" + tipoMerce +
                '}';
    }

    public String getOrigine() {
        return origine;
    }

    public TipoMerce getTipoMerce() {
        return this.tipoMerce;
    }

    private TipoMerce tipoMerce;

    public Merce( String marca, String origine, int quantita,double prezzoUnitario, TipoMerce tipoMerce) throws NotTypeException {

        this.marca = marca;
        this.origine = origine;
        this.quantita = quantita;
        this.tipoMerce = tipoMerce;
    }
        public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
