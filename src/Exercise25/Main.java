package Exercise25;

public class Main {
    public static void main(String[] args){
        LargestPrime ob = new LargestPrime();
        System.out.println(ob.getLargestPrime(21));
        System.out.println(ob.getLargestPrime(217));
        System.out.println(ob.getLargestPrime(0));
        System.out.println(ob.getLargestPrime(45));
        System.out.println(ob.getLargestPrime(-1));
        System.out.println(ob.getLargestPrime(7));
        System.out.println(ob.getLargestPrime(16));
    }
}
