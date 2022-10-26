import java.lang.*;
public class Ball {
    private String color;
    private int price;

    public Ball(String c, int p){
        color=c;
        price=p;
    }
    public Ball(String c){
        color = c;
        price = 0;
    }
    public Ball(){
        color = "black";
        price = 0;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(String name){
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String toString(){
        return this.color+", price: "+this.price;
    }
    public void intoRuble(){
        System.out.println(color+" ball costs "+price*60+" rubles");
    }
}
