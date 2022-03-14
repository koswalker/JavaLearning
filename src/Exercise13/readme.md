#Exercise 13

Напишите метод **isLeapYear** с параметром **int year**.
Параметр должен быть в диапозоне от 1 до 9999 включительно. 
Если параметр не в идапазоне, нужно вернуть false.
В противном случае, если параметр в диапазоне, посчитайте и если год высокостный верните true. Если нет false. 
Год является высокостный если делится на 4 или 400 но не на 100. 

Examples of input/output:

* isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)

* isLeapYear(1600); → should return true since 1600 is a leap year

* isLeapYear(2017); → should return false since 2017 is not a leap year

* isLeapYear(2000); → should return true because 2000 is a leap year

Напишите другой метод **getDaysInMonth** с двумя параметрами **int month** и **int year.**

Если параметр **month** меньше 1 или больше 12, верните -1. 
Если параметр **year** меньше 1 или больше 12, верните -1. 

Метод должен вернуть количество дней в месяце. Будьте осторожны с высокостным годом, он имеет 29 дней во втором месяце (February).

Вы должны проверить если год высокостный  используя метод **isLeapYear**

Examples of input/output:

* getDaysInMonth(1, 2020); → should return 31 since January has 31 days.

* getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.

* getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

* getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.

* getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.

**TIP:** Используйте оператор switch.
