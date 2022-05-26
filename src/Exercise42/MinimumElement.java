package Exercise42;

import java.util.Scanner;

public class MinimumElement {

    int count = readInteger();
    int[] returnedArray = readElements(count);
    int min = findMin(returnedArray);

    private static int readInteger(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int count = scanner2.nextInt();
        scanner2.nextLine();
        return count;
    }

    private static int[] readElements (int count) {
        Scanner scanner1 = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i<array.length; i++){
            System.out.println("Enter the number: ");
            array[i] = scanner1.nextInt();
            scanner1.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
