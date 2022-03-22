#Exercise 23

Напишите метод numberToWords с одним параметром int number. 

Метод должен распечатать переданное число, используя слова для цифр.

Если число отрицательное то необходимо вывести "Invalid Value".

Чтобы напечатать число как слово, выполните следующие действия:

- Извлеките последнюю цифру данного числа, используя оператор остатка.
- Преобразуйте значение цифры, найденной на шаге 1, в слово. Для этой цифры существует 10 возможных значений: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Выведите соответствующее слово для каждой цифры, например выведите «Ноль», если цифра равна 0, «Один», если цифра равна 1, и так далее.
- Удалите последнюю цифру из номера.
- Повторяйте шаги со 2 по 4, пока число не станет равным 0.

Приведенная выше логика верна, но в ее текущем состоянии слова будут напечатаны в обратном порядке. Например, если число равно 234, приведенная выше логика выдаст результат «Четыре Три Два» вместо «Два Три Четыре». Чтобы преодолеть эту проблему, напишите второй метод, называемый reverse.

Метод reverse должен иметь один целочисленный параметр и возвращать перевернутое число (int). Например, если передано число 234, то инвертированное число будет 432. Метод reverse также должен инвертировать отрицательные числа.

Используйте метод reverse в методе numberToWords, чтобы напечатать слова в правильном порядке.

Еще одна вещь, о которой следует помнить, — это любое перевернутое число с ведущими нулями (например, перевернутое число для 100 — это 001). Приведенная выше логика для метода numberToWords напечатает «Один», но это неверно. Он должен напечатать «Один ноль ноль». Чтобы решить эту проблему, напишите третий метод с именем **getDigitCount**.

Метод getDigitCount должен иметь один целочисленный параметр с именем number и возвращать количество цифр в этом числе. Если число отрицательное, верните -1, чтобы указать недопустимое значение.
Например, если число имеет значение 100, метод getDigitCount должен вернуть 3, поскольку число 100 состоит из 3 цифр (1, 0, 0).

Example Input/Output - getDigitCount method

* getDigitCount(0); should return 1 since there is only 1 digit

* getDigitCount(123); should return 3

* getDigitCount(-12); should return -1 since the parameter is negative

* getDigitCount(5200); should return 4 since there are 4 digits in the number

Example Input/Output - reverse method

* reverse(-121); should  return -121

* reverse(1212); should return  2121

* reverse(1234); should return 4321

* reverse(100); should return 1

Example Input/Output - numberToWords method

* numberToWords(123); should print "One Two Three".

* numberToWords(1010); should print "One Zero One Zero".

* numberToWords(1000); should print "One Zero Zero Zero".

* numberToWords(-12); should print "Invalid Value" since the parameter is negative.

Используйте цикл for для печати нулей после изменения числа на противоположное. Как видно из предыдущего примера, 100 в обратном порядке становится 1, но метод numberToWords должен вывести «Один ноль ноль». Чтобы получить количество нулей, проверьте разницу между количеством цифр исходного числа и числа в обратном порядке.
