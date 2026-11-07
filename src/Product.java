public class Product {
    private int id;
    private String name;
    private int price;
    private int sale;

    Product(int id, String name, int price, int sale) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSale() {
        return sale;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                '}';
    }
}
