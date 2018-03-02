import java.util.Random;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication Tables.\n");
        System.out.println("How large would you like to see them?");
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        int i,n,k;
       for(i=0;i<=j;i++)
       {
         for(k=0;k<=j;k++)
         {
         n=k*i;
         System.out.println(i + "*" + k + "=" + n);

       }}}}


