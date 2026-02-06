/**
 * 
 * @author Payton Burke
 * @version 2/5/26
 * (MY VERSION)
 * code that will generate a random number between 1 and 10, and have the user guess it
 * 
 */
import java.util.Scanner;


public class myTurn {
    //sets the number to be guessed from 1 to 10 
    public static int myNumber = (int)(Math.random() * 50) + 1;
    //users guess
    public static int userGuess = 0;


    public static void main(String[] args) {
    
    System.out.println("Welcome to the Guessing Game! Please guess a number between 1 and 10:");
   //scanner allows user input
    Scanner scanner = new Scanner(System.in);
    //saves the users input into the variable userGuess
    userGuess = scanner.nextInt();
    //first if statement checks if the guess is out of range
    if(userGuess < 10 || userGuess > 50){
        System.out.println("Your guess is out of range. Please guess a number between 10 and 50.");
    //if the guess is in range, checks if its higher, lower, or equal to the random number
    } else if (userGuess < myNumber) {
        System.out.println("Your guess is too low! Try again!");
        userGuess = scanner.nextInt();
    } else if (userGuess > myNumber) {
        System.out.println("Your guess is too high! Try again!");
        userGuess = scanner.nextInt();
    } else if ( userGuess == myNumber) {
        System.out.println("Congratulations! You guessed the correct number: " + myNumber);
    }
    //closes the scanner so no more accidental inputs can be made
    scanner.close();
}

}
