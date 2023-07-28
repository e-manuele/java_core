import AziendaZtrhe.Automobile;

import java.util.ArrayList;

public class ListaDispositiviComprati {
    public static Dispositivo[] elencoDispositivi = {
            new Luce("Notturna", "CameraDaLetto",StatoDispositivo.SPENTO),
            new Allarme("AllarmeFinestra", "Cucina", StatoDispositivo.SPENTO, "qwerty", "abcdefg"),
            new Telecamera("Telecamera1", "SalaDaPranzo", StatoDispositivo.SPENTO)
};
}


