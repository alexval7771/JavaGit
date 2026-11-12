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

    @Override
    public Product findByName(String name) {
        Product product1 = null;
        for (Product product : products) {
            if (product.getName() == name) {
                product1 = product;
            }
        }
        return product1;
    }

    @Override
    public Product minProduct() {
        Product productMin = products.get(0);
        int min = products.get(0).getPrice();
        for (Product product : products) {
            if (product.getPrice() < min) {
                min = product.getPrice();
                productMin = product;
            }
        }
        return productMin;
    }

    @Override
    public int amountEndWithA() {
        int total = 0;
        for (Product product : products) {
            if (product.getName().endsWith("a")) {
                total++;
            }
        }
        return total;
    }

    /**
     * Данный метод переворачивает цену у всех продуктов , и возвращает лист измененных
     * @return Лист измененных продуктов
     */
    @Override
    public List<Product> reversePrice() {
        List<Product> products1 = new ArrayList<>();
        for (Product product : products) {
            String price = product.getPrice() + "";
            String empty = "";
            for (int i = price.length()-1; i >=0 ; i--) {
                empty = empty + price.charAt(i);
            }
            product.setPrice(Integer.parseInt(empty));
            products1.add(product);
        }
        return products1;
    }

}
