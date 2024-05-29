# CODSOFT
The class NumberGuessingGame contains the main logic for the game.
The guessingNumberGame method contains the game implementation.
A Scanner object is created to read user input.
targetNumber is set to a random integer between 1 and 100 using Math.random(), which generates a double between 0.0 and 1.0. This value is then scaled and shifted to fit the desired range.
maxAttempts is set to 5, indicating the number of guesses allowed.
This line prints instructions for the user.
The loop runs up to maxAttempts times (5 times).
In each iteration, the program prompts the user to guess the number and reads their input using scanner.nextInt()
If the user's guess matches targetNumber, a congratulatory message is printed, the scanner is closed, and the method returns, ending the game.
If the user's guess is less than targetNumber, the program informs the user that the target number is greater, provided there are remaining attempts.
If the user's guess is greater than targetNumber, the program informs the user that the target number is less, again provided there are remaining attempts.
If the user exhausts all attempts without guessing correctly, a message is printed revealing the target number.
The scanner.close() method is called to close the scanner and release resources.
The program selects a random number between 1 and 100 and gives the user five attempts to guess it. After each guess, the program provides feedback on whether the guess was too high or too low. If the user guesses correctly within the allowed attempts, they win. Otherwise, the correct number is revealed after all attempts are exhausted.
