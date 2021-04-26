package Section5_Control_Statement;

public class Switch {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was 3 or 4 or 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

    char ch = 'F';
    switch (ch){
        case 'A':
            System.out.println("Character was 'A' ");
            break;
        case 'B':
            System.out.println("Character was 'B' ");
            break;
        case 'C':
            System.out.println("Character was 'C' ");
            break;
        case 'D':
            System.out.println("Character was 'D' ");
            break;
        case 'E':
            System.out.println("Character was 'E'");
            break;
        default:
            System.out.println("Not Found");
        }
    }
}
