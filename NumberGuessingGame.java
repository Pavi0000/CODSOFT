import java.util.Scanner;

public class NumberGuessingGame {

    // Function that implements the number guessing game
    public static void guessingNumberGame(Scanner scanner) {
        // Generate a random number between 1 and 100
        int targetNumber = 1 + (int) (100 * Math.random());
        int maxAttempts = 5;
        int attempts = 0;
        
        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");

        // Iterate over the allowed number of attempts
        while (attempts < maxAttempts) {
            System.out.print("Guess the number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                scanner.next(); // Clear the invalid input
                continue;
            }
            int userGuess = scanner.nextInt();
            
            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }
            
            attempts++;
            
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number.");
                return;
            } else if (userGuess < targetNumber) {
                System.out.println("The number is greater than " + userGuess);
            } else {
                System.out.println("The number is less than " + userGuess);
            }

            // Provide hints based on proximity
            if (Math.abs(userGuess - targetNumber) <= 10) {
                System.out.println("Hint: You are very close!");
            } else if (Math.abs(userGuess - targetNumber) <= 20) {
                System.out.println("Hint: You are close!");
            }
        }

        System.out.println("You have exhausted all trials. The number was " + targetNumber);
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesPlayed = 0;
        int gamesWon = 0;
        String playAgain;

        do {
            guessingNumberGame(scanner);
            gamesPlayed++;
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Games played: " + gamesPlayed);
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
