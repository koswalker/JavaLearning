#Exercise 1.

Напишите метод вызываемый toMilesPerHour который имеет 1 параметр типа double с именем kilometersPerHour. Этот метод должен возвращаться округленное значение типа long.

	Если параметр kilometersPerHour  меньше 0 , то метод toMillesPerHour должен вернуть -1 что значит invalid value. Если же значение позитивно, нужно пересчитать его в мили/час, округлить и вернуть. 

	Examples of input/output:
* toMilesPerHour(1.5); → should return value 1
* toMilesPerHour(10.25); → should return value 6
* toMilesPerHour(-5.6); → should return value -1
* toMilesPerHour(25.42); → should return value 16
* toMilesPerHour(75.114); → should return value 47


Напишите другой метод printConversion с одним параметром типа double с именем kilometersPerHour. Этот метод должен быть void и он должен конвертировать milesPerHor из kilometersPerHour и выводить на экран “(значение) km/h = (округленное значение) mi/h”.

Если kilometersPerHour меньше 0 то нужно выводить на экран сообщение “invalid value”.

Examples of input/output:
* printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
* printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
* printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
* printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
* printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h


Используйте метод Math.round чтобы округлить значение milesPerHour типа double.
Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.


How to use the metho

