import java.util.Random;
import java.util.Scanner;
import java.lang.String;
public class guess {
    public static void main(String[] args) {


    Random s = new Random();
    Scanner sc = new Scanner(System.in);
        int computerValue = s.nextInt(100);
   int  success=0;
    int guess = 0;
    {
while( success ==0)

    {

        System.out.println("I'm thinking of a number between 1 and 100.What is it? ");
        guess = sc.nextInt();


        if (guess < 1 || guess > 100){
            System.out.println("Oops!That number isn't between 1 and 100.Try again");
        }

        else if (guess == computerValue){
            System.out.println("You got it!  "+" and the number was: " + computerValue);
            System.out.println("Want to play again?");
            String m=sc.next();
           if((m.equals("yes")))
           {
               computerValue=s.nextInt(100);
           }

        }
        else if (guess > computerValue){
            System.out.println("My number is Lower!");
        }
        else if (guess < computerValue){
            System.out.println("My number is Higher!");
        }
    }}}}




