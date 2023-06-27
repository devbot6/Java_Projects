import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Let's play Rock, Paper, Scissors!\n");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");

        int playerChoice = scanner.nextInt();

        switch (playerChoice) {
            case 1:
                System.out.println("You chose Rock!");
                break;
            case 2:
                System.out.println("You chose Paper!");
                break;
            case 3:
                System.out.println("You chose Scissors!");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                return;
        }

        switch (computerChoice) {
            case 1:
                System.out.println("Computer chose Rock!");
                break;
            case 2:
                System.out.println("Computer chose Paper!");
                break;
            case 3:
                System.out.println("Computer chose Scissors!");
                break;
        }

        if (playerChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if (playerChoice == 1 && computerChoice == 3 || playerChoice == 2 && computerChoice == 1 || playerChoice == 3 && computerChoice == 2) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
