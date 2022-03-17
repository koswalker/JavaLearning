package Exercise18;

public class SharedDigit {
     public static boolean hasSharedDigit (int number_1, int number_2){
         boolean result = false;
         int lastDigit = 0;
         if ((number_1 >= 10 && number_1<=99) && (number_2 >= 10 && number_2<=99)){
             do {
                 lastDigit = number_1%10;
                 if((number_2/10) == lastDigit || (number_2%10) == lastDigit){
                     result = true;
                 }
                 number_1 = number_1/10;
             } while (number_1>0);
         } else result = false;
         return result;
     }
}
