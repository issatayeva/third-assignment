package com.company;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle() {
        width=1.0;
        length=1.0;
    }

    public Rectangle(double width, double length) {
        super();
        setLength(length);
        setWidth(width);
    }

    public Rectangle(double width, double length, String color, boolean filed) {
        super(color,filed);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length=length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "A rectangle with width "+ getWidth()+ " and length "+ getLength()+ " a subclass of " +super.toString();
    }
}
