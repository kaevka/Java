package ru.mirea.lab4;


public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "blue";
        this.filled = false;
    };
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    };
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return true;
    }
    public void setFilled(boolean filled){
        this.filled = true;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return "Shape color: "+this.color+". It is filled - "+ this.filled;
    }
}
