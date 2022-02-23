package com.company;

public class Main {

    public static void main(String[] args) {
    Circle circle= new Circle();
    System.out.println(circle);
    System.out.println("The area of the circle is " + circle.getArea());
    System.out.println("The perimeter of the circle is  "+ circle.getPerimeter());

    System.out.println("");

    Rectangle rectangle = new Rectangle();
    System.out.println(rectangle);
    System.out.println("The area of the rectangle is " + rectangle.getArea());
    System.out.println("The perimeter of the rectangle is  "+ rectangle.getPerimeter());

    System.out.println("");

    Square square = new Square();
    System.out.println(square);
    System.out.println("The area of the square is " + square.getArea());
    System.out.println("The perimeter of the square is  "+ square.getPerimeter());

    System.out.println("");
    }
}
