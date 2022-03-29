#Exercise 29

Напишите класс SimpleCalculator. Класс должен иметь два поля **double firstNumber**, **double secondNumber.**\
Напишите методы: 
- **getFirstNumber()**, без параметров, возвращает firstNumber.
- **getSecondNumber()**, без параметров, возвращает secondNumber. 
- **setFirstNumber(double number)**.
- **setSecondNumber(double number)**.
- **getAdditionResult()**, он должен вернуть результат сложения значений полей firstNumber и secondNumber.
- **getSubtractionResult()**, он должен вернуть результат вычитания значений поля secondNumber из firstNumber.
- **getMultiplicationResult()**, он должен вернуть результат умножения значений поля firstNumber и secondNumber.
- **getDivisionResult()**, он должен вернуть результат деления значений поля firstNumber на secondNumber. Если значение secondNumber равно 0, верните 0.

TEST EXAMPLE

TEST CODE:

SimpleCalculator calculator = new SimpleCalculator();\
calculator.setFirstNumber(5.0);\
calculator.setSecondNumber(4);\
System.out.println("add= " + calculator.getAdditionResult());\
System.out.println("subtract= " + calculator.getSubtractionResult());\
calculator.setFirstNumber(5.25);\
calculator.setSecondNumber(0);\
System.out.println("multiply= " + calculator.getMultiplicationResult());\
System.out.println("divide= " + calculator.getDivisionResult());\

OUTPUT

add= 9.0\
subtract= 1.0\
multiply= 0.0\
divide= 0.0\

TIPS:

*add= 9.0 is printed because 5.0 + 4 is 9.0\
*subtract= 1.0 is printed because 5.0 - 4 is 1.0\
*multiply= 0.0 is printed because 5.25 * 0 is 0.0\
*divide= 0.0 is printed because secondNumber is set to 0\