package gasergame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

public class GaserGame {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the Gaser Game!");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int targetNumber = random.nextInt(50) + 1;
        int userGuess = 0;

        while (true) {
            System.out.print("Enter your guess (1-50): ");
            try {
                userGuess = Integer.parseInt(reader.readLine());
                if (userGuess < 1 || userGuess > 50) {
                    System.out.println("Please enter a number between 1 and 50.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}
