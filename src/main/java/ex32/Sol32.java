package ex32;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number.
Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low.
The computer should also keep track of the number of guesses.
Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.
 */

import java.util.Scanner;

public class Sol32 {

    private static int numberPC=0;
    private static int numGuesses=0;

    public static void main(String[] args){
        GuessGame game=new GuessGame();
        Scanner in=new Scanner(System.in);

        System.out.println("Let's play Guess the Number!\n");

        boolean playAgain=true;
        while(playAgain) {

            System.out.println("Enter the difficulty level (1, 2, or 3): ");
            int difficulty = in.nextInt();
            numberPC=game.pickNumber(difficulty);

            System.out.println("I have my number. What's your guess? ");
            int playersGuess=in.nextInt();
            numGuesses=1;

            while(playersGuess!=numberPC){
                if(playersGuess<numberPC){
                    System.out.println("Too low. Guess again: ");
                }else{
                    System.out.println("Too high. Guess again: ");
                }
                playersGuess=in.nextInt();
                numGuesses++;
            }

            System.out.println("You got it in "+numGuesses+" guesses!");
            System.out.println("Do you wish to play again (Y/N)? n");
            String answer=in.next();

            if(answer.equalsIgnoreCase("n")){
                playAgain=false;
            }
        }
    }
}

