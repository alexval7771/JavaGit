import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Cucumber", 100, 10);
        Product product1 = new Product(2, "Tomato", 400, 20);
        Product product2 = new Product(3, "Potato", 300, 30);
        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);
        ProductRepositoryImple productRepositoryImple = new ProductRepositoryImple(products);
        int range = productRepositoryImple.amountByPriceRange(100, 400);
        System.out.println(range);
    }
}