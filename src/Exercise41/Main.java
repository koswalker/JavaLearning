package Exercise41;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        SortedArray sortedArray = new SortedArray();
        SortedArrayDownUp sortedArrayDownUp = new SortedArrayDownUp();
        int[] myIntegers = sortedArray.getIntegers(5);
        int[] sorted = sortedArray.sortIntegers(myIntegers);
        int[] sorted1 = sortedArrayDownUp.sortIntegers(myIntegers);
        sortedArray.printArray(sorted);
        sortedArray.printArray(sorted1);
    }

}
