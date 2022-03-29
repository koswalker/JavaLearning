package Exercise27;

import java.util.Scanner;

public class InputCalculator {

        public static void inputThenPrintSumAndAverage () {

            Scanner scanner = new Scanner(System.in);

            int counter = 0;
            int sum = 0;
            int avg = 0;


            while(true){
                boolean isAnInt = scanner.hasNextInt();
                if(isAnInt){
                    int number = scanner.nextInt();
                    counter ++;
                    sum += number;
                } else {
                    try {
                        avg = Math.round((float)sum/ counter);
                    } catch (ArithmeticException e) {
                        avg = 0;
                    }
                    System.out.println("SUM = " + sum + " AVG = " + avg);
                    break;
                }

                scanner.nextLine(); // handle end of line (Enter key)
            }
            scanner.close();
        }
}
