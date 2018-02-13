import java.lang.String;
public class prettydates
{
    public static String formatNumberAsTwoDigits(int day) {
        if (day < 10) {
            return "0" + day;
        } else {
            return "" + day;
        }
    }

    public static String nameFormat(int year, int month, int day) {

        if (month == 1) {
            return "January" + " " + day + "," + " " + year;

        } else if (month == 10) {
            return "october" + " " + day + "," + " " + year;
        } else if (month == 12) {
            return "December" + " " + day + "," + " " + year;
        }
        return "";
    }

    public static String slashFormat(int year, int month, int day) {
        if (day < 10 && month < 9)
        {
            return  "0"+month + "/" + "0"+day + "/"  + year;
        }
        else if (day > 10 && month > 9)
        {
            return month + "/" + day + "/" +year;
        }
        return month + "/" +"0"+ day +"/"+year;

    }
    public static String dashFormat ( int year, int month, int day) {
        if (day < 10 && month < 9) {
            return year + "-" + "0" + month + "-" + "0" + day;
        } else if (day > 10 && month > 9) {
            return year + "-" + month + "-" + day;


        } else {return year + "-" + month + "-" +"0" +day;
        }
    }
    public static void printDate ( int year, int month, int day)
    {
        System.out.println(nameFormat(year, month, day));
        System.out.println(slashFormat(year, month, day));
        System.out.println(dashFormat(year, month, day));
        System.out.println();
    }
    // don't change this code.
    public static void main (String[]args)
    {
        System.out.println(formatNumberAsTwoDigits(3));
        System.out.println(formatNumberAsTwoDigits(9));
        System.out.println(formatNumberAsTwoDigits(10));
        System.out.println(formatNumberAsTwoDigits(12));
        printDate(2014, 10, 4);
        printDate(2015, 1, 1);
        printDate(2013, 12, 31);
    }
}
