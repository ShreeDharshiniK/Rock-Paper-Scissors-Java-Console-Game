import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        char playAgain = 'y';   // ✅ FIX HERE

        do {
            System.out.println("\n--- Rock Paper Scissors Game ---");
            System.out.print("Enter rock, paper or scissors: ");
            userChoice = sc.next().toLowerCase();

            // Validate input
            if (!userChoice.equals("rock") &&
                !userChoice.equals("paper") &&
                !userChoice.equals("scissors")) {

                System.out.println("Invalid choice! Try again.");
                continue;
            }

            computerChoice = choices[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } 
            else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } 
            else {
                System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
