package Exercise26;

public class DiagonalStar {
    public static void printSquareStar (int number){
        if(number >= 5){
            for(int i = 0; i < number; i++){
                for(int j = 0; j < number ; j++){
                   if(j == i){
                       System.out.print("*");
                   } else if (i == 0 || i == number-1) {
                       System.out.print("*");
                   } else if (j == 0 || j == number-1) {
                       System.out.print("*");
                   } else if (j == ((number - 1) - 1) - i + 1) {
                       System.out.print("*");
                   } else System.out.print(" ");
                }
                System.out.println();
            }
        } else System.out.println("Invalid Value");
    }
}
