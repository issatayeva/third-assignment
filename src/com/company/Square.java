package com.company;

public class Square extends Rectangle {
    Square() {
        super();
    }
    private double side;
    public double getSide() {
        return side;
    }
    public void setSide() {
        this.side=side;
    }

    public Square(double side, String color, boolean filled) {
        setWidth(side);
        setLength(side);
        this.color=color;
        this.filled=false;
    }

    @Override
    public void setWidth(double side) {
        length=side;
    }
    @Override
    public void setLength (double side) {
        width=side;
    }
    @Override
    public String toString() {
        return "A square with side " + getLength() + " a subclass of " + super.toString();
    }

}
