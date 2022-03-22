package Exercise24;

import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){
        FlourPacker ob = new FlourPacker();
        System.out.println(ob.canPack(1, 0, 4));
        System.out.println(ob.canPack(1, 0, 5));
        System.out.println(ob.canPack(0, 5, 4));
        System.out.println(ob.canPack(2, 2, 11));
        System.out.println(ob.canPack(-3, 2, 12));
        System.out.println(ob.canPack(0, 5, 5));
        System.out.println(ob.canPack(2, 10, 18));
    }
}
