import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Tom Soyer", 2);
        Book d2 = new Book("War and peace", 7);
        Book d3 = new Book("Instruction");
        d3.setPrice(1);
        System.out.println(d1);
        d1.intoRuble();
        d2.intoRuble();
        d3.intoRuble();
    }
}
