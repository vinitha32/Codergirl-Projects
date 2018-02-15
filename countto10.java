
import static java.lang.System.out;
import java.util.Scanner;
public class countto10
{
    public static String getEnglishWord(int number)
    {
        // zero one two three four five six seven eight nine ten
        if(number==0)

        {
            return "zero";
        }

        else if(number==1)
        {
            return "one";
        }
        else if (number==2)
        {
            return "two";

        }else if(number==3)
        {
            return "three";
        }
        else if(number==4) {
            return "Four";
        }
        else if(number==5) {
            return "Five";
        }
        else if(number==6) {
            return "Six";
        }
        else if(number==7) {
            return "Seven";
        }
        else if(number==8) {
            return "Eight";
        }
        else if(number==9) {
            return "Nine";
        }
        else if(number==10) {
            return "Ten";
        }
        {
            return "";
        }

    }
    public static String getSpanishWord(int number)
    {
        // cero uno dos tres cuatro cinco seis siete ocho nueve diez
        if (number == 0) {
            return "cero";
        } else if (number == 1) {
            return "uno";
        } else if (number == 2) {
            return "dos";
        }
        else if(number==5) {
            return "tres";
        }
        else if(number==6) {
            return "cuatro";
        }
        else if(number==7) {
            return "cinco";
        }
        else if(number==8) {
            return "seis";
        }
        else if(number==9) {
            return "nueve";
        }
        else if(number==10) {
            return "deiz";
        }
        {
            return "";
        }}
    public static String getWord(String language, int number)
    {
        if (number < 0) {
            return "Number too small.";
        }
        if (number > 10) {
            return "Number too large.";
        }
        if ("e".equals(language)) {




            return getEnglishWord(number);
        }
        if ("s".equals(language)) {
            return getSpanishWord(number);
        }
        return "Unrecognized language choice.";
    }
    public static void main(String[] args)
    {
        System.out.println("Would you like English or Spanish?");
        System.out.println("Press e or s");
        Scanner keyboard = new Scanner(System.in);
        String language = keyboard.nextLine();
        System.out.println("What number do you want the name of? 0-10");
        int number = keyboard.nextInt();
        keyboard.skip("\n");
        String spelled_out = getWord(language, number);
        System.out.println("The word for " + number + " is " + spelled_out);
    }
}