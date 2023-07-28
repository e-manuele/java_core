public class TavolaPeriodica {
    public static void main(String[] args) {


        Element Idrogeno = new Element(1, "Idrogeno", "H", 1.008F);
        Element Elio = new Element(2, "Elio", "He", 4.003F);
        Element Litio = new Element(3, "Litio", "H", 6.941F);
        Element Berillio = new Element(4, "Berillio", "Be", 9.012F);
        Element Boro = new Element(5, "Boro", "B", 10.81F);
        Element Carbonio = new Element(6, "Carbonio", "C", 12.01F);
        Element Azoto = new Element(7, "Azoto", "N", 14.01F);
        Element Ossigeno = new Element(8, "Ossigeno", "O", 16F);
        Element Fluoro = new Element(9, "Fluoro", "F", 19F);
        Element Neon = new Element(10, "Neon", "Ne", 20.18F);
        Element Sconosciuto = new Element(10, "Neon", "Ne", 20.18F);


        System.out.println(Fluoro.toString());
        System.out.println(Sconosciuto.toString());
        System.out.println(Neon.equals(Sconosciuto));



    }
}
