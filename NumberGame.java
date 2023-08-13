import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minNumber = 1;
        int maxNumber = 100;
        int maxAttempts = 10;
        int round = 1;
        int score = 0;

        System.out.println("Welcome to the Number Game!");
        System.out.println("Guess the number between " + minNumber + " and " + maxNumber + ".");

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            System.out.println("\nRound " + round + ":");
            int attempts = 0;
            boolean found = false;

            while (!found && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                    found = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }

            if (!found) {
                System.out.println("\nGame Over! The correct number was: " + targetNumber);
            }

            round++;

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for playing! Your total score is: " + score);
        scanner.close();
    }
}
