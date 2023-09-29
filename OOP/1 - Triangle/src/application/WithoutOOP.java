package application;

import java.util.Scanner;

public class WithoutOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, areaX, yA, yB, yC, areaY;

        System.out.println("Enter the measures of triangle X");
        xC = sc.nextDouble();
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        areaX = area(xA,xB,xC);

        System.out.println("Enter the measures of triangle X");
        yC = sc.nextDouble();
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        areaY = area(yA,yB,yC);

        if (areaX > areaY) {
            System.out.println("X is bigger then Y");
        } else if (areaY > areaX) {
            System.out.println("Y is bigger then X");
        }else {
            System.out.println("X == Y");
        }

        sc.close();
    }

    public static double area(double a, double b, double c) {
        double p, area;
        p = (a+b+c)/2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
}
