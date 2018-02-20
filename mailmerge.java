
import java.util.Scanner;
public class mailmerge
{

    public static void main(String[] args)
    {
        boolean answer=true;
        while(answer)
        {
            System.out.println("ThankYou Letter");
            System.out.println("Enter the Name ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            if(!(name).equals("quit"))
            {
                System.out.println("Enter the donation amount");
                float amount = sc.nextFloat();
                System.out.println("Dear " + name + "," + "\n" +
                        " Thank you for your donation!  We rely on donors like you to keep our\n" +
                        " organization effective, and you came through for us. Your donation of " + "$" + amount + "\n" +
                        " will help our efforts to make a difference in the world.\n" +
                        " As you may know, we are a registered non-profit organization, so your\n" +
                        " donation is tax deductible.  You may use this letter as a receipt for tax\n" +
                        " purposes.\n" +
                        "Thank you again for your support!\n" +
                        " Sincerely,\n" +
                        " Paula Jones\n" +
                        "YourCharity.org");
            }
            else
            {
                answer=false;
            }

        }}}
