package Exercise29;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double number){
        firstNumber = number;
    }

    public void setSecondNumber(double number){
        secondNumber = number;
    }

    public double getAdditionResult(){
        double result = 0;
        result = firstNumber + secondNumber;
        return result;
    }

    public double getSubtractionResult(){
        double result = 0;
        result = firstNumber - secondNumber;
        return result;
    }

    public double getMultiplicationResult(){
        double result = 0;
        result = firstNumber * secondNumber;
        return result;
    }

    public double getDivisionResult(){
        double result = 0;
        if(secondNumber == 0){
            result = 0;
        } else {
            result = firstNumber / secondNumber;
        }
        return result;
    }
}
