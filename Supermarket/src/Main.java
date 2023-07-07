public class Main {
    public static void main(String[] args) {

        SupermarketManager supermarketManager= new SupermarketManager();

        supermarketManager.createSupermarket("Lillo");

        Supermarket mySupermarket = supermarketManager.getSupermarket("Lillo");

        mySupermarket.addAisle("OrtoFrutta");


    }
}

/*
    CREARE UN'APPLICAZIONE CHE POSSA GESTIRE UNA LISTA DI SUPERMARKET

    SUPERMERCATI DIVISI IN REPARTI -> OGNI REPARTO HA UNA LISTA DI PRODOTTI

    UTENTE
        1) RICERCARE UN PRODOTTO E VEDERE IN QUALI SUPERMERCATI è PRESENTE
            1.1) RICERCARE UN PRODOTTO IN UN CERTO SUPERMERCATO
            1.2) STAMPARE TUTTI I PRODOTTI PRESENTI IN UN CERTO SUPERMERCATO
            1.3) RICERCARE SE UN REPARTO è PRESENTE IN UN CERTO SUPERMERCATO
            USARE TOSTRING() PER STAMPARE LE INFO DEI PRODOTTI

        2) ACQUISTARE QUEL PRODOTTO DATA UNA CERTA QUANTITà (1 UNITà)
        3) GESTIRE IL CARRELLO -->
            3.a) L'UTENTE PUò STAMPARE E VEDERE IL SUO CARRELLO
            3.b) PUò RIMUOVERE UNO O PIù PRODOTTI
            3.c) aggiungere prodotti al carrello
            3.d) CHECKOUT DEL CARRELLO -> STAMPA LISTA PRODOTTI + MOSTRO TOTALE DEI PRODOTTI

    CONSEGNA OPZIONALE:
        gestire le operazioni utente da standard input

    NOTA BENE:
        dovete versionare l'esercizio sul vostro repository GitHub

     */