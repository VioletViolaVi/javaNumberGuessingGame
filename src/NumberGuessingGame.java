import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        boolean continueGame = true;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int computerGuess = rand.nextInt(5);
        int userGuess = scan;

        while (continueGame) {
            if (userGuess > computerGuess){
                System.out.println("Too High!");
            } else if (userGuess < computerGuess) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct!");
                continueGame = false;
            }
        }
    }
}
