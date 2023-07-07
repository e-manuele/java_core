import java.util.ArrayList;
import java.util.List;

public class SupermarketManager {
    private final ArrayList<Supermarket> supermarkets;

    public SupermarketManager() {
        this.supermarkets = new ArrayList<Supermarket>();
    }

    public void createSupermarket(String name) {
        supermarkets.add(new Supermarket(name));
    }

    public List<Supermarket> findSupermarketProduct(Product product) {
        ArrayList<Supermarket> productHolder = new ArrayList<Supermarket>();
        for (Supermarket supermarket : supermarkets) {
            if (supermarket.contains(product)) {
                System.out.println(supermarket.getName());
                productHolder.add(supermarket);
            }
        }
        System.out.println(productHolder);
        return productHolder;
    }

    public ArrayList<Supermarket> getSupermarkets() {
        return supermarkets;
    }

    public Supermarket getSupermarket(String name) {
        try {
            for (int i = 0; i < supermarkets.size(); i++) {
                if (supermarkets.get(i).getName().equals(name)) {
                    return supermarkets.get(i);
                }
            }
            throw new SupermarketNotPresentException("Supermarket named " + name + " not exist.");
        } catch (SupermarketNotPresentException e) {return null;} //BAH
    }
}
