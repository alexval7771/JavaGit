import java.util.List;

public interface ProductRepository {
    Product findByID(int id);

    Product findMax();

    int total();

    int sumMinMax();

    int amountByPriceRange(int from , int to);

    int amountNegativePrice();

    List<Product> ifNegativePrice();

    Product findByName(String name);

    Product minProduct();

    int amountEndWithA();

}
