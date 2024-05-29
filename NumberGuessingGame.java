import java.util.Scanner;

public class NumberGuessingGame {

    // Function that implements the number guessing game
    public static void guessingNumberGame() {
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int targetNumber = 1 + (int) (100 * Math.random());
        int maxAttempts = 5;

        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");

        // Iterate over the allowed number of attempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Guess the number: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number.");
                scanner.close();
                return;
            } else if (userGuess < targetNumber) {
                if (attempt < maxAttempts) {
                    System.out.println("The number is greater than " + userGuess);
                }
            } else {
                if (attempt < maxAttempts) {
                    System.out.println("The number is less than " + userGuess);
                }
            }
        }

        System.out.println("You have exhausted all trials. The number was " + targetNumber);
        scanner.close();
    }

    // Driver Code
    public static void main(String[] args) {
        guessingNumberGame();
    }
}
