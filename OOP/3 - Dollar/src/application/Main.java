package application;

import entities.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price, quantity;

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        price = sc.nextDouble();
        System.out.println("");

        System.out.print("How many dollars will be bought? ");
        quantity = sc.nextDouble();
        System.out.println("");
        sc.close();

        System.out.printf("Amount to be paid id reais = R$%.2f", CurrencyConverter.dollarToReal(price, quantity));
    }
}