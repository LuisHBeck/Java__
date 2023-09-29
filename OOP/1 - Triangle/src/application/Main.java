package application;

import entities.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaX, areaY;
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        areaX = x.area();

        System.out.println("Enter the measures of triangle X");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        areaY = y.area();

        if (areaX > areaY) {
            System.out.println("X is bigger then Y");
        } else if (areaY > areaX) {
            System.out.println("Y is bigger then X");
        }else {
            System.out.println("X == Y");
        }

        sc.close();
    }
}