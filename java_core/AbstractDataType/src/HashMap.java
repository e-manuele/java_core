public class HashMap {

    public static void main(String[] args) {
            java.util.HashMap<String, String> capitalCities = new java.util.HashMap<String, String>();

            // Add keys and values (Country, City)
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");

            System.out.println("-Stampo keySet, le chiavi : ");
            for (String i : capitalCities.keySet()) {
                System.out.println(i);
            }

            System.out.println("-Stampo values, i valori: ");
            for (String i : capitalCities.values()) {
                System.out.println(i);
            }
            System.out.println("-Stampo chiavi e i valori: ");
            for (String i : capitalCities.keySet()) {
                System.out.println("key: " + i + " value: " + capitalCities.get(i));
            }
        }
    }

