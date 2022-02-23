package com.company;

public class Shape {
    public String color;
    public Boolean filled;

    public Shape() {
        color="green";
        filled=true;
    }

    public Shape (String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor()+" and with filling - " +getFilled();
    }
}
