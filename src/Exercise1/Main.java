package Exercise1;

class SpeedConverter{
    public long toMilesPerHour(double kilometersPerHour){
        long milesPerHour;

        if(kilometersPerHour < 0){
            return -1;
        } else {
            return milesPerHour = (long)(Math.round(kilometersPerHour / 1.609));
        }
    }

    public void printConversion (double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        SpeedConverter calculate = new SpeedConverter();
        calculate.printConversion(1.5);
        calculate.printConversion(10.25);
        calculate.printConversion(-5.6);
        calculate.printConversion(25.42);
        calculate.printConversion(75.114);
    }
}
