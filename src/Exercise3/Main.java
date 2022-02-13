package Exercise3;

class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if(barking != true) {
            return false;
        } else if(hourOfDay<8 || hourOfDay>22){
            return true;
        } else return false;
    }
}

public class Main {

    public static void main(String[] args) {
        BarkingDog ob = new BarkingDog();
        if(ob.shouldWakeUp (true, -1) == true){
            System.out.println("true");
        } else System.out.println("false");
    }
}
