import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int die1;
        int die2;
        int crapsRoll;
        int points=0;
        String YNResponse;
        boolean done = false;

        do {

            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            crapsRoll = die2 + die1;

            //outputs the results for the dice
            System.out.println("The first die is :" + die1 + " The second die is: " + die2 + " The sum of the dies is: " + crapsRoll);

            //checking win or loss on first round
            if ((crapsRoll == 2) || (crapsRoll == 3) || (crapsRoll == 12)) { //lose if 2,3, or 12
                System.out.println("Craps! You lose, game over.");

            } else if ((crapsRoll == 7) || (crapsRoll == 11)) {
                //win if 7 or 11
                System.out.println("You win!");

            }
            else {

                //will keeping going until the points matches or is equal to 7
                while (points != crapsRoll && points != 7) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    points = die2 + die1;

                    //outputs the result for the next rounds
                    System.out.println("The first die is :" + die1 + " The second die is: " + die2 + " The sum of the dies is: " + points);
                }
                if (points == crapsRoll) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
            System.out.print("Do you want to play again? [Y/N]: ");
            YNResponse = in.nextLine();
            if (YNResponse.equalsIgnoreCase("N")) {
            done = true; //if answer is no then it's true that the player is done
            }
        }
        while(!done);
    }
}