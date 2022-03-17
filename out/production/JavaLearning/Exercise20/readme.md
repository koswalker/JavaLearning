#Exercise 20

Напишите метод getGreatestCommonDivisor с двумя параметрами int named, int second.

Если один из параметров меньше 10, метод должен вернуть -1. 

Метод должен возвращать больший общий знаменатель двух чисел. 

Наибольший общий делитель — это наибольшее положительное целое число, на которое можно полностью разделить каждое из целых чисел (т. е. без остатка).

For example 12 and 30:

12 can be divided by 1, 2, 3, 4, 6, 12

30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

EXAMPLE INPUT/OUTPUT:

* getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder

* getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder

* getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10

* getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder

