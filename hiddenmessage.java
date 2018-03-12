import java.util.Scanner;


public class hiddenmessage
{
    public static void main(String args[])
    {

        for(int i=0;i<30;i++) {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter a binary number:");

            String n = s.nextLine();
          int m=Integer.parseInt(n,2);

        System.out.println("After Conversion: "+m);


    int a[]={100,101,102,103,104,105,106,107,110,111,112,113,114,115,116,117,120,121,122,123,124,125,126,127,130,131,132,133,134};
char a1[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' ','.','?'};
for(int j=0;j<29;j++)
{
if(m==a[j]) {
    System.out.println((char)a1[j]);

}}    }}}