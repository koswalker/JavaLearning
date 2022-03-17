#Exercise 22

Какое совершенное число?

Совершенное число — это целое положительное число, равное сумме своих собственных положительных делителей.

Правильные положительные делители — это положительные целые числа, которые полностью делят совершенное число, не оставляя остатка, и исключают само совершенное число.

Например, возьмем число 6:
Его собственные делители равны 1, 2 и 3 (поскольку 6 является значением совершенного числа, оно исключается), а сумма его собственных делителей равна 1 + 2 + 3 = 6.
Следовательно, 6 — совершенное число (как и первое совершенное число).


Напишите метод isPerfectNumber с одним параметром int number. 

Если number < 1 то верните false. 

Метод должен посчитать если число идеальное. Если число идеальное, метод должен вернуть true, в противном случае false. 

EXAMPLE INPUT/OUTPUT:

* isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6

* isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28

* isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5

* isPerfectNumber(-1); should return false since the number is < 1

