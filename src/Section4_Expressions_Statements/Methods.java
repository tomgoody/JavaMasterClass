package Section4_Expressions_Statements;

public class Methods {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was: " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tom", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bill", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

    }


    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {

        //Easier to read because there is only 1 return statement and it's returning a standard
        // variable (position) instead of a return for each if statement
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return-1;
    }
}
