package ru.mirea.lab4;

import java.math.*;

public class Square extends Rectangle{

    protected double side;

    public Square(){
        this.side = 0;
        this.color = "blue";
        this.filled = false;

    }
    public Square(double side){
        this.side = side;
        this.color = "blue";
        this.filled = false;

    }
    public Square(double side, String color, boolean filled){
        this.side = 0;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }
    public String toString() {
        return "Shape: square, side: "+this.side+", color: "+this.color;
    }
}
