package entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double dollarToReal(double price, double quantity) {
        return (price*quantity) + ((price*quantity)*IOF);
    }
}
