package Exercise28;

public class Main {
    public static void main(String[] args){
        PaintJob ob = new PaintJob();
        System.out.println(ob.getBucketCount(-3.4, 2.1, 1.5, 2)); // -1
        System.out.println(ob.getBucketCount(3.4, 2.1, 1.5, 2)); // 3
        System.out.println(ob.getBucketCount(2.75, 3.25, 2.5, 1)); // 3
        System.out.println(ob.getBucketCount(-3.4, 2.1, 1.5)); // -1
        System.out.println(ob.getBucketCount(3.4, 2.1, 1.5)); // 5
        System.out.println(ob.getBucketCount(7.25, 4.3, 2.35)); // 14
        System.out.println(ob.getBucketCount(3.4, 1.5)); // 3
        System.out.println(ob.getBucketCount(6.26, 2.2)); // 3
        System.out.println(ob.getBucketCount(3.26, 0.75)); // 5

    }
}
