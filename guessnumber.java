import java.util.Random;
import java.util.Scanner;
import java.lang.String;
public class guessnumber {
    public static void main(String[] args) {
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100.");
        Random s = new Random();
        int computerValue = s.nextInt(100);
        boolean game=true;
        while (game)
        {

            for (int player = 1; player < 4; player++)
            {
                System.out.print("Player "+player+" Guess: ");
                guess = sc.nextInt();

                if (guess < 1 || guess > 100){
                    System.out.println("Oops!That number isn't between 1 and 100.Try again");
                }


                if (guess == computerValue) {
                    System.out.println("You got it!" + "and the number was " + computerValue + " Player " + player + " Wins the game");
                    System.out.println("Want to play again?");
                    String m = sc.next();
                    if ((m.equals("yes"))) {
                        computerValue = s.nextInt(100);
                    }
                    else
                    {
                        System.out.println("Thanks for playing");
                        game=false;
                    }


                } else if (guess < computerValue) {
                    System.out.println("Player " + player + " number is Lower!");
                } else if (guess >computerValue)
                {
                 System.out.println("Player " + player + " number is Higher!");
            }


            }}}}

