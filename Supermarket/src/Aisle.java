import java.util.ArrayList;
import java.util.List;

public class Aisle {
    private final List<Product> products;
    private String name;

    public Aisle(String name) {
        this.products = new ArrayList<Product>(); //HASHMAP?
        this.name = name;
    }

    public boolean contains(Product product) {
        for (Product productInAisle : this.products) {
            if (productInAisle.equals(product)) {
                return true;
            }
        }
        return false;
    }

    public boolean insertProduct(Product product) {
        for (Product productInAisle : this.products) {
            if (productInAisle.equals(product)) {
                productInAisle.setQuantity(productInAisle.getQuantity() + product.getQuantity());
                return true;
            }
        }
        this.products.add(product);
        return false;
    }

    @Override
    public String toString() {
        return "Aisle: " + name + " \n" +
                "products= " + products;
    }

    public String getName() {
        return name;
    }
}


