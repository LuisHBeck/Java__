package application;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        int quantity, add, remove;
        Product product;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = sc.nextInt();

        product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.printf("Updated name: %s", product.getName());
        System.out.println();

        System.out.println(product);

        System.out.print("Enter the number of products to be added in stock: ");
        add = sc.nextInt();
        product.addQuantity(add);

        System.out.println(product);

        System.out.print("Enter the number of products to be removed in stock: ");
        remove = sc.nextInt();
        product.removeQuantity(remove);

        System.out.println(product);
        sc.close();
    }
}