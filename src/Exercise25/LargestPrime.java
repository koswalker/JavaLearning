package Exercise25;

public class LargestPrime {
    public static int getLargestPrime (int number){
        int maxPrimeNumber = 0;
        int isPrimeNumber = 0;
        int maybePrimeNumber = 0;
        if (number > 1) {
            if(number == 2){
                maxPrimeNumber = 2;
            } else {
                for(int i = 2; i < number; i++){
                    maybePrimeNumber = number/i;
                    if(number%i == 0 && maybePrimeNumber > maxPrimeNumber){
                        if(maybePrimeNumber != 2) {
                            for (int j = 2; j < maybePrimeNumber; j++) {
                                if (maybePrimeNumber % j == 0) {
                                    number = maybePrimeNumber;
                                    i = 1;
                                    isPrimeNumber = 0;
                                    break;
                                } else isPrimeNumber = maybePrimeNumber;
                            }
                        } else isPrimeNumber = maybePrimeNumber;
                    }
                    maxPrimeNumber = isPrimeNumber;
                }
            }
            if(maxPrimeNumber == 0){
                for(int i = number; i > 1; i--){
                    if(number%i == 1){
                        maxPrimeNumber = number;
                    }
                }
            }
        } else maxPrimeNumber = -1;
        return maxPrimeNumber;
    }
}
