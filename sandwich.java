package com.company;
import java.util.Scanner;

public class sandwich
{
    public static void main(String[] args)
    {
        System.out.println("Checking sales goals.");
        System.out.println("The sales goal for veggie sandwiches is 50");
        System.out.println("How many veggie sandwiches were sold today?");
        Scanner scan = new Scanner(System.in);
        int sandwich = scan.nextInt();
            if(sandwich>=50)
              {
               System.out.println("Made goal for veggies.");
               }
            else {
            System.out.println("Fell short for veggies.");
                 }
        System.out.println("The sales goal for burger is 250");
        System.out.println("How many burgers were sold today?");
        int burger=scan.nextInt();
             if(burger>= 250)
               {
                System.out.println("Made goal for burgers.");
                }
              else{
                 System.out.println("Fell short for Burgers.");
                  }
        System.out.println("The sales goal for subs is 180");
        System.out.println("How many subs were sold today?");
        int subs=scan.nextInt();
              if(subs>=180)
              {
                  System.out.println("Made goal for subs.");
              }
              else{
                  System.out.println("Fell short for subs.");
              }
        System.out.println("The sales goal for soup is 70");
        System.out.println("How many soups were sold today?");
        int soup=scan.nextInt();
               if(soup>=70)
               {
                   System.out.println("Made goal for soup.");
               }
               else
               {
                   System.out.println("Fell short for soup.");
               }
        if (sandwich>=50 && burger>=250 && subs>=180 && soup>=70)
        {
            System.out.println("Made goal for everything!");
        }

    }}
