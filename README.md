# Number Guessing Game
1. The class NumberGuessingGame contains the main logic for the game.
2. The guessingNumberGame method contains the game implementation.
3. A Scanner object is created to read user input.
4. targetNumber is set to a random integer between 1 and 100 using Math.random(), which generates a double between 0.0 and 1.0. This value is then scaled and shifted to fit the desired range.
5. maxAttempts is set to 5, indicating the number of guesses allowed.
6. This line prints instructions for the user.
7. The loop runs up to maxAttempts times (5 times).
8. In each iteration, the program prompts the user to guess the number and reads their input using scanner.nextInt()
9. If the user's guess matches targetNumber, a congratulatory message is printed, the scanner is closed, and the method returns, ending the game.
10. If the user's guess is less than targetNumber, the program informs the user that the target number is greater, provided there are remaining attempts.
11. If the user's guess is greater than targetNumber, the program informs the user that the target number is less, again provided there are remaining attempts.
12. If the user exhausts all attempts without guessing correctly, a message is printed revealing the target number.
13. The scanner.close() method is called to close the scanner and release resources.
14. The program selects a random number between 1 and 100 and gives the user five attempts to guess it. After each guess, the program provides feedback on whether the guess was too high or too low. If the user guesses correctly within the allowed attempts, they win. Otherwise, the correct number is revealed after all attempts are exhausted.


# CurrencyConverter

1. **Exchange Rates Initialization:**
   - A `HashMap` named `exchangeRates` stores exchange rates relative to USD.
   - The static block initializes the map with some example exchange rates.

2. **Main Method:**
   - Prompts the user to enter the source currency, target currency, and amount to be converted.
   - Ensures the user inputs valid currency codes and a valid amount.
   - Calls the `convertCurrency` method to perform the conversion and displays the result.

3. **convertCurrency Method:**
   - Takes the source currency, target currency, and amount as input.
   - Retrieves the exchange rates for both currencies from the map.
   - Converts the amount from the source currency to the target currency using the formula: `amount * (targetRate / sourceRate)`.

### Running the Code
To run this program:
1. Save the code in a file named `CurrencyConverter.java`.
2. Compile the code using `javac CurrencyConverter.java`.
3. Run the compiled class using `java CurrencyConverter`.

