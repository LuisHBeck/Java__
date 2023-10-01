package application;

import entities.ImpoertedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Product tablet, notebook, iphone;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date formatedDate = format.parse("15/03/2017");

        tablet = new ImpoertedProduct("Tablet", 260.0, 20.0);
        notebook = new Product("Notebook", 1100.00);
        iphone = new UsedProduct("Iphone",400.0, "15/03/2017");

        System.out.println(tablet);
        System.out.println(notebook);
        System.out.println(iphone);
    }
}