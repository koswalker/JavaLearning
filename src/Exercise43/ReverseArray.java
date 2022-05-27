package Exercise43;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array){

        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length-1;
        int halfIndex = array.length / 2;

        for (int i = 0; i < halfIndex; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
