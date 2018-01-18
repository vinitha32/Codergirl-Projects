package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("What is today's price for boards, in silver pieces? ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
     int j =9 * i;
        System.out.println("The cost per chest is " + j +" silver pieces for boards");
        System.out.println("What is today's price for locks, in silver pieces?");
        int k = sc.nextInt();
        System.out.println("How many silver pieces does Lady Ching wish to invest in building chests?");
        int w =sc.nextInt();
        int z =j+k;
        int y= w/z;
        System.out.println("That will pay for the creation of " + y +"chests.");
        int r = w - z * y ;
        System.out.println("Left over silver pieces: " + r);
    }
}
