package Exercise23;

public class Main {
    public static void main(String[] args){
        NumberToWords ob = new NumberToWords();
        System.out.println("Number 123:");
        ob.numberToWords(123);
        System.out.println("Number 1010:");
        ob.numberToWords(1010);
        System.out.println("Number 1000:");
        ob.numberToWords(1000);
        System.out.println("Number -12:");
        ob.numberToWords(-12);
    }
}
