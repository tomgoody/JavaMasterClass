package Section4_Expressions_Statements;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temp){
        if(summer && temp <= 45 && temp >= 25){
            return true;
        } else if(!summer && temp <= 35 && temp >= 25){
            return true;
        }
        return false;
    }

}
