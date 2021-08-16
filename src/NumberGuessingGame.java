import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess between 1 and 200 (inclusive)!");

        // random generated num
        Random rand = new Random();
        int computerGuess = rand.nextInt(200) +1;

        // inputted num
        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();

        // while loop for guesses
        boolean continueGame = true;
        while (continueGame) {
            if (userGuess <= 0 || userGuess >= 201) {
                System.out.println("Out of bounds! Guess between 1 and 200 (inclusive)!");
                userGuess = scan.nextInt();
            } else {
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
}
