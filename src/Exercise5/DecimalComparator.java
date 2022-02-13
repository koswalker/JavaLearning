package Exercise5;

public class DecimalComparator {

    public boolean areEqualByThreeDecimalPlaces (double i, double j){
        if (((int)(i*1000))== ((int)(j*1000))){
            return true; //
        } else return false;
    }
}

