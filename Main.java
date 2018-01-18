package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please list three items on your grocery shopping list.");
        System.out.println("Item 1 ?"  );
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine() ;
        System.out.println("Item 2 ?");
        String g= scan.nextLine() ;
        System.out.println("Item 3 ?");
        String h = scan.nextLine();
        System.out.println("Now, please enter the quantity of each item.");
        System.out.println("How many " + s + " ? ");
        int i = scan.nextInt();
        System.out.println("How many " + g + " ? ");
        int j = scan.nextInt();
        System.out.println("How many " + h + " ? ");
        int k =scan.nextInt();
        System.out.println("Now, please enter the price of each item.");
        System.out.println("How much does one " + s + " cost ?" );
        Double p = scan.nextDouble();
        System.out.println("How much does one " + g + " cost ?" );
        Double q = scan.nextDouble();
        System.out.println("How much does one " + h + " cost ?" );
        Double r = scan.nextDouble();
        System.out.println("Calculating your grocery bill.");
        double z;
        z = i*p + j*q + k*r;
        System.out.println("Your total cost is " + z);

    }

}
