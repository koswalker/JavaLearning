package Exercise41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayDownUp {

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i] > sortedArray[i+1]){
                    temp = sortedArray[i+1];
                    sortedArray[i+1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
