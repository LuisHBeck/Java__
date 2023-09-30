package entities;

public class Product {
    public String name;
    public double price;
    public int stockQuantity;

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
