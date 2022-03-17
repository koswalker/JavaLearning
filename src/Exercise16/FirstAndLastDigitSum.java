package Exercise16;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit (int number){
        int sum = 0;
        int start = 0;
        int end = 0;

        if(number >= 0){
            int reverse = 0;
            int lastDigit = 0;
            int operating_number = number;
            while (operating_number != 0){
                lastDigit = operating_number % 10;
                operating_number = operating_number/10;
                reverse = (reverse + lastDigit) * 10;
            }  reverse = reverse/10;
            start = number%10;
            end = reverse%10;
            sum = start + end;
        } else sum = -1;
        return sum;
    }
}
