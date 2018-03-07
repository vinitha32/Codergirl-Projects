import java.util.Random;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Tables.\n");
        System.out.println("How large would you like to see them?");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 20) {
            int size1, size2, result;

            for (size1 = 0; size1 <= size; size1++) {
                for (size2 = 0; size2 <= size; size2++) {
                    result = size1 * size2;
                    System.out.println(size1 + "*" + size2 + "=" + result);

                }
            }
        } else {
            System.out.println("Choose size not more than 20");
        }
    }}
