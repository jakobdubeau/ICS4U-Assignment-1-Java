/*
*
* The Rock paper scissors program lets you play rock paper scissors.
* 
*
* @author Jakob
* @version 1.0
* @since 2020-12-02
*/

import java.util.Random;
import java.util.Scanner;

/**
* Prevent instantiation.
* Throw an exception IllegalStateException.
* if this ever is called
*
* @throws IllegalStateException
*
*
*/

public class RockPaperScissors {

public static final String ROCK = "rock";

public static final String SCISSORS = "scissors";

public static final String PAPER = "paper";

    public static void main(String[] args) {

    String[] rps = {ROCK, PAPER, SCISSORS};
    String cMove = rps[new Random().nextInt(rps.length)];

    Scanner scanner = new Scanner(System.in);
    String pMove;

    while(true) {
    System.out.println("Pick rock, paper or scissors: ");
    pMove = scanner.nextLine();
    if (pMove.equals(ROCK) || pMove.equals(PAPER) || pMove.equals(SCISSORS)) {
        break;
    }
    System.out.println(pMove + " is not a valid move. The only choices are rock, paper and scissors");
    }

    System.out.println("The computer played: " + cMove);

    if (pMove.equals(cMove)) {
        System.out.println("It was a tie");
    }
    else if (pMove.equals(ROCK)) {
         if (cMove.equals(PAPER)) {
           System.out.println("You lose");

          } else if (cMove.equals(SCISSORS)) {
              System.out.println("You Win");
         }
    }
    else if (pMove.equals(PAPER)) {
        if (cMove.equals(SCISSORS)) {
             System.out.println("You lose");

        } else if (cMove.equals(ROCK)) {
               System.out.println("You Win");
         }
     }      
     else if (pMove.equals(SCISSORS)) {
         if (cMove.equals(ROCK)) {
             System.out.println("You lose");

         } else if (cMove.equals(PAPER)) {
         System.out.println("You Win");
    }
    System.out.println("\nDone.");
   }
}
}
