import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("blue", 2);
        Ball d2 = new Ball("white", 7);
        Ball d3 = new Ball("yellow");
        d3.setPrice(1);
        System.out.println(d1);
        d1.intoRuble();
        d2.intoRuble();
        d3.intoRuble();
    }
}
