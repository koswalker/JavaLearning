package Exercise23;

public class NumberToWords {
    public static void numberToWords (int number) {
        int reverse = reverse(number);
        int printDigit;
        int DigitCntRevers = getDigitCount(reverse);
        int DigitCntNumber = getDigitCount(number);
        int CntZeros = DigitCntNumber - DigitCntRevers;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            do {
                printDigit = reverse % 10;
                switch (printDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverse = reverse / 10;
                DigitCntRevers--;
            } while (DigitCntRevers > 0);

            if(CntZeros != 0){
                do{
                    System.out.println("Zero");
                    CntZeros--;
                } while (CntZeros > 0);
            }
        }
    }


    public static int reverse (int number) {
        int reverse = 0;
        int lastDigit;
        int operating_number = number;
       do {
           lastDigit = operating_number % 10;
           reverse = (reverse + lastDigit) * 10;
           operating_number = operating_number/10;
       } while (operating_number != 0);
        return reverse/10;
    }

    public static int getDigitCount (int number){
        int counterOfDigit = 0;
        if (number >= 0){
                do {
                    number= number / 10;
                    counterOfDigit++;
                } while (number != 0);
        } else counterOfDigit = -1;
        return counterOfDigit;
    }

}
