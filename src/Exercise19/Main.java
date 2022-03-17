package Exercise19;

public class Main {
    public static void main (String[] args){
        LastDigitChecker ob = new LastDigitChecker();
        System.out.println(ob.hasSameLastDigit(41, 22, 71));
        System.out.println(ob.hasSameLastDigit(23, 32, 42));
        System.out.println(ob.hasSameLastDigit(9, 99, 999));
    }
}
