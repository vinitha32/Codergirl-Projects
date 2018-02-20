import java.util.Scanner;
public class countuserinput {
    public static void main(String[] args) {
        System.out.println("Welcome to adding machine");
        System.out.println("Total:0");
        float total = 0;
        int count=0;
        boolean answer = true;
        {
            while (answer) {

                Scanner sc = new Scanner(System.in);
                System.out.println("ADD:");
                float add = sc.nextFloat();
                count++;
                System.out.println("TOTAL:");
                total = total + add;
                System.out.println(total);

                if (add == 0) {

                    count--;
                    System.out.println("you entered " + count + " numbers" + " or a total of " + total);


                }

            }
        }
    }

}
