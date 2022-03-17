package Exercise15;

public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int lastDigit = 0;
        int operating_number = number;
        while (operating_number != 0){
            lastDigit = operating_number % 10;
            operating_number = operating_number/10;
            reverse = (reverse + lastDigit) * 10;
        }
        reverse = reverse/10;
        if(number == reverse){
            return true;
        }
        return false;
    }
}
