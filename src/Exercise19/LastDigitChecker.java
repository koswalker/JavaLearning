package Exercise19;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int number_1, int number_2, int number_3) {
        boolean result = false;
        if(isValid(number_1) && isValid(number_2) && isValid(number_3)){
          if((number_1%10)==(number_2%10) || (number_1%10)==(number_3%10) || (number_2%10)==(number_3%10)) {
              result = true;
          } else result = false;
        }
        return result;
    }

    public static boolean isValid (int number){
        boolean result = false;
        if(number >= 10 && number <=1000) {
            result = true;
        }
        return result;
    }
}
