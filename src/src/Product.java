public class Product {

    // Attributes of a product

    private int id;
    private String name;
    private int totalNumOfProduct;


    // Konstruktor

    public Product(int id, String name, int totalNumOfProduct) {
        this.id = id;
        this.name = name;
        this.totalNumOfProduct = totalNumOfProduct;
    }

    // Getter_&_Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalNumOfProduct() {
        return totalNumOfProduct;
    }

    public void setTotalNumOfProduct(int totalNumOfProduct) {
        this.totalNumOfProduct = totalNumOfProduct;
    }

    // ToString

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalNumOfProduct=" + totalNumOfProduct +
                '}';
    }
}
