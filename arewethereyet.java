
import static java.lang.System.out;
import java.util.Scanner;
import java.util.*;
public class arewethereyet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "";
        boolean answer = true;
        while (answer) {
            System.out.println("are we there yet?");
            s = sc.nextLine();
            if ((s).equals("yes")) {
                System.out.println("yay");
                answer = false;
            } else if (!(s).equals("no")) {
                System.out.println(" Huh? I didn't understand ");
                answer=true;
            }
        }}}
