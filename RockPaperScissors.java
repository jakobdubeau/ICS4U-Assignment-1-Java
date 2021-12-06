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
* Rock paper scissors program lets you play rock paper scissors.
*/
public final class RockPaperScissors {

    /** Constant for rock. */
    public static final String ROCK = "rock";

    /** Constant for scissors. */
    public static final String SCISSORS = "scissors";

    /** Constant for paper. */
    public static final String PAPER = "paper";

    /** Constant for win. */
    public static final String WIN = "You Win";

    /** Constant for loss. */
    public static final String LOSE = "You Lose";

    /** Constant for computer move. */
    public static final String COMPUTER = "The computer played: ";

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final String[] rps = {ROCK, PAPER, SCISSORS};
        final String cMove = rps[new Random().nextInt(rps.length)];

        final Scanner scanner = new Scanner(System.in);
        final String pMove;

        System.out.println("Pick rock, paper or scissors: ");
        pMove = scanner.nextLine();

        if (pMove.equals(cMove)) {
            System.out.println(COMPUTER + cMove);
            System.out.println("It was a tie");
        }
        else if (pMove.equals(ROCK)) {
            if (cMove.equals(PAPER)) {
                System.out.println(COMPUTER + cMove);
                System.out.println(LOSE);

            }
            else {
                System.out.println(COMPUTER + cMove);
                System.out.println(WIN);
            }
        }
        else if (pMove.equals(PAPER)) {
            if (cMove.equals(SCISSORS)) {
                System.out.println(COMPUTER + cMove);
                System.out.println(LOSE);

            }
            else {
                System.out.println(COMPUTER + cMove);
                System.out.println(WIN);
            }
        }
        else if (pMove.equals(SCISSORS)) {
            if (cMove.equals(ROCK)) {
                System.out.println(COMPUTER + cMove);
                System.out.println(LOSE);

            }
            else {
                System.out.println(COMPUTER + cMove);
                System.out.println(WIN);
            }
        }
        else {
            System.out.println(pMove + " is not a valid move."
                + " The only choices are rock, paper and scissors");
        }
        System.out.println("\nDone.");
    }
}
