#Exercise 28

Боб — маляр, и ему нужна ваша помощь. Вам нужно написать программу, которая поможет Бобу вычислить, сколько ведер краски ему нужно купить, прежде чем идти на работу. У Боба также могут быть дополнительные ведра дома. Он также знает площадь, которую может покрыть одним ведром краски.

1. Напишите метод getBucketCount с 4 параметрами. \


1. double width.  Означающий ширину стены. 
2. double height. Означающий высоту стены.
3. double areaPerBucket. Этот параметр представляет площадь, которую можно покрыть одним ведром краски.
4. int extraBuckets. Этот параметр представляет количество ведер, которые есть у Боба дома.

Метод должен возвращать значение типа int. Это число количество ведер краски, которое необходимо купить Бобу перед работой.\
Если один из параметров width, height или areaPerBucket меньше или равен 0 или если extraBuckets меньше 0, метод должен вернуть -1, чтобы указать недопустимое значение.

Если все параметры допустимы, метод должен вычислить количество сегментов и вернуть его.

Examples of input/output:

*getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid

*getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.

*getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

2. Бобу не нравится вводить 0 для параметра extraBuckets, поэтому ему нужен другой метод.\
Напишите еще один перегруженный метод с именем getBucketCount с тремя параметрами, а именно шириной, высотой и areaPerBucket (все они имеют тип double).\
Этот метод должен возвращать значение типа int, представляющее количество ведер, которые Боб должен купить, прежде чем приступить к работе.\
Если один из параметров width, height или areaPerBucket меньше или равен 0, метод должен вернуть -1, чтобы указать недопустимое значение.\
Если все параметры допустимы, метод должен вычислить количество сегментов и вернуть его.

Examples of input/output:

*getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid

*getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.

*getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.

3. В некоторых случаях Боб не знает ширины и высоты стены, но знает площадь стены. Ему нужно, чтобы вы написали другой метод.\
Напишите еще один перегруженный метод с именем getBucketCount с двумя параметрами, а именно: area и areaPerBucket (оба типа double).\
Метод должен возвращать значение типа int, представляющее количество ведер, которые Боб должен купить, прежде чем приступить к работе.\
Чтобы рассчитать количество ведер, см. примечания ниже.\
Если один из параметров area или areaPerBucket меньше или равен 0, метод должен вернуть -1, чтобы указать недопустимое значение.

Examples of input/output:

*getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5

*getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.

*getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .

ПРИМЕЧАНИЕ. Используйте метод Math.ceil для округления числа рассчитанных сегментов (double), затем преобразуйте его в целое число, прежде чем возвращать значение из методов.
