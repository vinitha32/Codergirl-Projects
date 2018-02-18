
import static java.lang.System.out;
import static java.lang.System.setOut;

import java.util.Scanner;
public class Leapyear
{
    public static boolean leapyears(int a)
    {


        if ((a % 4 == 0) && (a % 100 != 0)) {

            return true;
        } else if ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0))

        {
            return true;
        } else {

            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println("Testing functions");
        int testFailures = 0;

        if (!(leapyears(1600)))

        {
            System.out.println("Error 1: leap year test failed.  Expected true, got "  + leapyears(1600));

            testFailures++;
        }
        if ((leapyears(1800))) {
            System.out.println("Not Leap year" + leapyears(1800));

            testFailures++;
        }


        if (!(leapyears(2000))) {
            System.out.println("leap year" + leapyears(2000));


            testFailures++;
        }
        if((leapyears(1900)))
        {
            System.out.println("Not leap year" + leapyears(1900));
            testFailures++;
        }
        if(!(leapyears(2400)))
        {
            System.out.println("leap year" + leapyears(2400));
            testFailures++;
        }
        if((leapyears(2200)))
        {
            System.out.println("not leap year" + leapyears(2200));
            testFailures++;
        }
        if(!(leapyears(1988)))
        {
            System.out.println("leap year" + leapyears(1988));
            testFailures++;
        }
        if((leapyears(1987)))
        {
            System.out.println("not leap year" + leapyears(1987));
            testFailures++;
        }
        if(!(leapyears(1996)))
        {
            System.out.println("leap year" + leapyears(1996));
            testFailures++;
        }
        if((leapyears(1999)))
        {
            System.out.println("not leap year" + leapyears(1999));
            testFailures++;
        }
        if(!(leapyears(2004)))
        {
            System.out.println("leap year" + leapyears(2004));
            testFailures++;
        }
        if((leapyears(2006)))
        {
            System.out.println("not leap year" + leapyears(2006));
            testFailures++;
        }
        if(!(leapyears(4000)))
        {
            System.out.println("leap year" + leapyears(4000));
            testFailures++;
        }

        if (testFailures == 0) {
            out.println("Success!  All test cases passed.");
        } else {
            out.println(testFailures + " tests failed.  Keep trying!");
        }

    }}

