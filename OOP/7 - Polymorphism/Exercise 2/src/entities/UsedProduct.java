package entities;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product{
    private String manufacturedDate;

    public UsedProduct(String name, Double price, String manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String toString() {
        return String.format("%s, R$%.2f (Manufacture date: %s)", this.getName(), this.price, this.manufacturedDate);
    }
}
