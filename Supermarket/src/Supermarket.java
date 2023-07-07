import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private final List<Aisle> aisles;
    private String name;

    public Supermarket(String name) {
        this.aisles = new ArrayList<Aisle>();
        this.name = name;
    }

    public void addAisle(String name) {
        this.aisles.add(new Aisle(name));
    }


    public boolean contains(Product product) {
        for (Aisle aisle : aisles) {
            if (aisle.contains(product)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
    public Aisle getAisle(String name) {
        try {
            for (int i = 0; i < aisles.size(); i++) {
                if (aisles.get(i).getName().equals(name)) {
                    return aisles.get(i);
                }
            }
            throw new SupermarketNotPresentException("Supermarket named " + name + " not exist.");
        } catch (SupermarketNotPresentException e) {return null;} //BAH
    }
}
