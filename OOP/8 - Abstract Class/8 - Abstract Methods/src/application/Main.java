package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();

        shapesList.add(new Rectangle("black", 4.0, 5.0));
        shapesList.add(new Circle("red", 3.0));

        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapesList) System.out.printf("%.2f \n", shape.area());
    }
}