
import java.util.Random;
import java.util.Scanner;
import java.lang.String;
public class practise {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Tables.\n");
        System.out.println("How large would you like to see them?");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int i;
            System.out.print("   ");
            for ( i = 0;i <= num; i++)
                System.out.print(" "+"\t" + i);
            System.out.print('\n');
            for (int j = 0; j <= num; j++)
            {
                    System.out.print("\t" + j);

                for (  i= 0; i <= num; i++)
                {

                        int   q = i * j;


                        System.out.print("\t"+q);

                }
                System.out.print('\n');
            }
        }

    }