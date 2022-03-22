package Exercise24;

public class FlourPacker {
    public static boolean canPack (int bigCount,int smallCount, int goal){
        boolean result = false;
        int big = 5;
        int small = 1;
        int alt_big=bigCount;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
          result = false;
        } else if((bigCount*big)+(smallCount*small) >= goal){
               if(goal/big <= bigCount  && (goal%big) <= smallCount){
                   result = true;
               } else if(bigCount == 0 && (goal%big) <= smallCount){
                   result = true;
               }else if(goal/(big*bigCount) <= bigCount && goal/(big*bigCount) <= smallCount){
                   if(big*bigCount > goal){
                       result = false;
                   } else result = true;
               }else result = false;
        } else result = false;
        return result;
    }
}
