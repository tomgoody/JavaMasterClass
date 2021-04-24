// The method with the return statement is what must be used first and be assigned to a variable.
// That assigned variable is then used in the second method to inject the answer from the first method
public class MoreMethods {
    public static void main(String[] args) {
/*        int ingredient = numberIngredients(12);
        nameAndIngredients("chicken", ingredient);

        ingredient = numberIngredients(23);
        nameAndIngredients("hamburger", ingredient);
    }

    public static void nameAndIngredients(String recName, int ingredient){
        System.out.println("The name of the recipe is " + recName +
                " and the number of ingredients needed is " + ingredient);
    }

    public static int numberIngredients(int ingredientrank) {
        if (ingredientrank > 20){
            return 1;
        }else if (ingredientrank < 20 && ingredientrank > 10){
            return 2;
        }
        return 3;
    }*/
        int finalScore = whatsTheScore(502);
        scorePlace("Tom", finalScore);

    }


        public static void scorePlace(String name, int finalScore){
            System.out.println("The high scorer is " + name + " their place on the score board is " +
                    finalScore);
        }

        public static int whatsTheScore(int highscore){
            if( highscore >= 1000) {
                return 1;
            } else if(highscore >= 500){
                return 2;
            }else if(highscore >= 100){
                return 3;
            }else return 4;
        }

    }

