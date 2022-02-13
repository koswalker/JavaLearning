#Exercise 3

У нас есть пес, который любит лаять. Нам необходимо проснуться если пес начнет лаять ночью.

Напишите метод shouldWakeUp который имеет 2 параметра.
1 параметр должен быть типа boolean и должен называться barking, это значит что наша собака сейчас лает.

2 параметр означает час дня имеющий тип int и имя hourOfDay и должен быть в допустимом диапазоне 0-23.

Мы должны проснуться если пес залаял между раньше 8 и позже 22 часами это вернет значение true. В любых других случая должен вернуть значение false.

Если значение hourOfDay меньше 0 или больше 23 возвращает false.

Examples of input/output:

shouldWakeUp (true, 1); → should return true

shouldWakeUp (false, 2); → should return false since the dog is not barking.

shouldWakeUp (true, 8); → should return false, since it's not before 8.

shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.

Используйте конструкции if else с множественными условиями.

Метод shouldWakeUp должен быть объявлен как public static