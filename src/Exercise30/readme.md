#Exercise 30

Напишите класс Person. Класс имеет три поля String firstName, String lastName, int age.

Напишите методы:
- **getFirstName**, он возвращает значение firstName. 
- **getLastName**, он возвращает значение lastName. 
- **getAge**, он возвращает значение age.
- **setFirstName**, с одним параметром типа String он устанавливает значение firstName.
- **setLastName**, с одним параметром типа String он устанавливает значение lastName. 
- **setAge**, с одним параметром типа int, он устанавливает значение age. 
- **isTeen**, без парам-в, он возвращает true значение возраста в диапазоне от 12 до 20, в противном случае false. 
- **getFullName**, юбез параметров, он возвращает полное имя персоны. 
- Если поля firstName и lastName пусты, строки возвращают пустую строку.
- Если lastName является пустой строкой, верните firstName.
- Если firstName является пустой строкой, вернуть lastName.

Чтобы проверить, пуста ли строка s, используйте метод isEmpty из класса String. Например, firstName.isEmpty() возвращает true, если строка пуста или, другими словами, если строка не содержит символов.

TEST EXAMPLE

TEST CODE:

Person person = new Person();\
person.setFirstName("");   // firstName is set to empty string\
person.setLastName("");    // lastName is set to empty string\
person.setAge(10);\
System.out.println("fullName= " + person.getFullName());\
System.out.println("teen= " + person.isTeen());\
person.setFirstName("John");    // firstName is set to \
person.setAge(18);
System.out.println("fullName= " + person.getFullName());\
System.out.println("teen= " + person.isTeen());\
person.setLastName("Smith");    // lastName is set to Smith\
System.out.println("fullName= " + person.getFullName());\

OUTPUT

fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
