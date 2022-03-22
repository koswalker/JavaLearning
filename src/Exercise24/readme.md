#Exercise 24

Напишите метод canPack с тремя параметрами int bigCount, smallCount, and goal.

- Параметр bigCount представляет собой количество больших мешков с мукой (5кг шт).
- Параметр smallCount представляет собой количество маленьких мешков с мукой (1кг шт).
- Параметр goal представляет собой целевое количество килограммов муки, необходимое для сборки упаковки.

Следовательно, сумма килограммов bigCount и smallCount должна быть как минимум равна значению цели. Метод должен возвращать true, если можно сделать пакет с целевыми килограммами муки

Если сумма превышает цель, убедитесь, что для достижения цели используются только полные сумки. Например, если target = 9, bigCount = 2 и smallCount = 0, метод должен вернуть false, так как каждый большой мешок весит 5 кг и не может быть разделен. Однако, если target = 9, bigCount = 1 и smallCount = 5, метод должен возвращать значение true, поскольку 1 полный мешок bigCount и 4 полных мешка smallCount равны цели, и ничего страшного, если останутся дополнительные мешки.

Если какой-либо из параметров отрицательный, вернуть false.

EXAMPLE INPUT/OUTPUT:

* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

* canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.

* canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.

* canPack (-3, 2, 12); should return false since bigCount is negative.

