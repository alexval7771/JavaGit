import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImple implements ProductRepository{
    List<Product> products;

    ProductRepositoryImple(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product findByID(int id) {
        Product product1 = null;
        for (Product product : products) {
            if (product.getId() == id) {
                product1 = product;
                break;
            }
        }
        return product1;
    }

    @Override
    public Product findMax() {
        int priceMax = 0;
        Product productMax = null;
        for (Product product : products) {
            if (product.getPrice() > priceMax) {
                priceMax = product.getPrice();
                productMax = product;
            }
        }
        return productMax;
    }

    @Override
    public int total() {
        int total = 0;
        for (Product product : products) {
            total = total + product.getPrice();
        }
        return total;
    }
}
