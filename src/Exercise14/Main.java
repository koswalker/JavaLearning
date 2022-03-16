package Exercise14;

public class Main {
    public static void main(String[] args) {
        SumOdd ob = new SumOdd();
        System.out.println(ob.sumOdd(1,100));
        System.out.println(ob.sumOdd(-1,100));
        System.out.println(ob.sumOdd(100, 100));
        System.out.println(ob.sumOdd(13, 13));
        System.out.println(ob.sumOdd(100, -100));
        System.out.println(ob.sumOdd(100, 1000));
    }
}