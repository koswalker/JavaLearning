package Exercise9;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        } else {
            long years = 0;
            long days = 0;
            years = ((minutes/60)/24)/365;
            days = ((minutes/60)/24)%365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}
