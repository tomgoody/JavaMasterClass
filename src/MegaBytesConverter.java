public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0){
            System.out.println(kiloBytes + " KB = " + kiloBytes +" MB and "+ kiloBytes + " KB");
        } else {
            int megaByte = 1024;
            int megaBytes = kiloBytes / megaByte;
            int Remainder = kiloBytes % megaByte;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + Remainder + " KB" );
        }

    }
}
