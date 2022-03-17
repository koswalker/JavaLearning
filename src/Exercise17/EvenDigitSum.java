package Exercise17;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        int sum = 0;
        int lastDigit = 0;
        if (number >= 0){
            while (number > 0){
                lastDigit = number % 10;
                number = number / 10;
                if(lastDigit % 2 == 0){
                   sum = sum + lastDigit;
                }
            }
        } else sum = -1;
        return sum;
    }
}
