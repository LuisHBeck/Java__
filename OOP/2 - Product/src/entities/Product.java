package entities;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product() {
    }

    public Product(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addQuantity(int value) {
        this.stockQuantity += value;
    }

    public void removeQuantity(int value) {
        this.stockQuantity -= value;
    }

    public double totalPrice () {
        return this.price * this.stockQuantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", Total=" + totalPrice() +
                '}';
    }
}
