public interface ProductRepository {
    Product findByID(int id);

    Product findMax();

    int total();

}
