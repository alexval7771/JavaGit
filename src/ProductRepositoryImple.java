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

    @Override
    public int sumMinMax() {
        int min = products.get(0).getPrice();
        int max = 0;
        for (Product product : products) {
            if (product.getPrice() < min) {
                min = product.getPrice();
            }
            if (product.getPrice() > max) {
                max = product.getPrice();
            }
        }
        int total = max + min;
        return total;
    }

    @Override
    public int amountByPriceRange(int from, int to) {
        int total = 0;
        for (Product product : products) {
            if (product.getPrice() > from && product.getPrice() < to) {
                total++;
            }
        }
        return total;
    }

    @Override
    public int amountNegativePrice() {
        int total = 0;
        for (Product product : products) {
            if (product.getPrice() < 0) {
                total++;
            }
        }
        return total;
    }

    @Override
    public List<Product> ifNegativePrice() {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() < 0) {
                product.setPrice(product.getPrice() * -1);
                result.add(product);
            }
        }
        return result;
    }

}
