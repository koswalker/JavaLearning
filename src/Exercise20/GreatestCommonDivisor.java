package Exercise20;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        int max_divisor = 0;
        int divisor = 1;
         if (first >= 10 && second >= 10) {
             do {
                 if(first % divisor == 0 && second % divisor == 0){
                     max_divisor = divisor;
                 }
                 divisor++;
             } while ((divisor <= first) && (divisor <= second));

         } else max_divisor = -1;
        return max_divisor;
    }
}
