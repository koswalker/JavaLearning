package Exercise22;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        boolean result = false;
            int divider = 1;
            int perfect_number = 0;
            if(number >= 1) {
                do {
                    if(number % divider == 0){
                        perfect_number = perfect_number+divider;
                    }
                    divider++;
                } while (divider < number);
                if(perfect_number == number){
                    result = true;
                } else result = false;
            } else result = false;
        return result;
    }
}
