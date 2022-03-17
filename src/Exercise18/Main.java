package Exercise18;

import Exercise17.EvenDigitSum;

public class Main {
    public static void main (String[] args){
        SharedDigit ob = new SharedDigit();
        System.out.println(ob.hasSharedDigit(12, 23));
        System.out.println(ob.hasSharedDigit(9, 99));
        System.out.println(ob.hasSharedDigit(15, 55));
    }
}
