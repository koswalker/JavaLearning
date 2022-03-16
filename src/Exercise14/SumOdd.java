package Exercise14;

public class SumOdd {
    public static boolean isOdd(int number){
        if(number > 0){
            if ((number%2) != 0){
                return true;
            } else return false;
        } else return false;
    }

   public static int sumOdd(int start, int end){
        int res = 0;
      if((start<=0) || (end<=0)) {
           res = -1;
        } else if(end<start){
           res = -1;
        } else {
          for (int i = start; i < end+1; i++){
              if(isOdd(i)){
                  res = res + i;
              }
          }
        } return res;
   }
}
