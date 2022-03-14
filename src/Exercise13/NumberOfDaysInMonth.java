package Exercise13;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            }else return true;
        }  else return false;
    }

    public static int getDaysInMonth(int month, int days){
        if(month>=1 && month<=12){
            if(days>1 && month<=9999){

            } else return -1;
        } else {
            return -1;
        }
    }
}
