public class Product {
    private int id;
    private String name;
    private int price;
    private int sale;
    private boolean isBu;

    Product(int id, String name, int price, int sale , boolean isBu) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sale = sale;
        this.isBu = isBu;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", isBu=" + isBu +
                '}';
    }

    public boolean isBu() {
        return isBu;
    }

    public void setBu(boolean bu) {
        isBu = bu;
    }
}
