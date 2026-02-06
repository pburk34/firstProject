/**
 * 
 * @author Payton Burke
 * @version 2/5/26
 * (COPILOT VERSION)
 * code that will generate a random number between 1 and 10, and have the user guess it
 * 
 */
public class starter {
    public static void main(String args[]) {
        // Your code goes below here
        int randomNumber = (int)(Math.random() * 10) + 1;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int userGuess = 0;

        System.out.println("I have selected a random number between 1 and 10. Can you guess it?");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + "!");
            }
        }

        scanner.close();
    }
}
