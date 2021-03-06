package dk.adventurealley.app.Model.Entities;

public class Product {
    // Attributes
    private Integer id;
    private String name;
    private int price;
    private String productImagePath;

    // Constructors
    public Product(){
    }
    public Product(Integer id, String name, int price, String productImagePath) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productImagePath = productImagePath;
    }

    // Methods
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productImagePath='" + productImagePath + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }
}
