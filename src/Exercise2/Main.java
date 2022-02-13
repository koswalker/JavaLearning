package Exercise2;


    class MegaBytesConverter {
        public static void printMegaBytesAndKiloBytes (int kiloBytes){
            if(kiloBytes<0){
                System.out.println("Invalid Value");
            } else {
                System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
            }
        }
    }

    public class Main {

        public static void main(String[] args) {
            MegaBytesConverter ob = new MegaBytesConverter();

            ob.printMegaBytesAndKiloBytes(5000);
        }
    }


