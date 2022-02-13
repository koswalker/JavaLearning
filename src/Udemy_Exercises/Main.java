package Udemy_Exercises;

class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            }else return true;
        } else return false;
    }
}


public class Main {

    public static void main(String[] args) {
        int years_1[] = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600};
        int years_2[] = {1600, 2000, 2400};
        LeapYear ob = new LeapYear();
        System.out.println (ob.isLeapYear(-1600));
        System.out.println (ob.isLeapYear(1600));
        System.out.println (ob.isLeapYear(2017));
        System.out.println (ob.isLeapYear(2000));
        for(int i=0; i<years_1.length; i++) System.out.println(ob.isLeapYear(years_1[i]));
        for(int i=0; i<years_2.length; i++) System.out.println(ob.isLeapYear(years_2[i]));
    }

}
