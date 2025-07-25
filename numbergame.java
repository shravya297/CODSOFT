package TASK1;
import java.util.Random;
import java.util.Scanner;
public class numbergame {
	
	    public static void main(String[] args) {
	        final int MAX_ATTEMPTS = 7;
	        int round = 1;
	        int score = 0;
	        int totalRounds = 0;

	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println(" Welcome to the Number Guessing Game!");

	        while (true) {
	            int numberToGuess = random.nextInt(100) + 1; 
	            int attempts = 0;
	            boolean isCorrect = false;

	            System.out.println("\nRound " + round + ": Guess the number between 1 and 100!");

	            while (attempts < MAX_ATTEMPTS) {
	                System.out.print("Attempt " + (attempts + 1) + "/" + MAX_ATTEMPTS + " - Your guess: ");
	                int guess;
	                if (!scanner.hasNextInt()) {
	                    System.out.println(" Please enter a valid number.");
	                    scanner.next(); 
	                    continue;
	                }

	                guess = scanner.nextInt();
	                attempts++;

	                if (guess == numberToGuess) {
	                    System.out.println(" Correct! You guessed it in " + attempts + " attempts.");
	                    isCorrect = true;
	                    score++;
	                    break;
	                } else if (guess < numberToGuess) {
	                    System.out.println("Too low!");
	                } else {
	                    System.out.println(" Too high!");
	                }
	            }

	            if (!isCorrect) {
	                System.out.println(" You've used all attempts. The number was: " + numberToGuess);
	            }

	            totalRounds++;
	            scanner.nextLine(); 

	            System.out.print("Do you want to play another round? (yes/no): ");
	            String playAgain = scanner.nextLine().toLowerCase();

	            if (!playAgain.equals("yes") && !playAgain.equals("y")) {
	                break;
	            }

	            round++;
	        }
    System.out.println("\nGame Over! You won " + score + " out of " + totalRounds + " rounds.");
	        System.out.println("Thanks for playing!");
	        scanner.close();
	    }
	}

