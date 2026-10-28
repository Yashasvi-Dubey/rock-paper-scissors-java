import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        int win = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("0- Rock \n1- paper\n2- Scissor\nEnter your choice ");
        int player = sc.nextInt();

        Random r = new Random();
        int bot = r.nextInt(3);
        switch (bot) {
            case 0 -> System.out.println("Bot chose Rock");
            case 1 -> System.out.println("Bot chose Paper");
            case 2 -> System.out.println("Bot chose Scissor");
        }

        switch (player) {
            case 0: {
                System.out.println("You chose Rock");
                if (bot == 2) {
                    System.out.println("You won!");
                } else if (bot == player) {
                    System.out.println("Draw");
                } else {
                    System.out.println("You lost!");
                }
                break;
            }

            case 1: {
                System.out.println("You chose Paper");
                if (bot == 0) {
                    System.out.println("You won!");
                } else if (bot == player) {
                    System.out.println("Draw");
                } else {
                    System.out.println("You lost!");
                }
                break;

            }

            case 2: {
                System.out.println("You chose Scissor");
                if (bot == 1) {
                    System.out.println("You won!");
                } else if (bot == player) {
                    System.out.println("Draw");
                } else {
                    System.out.println("You lost!");
                }
                break;
            }

            default:
                System.out.println("Choose valid Item");
        }
    }
}
