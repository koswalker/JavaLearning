#Exercise 25

Напишите метод **getLargestPrime** с одним параметром int number. 

Если number отрицательное или не имеет простых чисел (prime numbers), метод должен вернуть -1. 

Метод должен посчитать самый большой простой множитель заданного числа и вернуть его.

EXAMPLE INPUT/OUTPUT:

* getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)

* getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)

* getLargestPrime (0); should return -1 since 0 does not have any prime numbers

* getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)

* getLargestPrime (-1); should return -1 since the parameter is negative

HINT: Поскольку числа 0 и 1 не считаются простыми числами, они не могут содержать простые числа.

