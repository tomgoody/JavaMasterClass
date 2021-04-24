public class MoreMethodPractice {

    public static void smallerNumber(int num1, int num2, int num3){
        double numreturn;
        if(num1 <= num2 && num1 <= num3){
            numreturn = num1;
        } else if (num2 <= num1 && num2 <= num3){
            numreturn = num2;
        }else numreturn = num3;

        System.out.println(" The smallest value is " + numreturn);
    }

    public static void average(int num1, int num2, int num3){
        double averagenum;

        averagenum = ((num1 + num2 + num3) / 3);
        System.out.println("The average value is: " + averagenum);
    }

    public static void compoundInterest(float investment, float rate, double years){
        System.out.println("Years" + "         FutureValue");
        for (int i = 1; i <= years; i++){
            investment = ((investment * (rate / 100)) + investment);
            System.out.println(i + "        " + investment);
        }
    }
}
