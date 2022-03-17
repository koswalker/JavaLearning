package Exercise21;

public class FactorPrinter {

    public static void printFactors (int number){
        int factor = 1;
        if(number >= 1){
            do {
                if(number%factor == 0){
                    System.out.println(factor);
                }
                factor++;
            } while (factor <= number);
        } else System.out.println("Invalid Value");
    }

}
