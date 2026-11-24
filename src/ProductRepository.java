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

    List<Product> reversePrice();

    List<Product> handleProduct();

    void statisticsProducts();

    void statisricsPrice();

    List<Product> minMaxReversePrice();

    List<Product> ifItsBu();

    List<Product> withoutZero();

    Product productMaxWithReverseName();
}
