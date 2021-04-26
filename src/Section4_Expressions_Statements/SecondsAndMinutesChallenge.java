package Section4_Expressions_Statements;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";


    public static void main(String[] args) {
       System.out.println(getDurationString(65, -1));
       System.out.println(getDurationString(10));
    }

    public static String getDurationString(long minutes, long seconds){
        if(minutes < 0 || (seconds < 0)){
            return INVALID_VALUE_MESSAGE;

        } if (seconds > 59){
            minutes += (seconds / 60);
            seconds = (seconds % 60);
        }
        minutes += (seconds / 60);
        seconds = (seconds % 60);
        long hours = (minutes / 60);
        minutes = (minutes % 60);
        return hours + "h " + minutes + "m " + seconds + "s ";
    }

    public static String getDurationString(long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = (seconds / 60);
        long remainingSeconds = (seconds % 60);
        return getDurationString(minutes, remainingSeconds);
    }
}
