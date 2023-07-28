import java.util.ArrayList;

public class ProfiloDispositivi{
    private String nome;
    ArrayList<String> listaComandi;

    public ProfiloDispositivi(String nome, String listaComandi){
        this.nome = nome;
        this.listaComandi = new ArrayList<>();
        String[] lista = listaComandi.split("-");
        for(int i = 0; i < lista.length; i++) {
            this.listaComandi.add(lista[i]);
            System.out.println((lista[i]));
    }

}}
