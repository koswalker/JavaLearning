package Exercise28;

public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
        int numberOfBuckets = 0;

        if(width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0){
            numberOfBuckets = -1;
        }else{
            double area = width * height;
            double fullCntOfBuckets = Math.ceil((double)area/areaPerBucket);
            numberOfBuckets = ((int)fullCntOfBuckets - extraBuckets);
        }

        return numberOfBuckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket){
        int numberOfBuckets = 0;

        if(width <= 0 || height <=0 || areaPerBucket <= 0){
            numberOfBuckets = -1;
        }else{
            double area = width * height;
            double fullCntOfBuckets = Math.ceil((double)area/areaPerBucket);
            numberOfBuckets = (int)fullCntOfBuckets;
        }

        return numberOfBuckets;
    }

    public static int getBucketCount (double area, double areaPerBucket){
        int numberOfBuckets = 0;

        if(areaPerBucket <= 0 || area <= 0){
            numberOfBuckets = -1;
        }else{
            double fullCntOfBuckets = Math.ceil((double)area/areaPerBucket);
            numberOfBuckets = (int)fullCntOfBuckets;
        }

        return numberOfBuckets;
    }
}
