
public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wake;
        if ((barking == true && hourOfDay > 23 || hourOfDay < 0) || barking == false) {
            wake = false;

        } else if (wake = true == (barking == true && hourOfDay < 8 || hourOfDay > 22)){

        }
        System.out.println(wake);
        return wake;
        }

    }


