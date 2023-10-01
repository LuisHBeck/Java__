package entities;

import application.Main;

public class Circle extends Shape{
    private Double radius;

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*(radius*radius);
    }
}
