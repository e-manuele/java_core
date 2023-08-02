import java.util.ArrayList;

public class GestoreDispositiviEProfili extends GestoreDispositivi{
    ArrayList<ProfiloDispositivi> profili;


    /**
     *
     */
    public GestoreDispositiviEProfili(){
        profili = new ArrayList<>();
    }
    public GestoreDispositiviEProfili(ProfiloDispositivi profilo){
        profili = new ArrayList<>();
        profili.add(profilo);
    }

    /**
     * @param profilo
     * @throws PercentualeNonCorrettaException
     * @throws DispositivoSpentoException
     * @throws UtenteNonAutenticatoException
     */
    public void attivaProfilo(ProfiloDispositivi profilo) throws PercentualeNonCorrettaException, DispositivoSpentoException, UtenteNonAutenticatoException {
        for(String cmd : profilo.listaComandi){
            String[] comando = cmd.split(" ");
        if(comando.length == 2 ){
                inviaComando(comando[0], comando[1]);
            }else if(comando.length == 3){
            inviaComando(comando[0], comando[1], Integer.parseInt(comando[2] )) ;
        }else if(comando.length == 4){
            inviaComandoConAutenticazione(comando[0], comando[1],comando[2], comando[3]);
        }
        }
    }

}
