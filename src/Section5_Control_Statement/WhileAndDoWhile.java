package Section5_Control_Statement;

public class WhileAndDoWhile {
    public static void main(String[] args) {
/*        int count = 1;
        while (count != 6){
            System.out.println("Count value is " + count);
            count ++;
        }
        System.out.println();
        System.out.println("********************");

        count =1;
        do {
            System.out.println("Count value was " + count);
            count++;
        }while (count!=6);
    }*/
        int number = 4;
        int finishNumber = 20;
        int count = 0;


         while (number<=finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            if (count <= 4) {
                System.out.println(number + " is even");
                count++;
            }
        }

    }
    public static boolean isEvenNumber(int num){
            if (num % 2 == 0) {
                return true;
        } else {
                return false;
            }
    }
}
