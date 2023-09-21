import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;
        int totalRoundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess the number between " + lowerBound + " and " + upperBound + ".");

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean roundWon = false;

            System.out.println("Round " + (rounds + 1) + ": Guess the number!");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    totalRoundsWon++;
                    roundWon = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!roundWon) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            totalAttempts += attempts;
            rounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Game over! You played " + rounds + " rounds.");
        System.out.println("You won " + totalRoundsWon + " rounds.");
        System.out.println("Your average attempts per round: " + (totalAttempts / (double) rounds));

        scanner.close();
    }
}
