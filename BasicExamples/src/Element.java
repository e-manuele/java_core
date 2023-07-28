import java.util.Comparator;
import java.util.Objects;

public class Element implements Comparable <Element>{
    private int numAtomico;
    private String simbolo;
    private float massaAtomica;
    private String nome;

    @Override
    public int compareTo(Element elemento) {
        return Integer.compare(this.getNumAtomico(), elemento.getNumAtomico());
    }
    public Element(int numAtomico, String nome, String simbolo, float massaAtomica) {
        this.nome = nome;
        this.numAtomico = numAtomico;
        this.simbolo = simbolo;
        this.massaAtomica = massaAtomica;

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Element elemento = (Element) o;
        return numAtomico == elemento.numAtomico &&
                Float.compare(elemento.massaAtomica, massaAtomica) == 0 &&
                Objects.equals(simbolo, elemento.simbolo) &&
                Objects.equals(nome, elemento.nome);
    }


    @Override
    public int hashCode() {
        return Objects.hash(numAtomico, simbolo, massaAtomica, nome);
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "numAtomico=" + numAtomico +
                ", simbolo='" + simbolo + '\'' +
                ", massaAtomica=" + massaAtomica +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getNumAtomico() {
        return numAtomico;
    }

    public void setNumAtomico(int numAtomico) {
        this.numAtomico = numAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public float getMassaAtomica() {
        return massaAtomica;
    }

    public void setMassaAtomica(float massaAtomica) {
        this.massaAtomica = massaAtomica;
    }



}
