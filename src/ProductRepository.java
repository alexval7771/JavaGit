public interface ProductRepository {
    Product findByID(int id);

    Product findMax();

    int total();

    int sumMinMax();

    int amountByPriceRange(int from , int to);

}
