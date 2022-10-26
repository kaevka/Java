import java.lang.*;
public class Book {
    private String name;
    private int price;
    public Book(String n, int p){
        this.name=n;
        this.price=p;
    }
    public Book(String n){
        this.name=n;
        this.price=0;
    }
    public Book(){
        this.name="The Secret garden";
        this.price=0;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String toString(){
        return this.name+", price: "+this.price;
    }
    public void intoRuble(){
        System.out.println("'"+name+"'"+" costs "+price*60+" rubles");
    }

}
