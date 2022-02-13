#Exercise 2.

Напишите метод printMegaBytesAndKiloBytes, у которого один параметр типа int с именем kiloBytes.

Метод должен быть void  и должен пересчитывать мегабайты и оставшиеся килобайты из переданного методу параметра kilobytes.
Он должен выводить сообщение “XX KB = YY MB and ZZ KB” где,

XX это значение аргумента kiloBytes. YY это рассчитанное значение megabytes. ZZ это рассчитанное значение remaining kilobytes.

Для примера, когда аргумент kiloBytes равен 2500 он должен вывести “2500 KB = 2 MB и 452 KB”.

Если параметр kiloBytes меньше 0 то выводит сообщение “Invalid Value”.

EXAMPLE INPUT/OUTPUT

printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"

printMegaBytesAndKiloBytes(-1024); → should print the following text: "Invalid Value" because parameter is less than 0.

printMegaBytesAndKiloBytes(5000); → should print the following text: "5000 KB = 4 MB and 904 KB"

Заметки: Будьте крайне (extremely) аккуратны используя пробелы в выводимом сообщении. Используйте оператор остатка(remainder operator)
1MB = 1024 KB Не присваивайте значение параметру kilobytes внутри метода. Решение не может быть принято если есть лишние пробелы. метод printMegaBytesAndKiloBytes должен быть объявлен как public static.