package entities;

public class ImpoertedProduct extends Product{
    private Double customsFee;

    public ImpoertedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice () {
        return this.price += this.customsFee;
    }

    @Override
    public String toString() {
        return String.format("%s, R$%.2f (Custom fee: R$%.2f)", this.getName(), this.price, this.customsFee);
    }
}
