import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess between 1 and 50 (inclusive)!");

        // random generated num
        Random rand = new Random();
        int computerGuess = rand.nextInt(50) +1;

        // inputted num
        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();

        // while loop for guesses
        boolean continueGame = true;
        while (continueGame) {
            if (userGuess > computerGuess){
                System.out.println("Too High!");
                userGuess = scan.nextInt();
            } else if (userGuess < computerGuess) {
                System.out.println("Too Low!");
                userGuess = scan.nextInt();
            } else {
                System.out.println("Correct! Game Over!");
                continueGame = false;
            }
        }
    }
}
