package com.company;
import java.util.Scanner;

public class Entertainment
{
public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("What is the weather like today?");
    System.out.println("Answer: sunny cloudy or rainy.");
    String answer1 = scan.nextLine();
    if(!answer1.equals("sunny") && !answer1.equals("cloudy") && !answer1.equals("rainy"))
    {
        System.out.println("Error: Your Weather answer wasn't one of the valid options.");
    }
else {
        System.out.println("What kind of mood are you in for activities?");
        System.out.println("Answer: exercise party or quiet.");
        String answer2 = scan.nextLine();
        if (!answer2.equals("exercise") && !answer2.equals("party") && !answer2.equals("quiet")) {
            System.out.println("Error: Your mood answer wasn't one of the valid options.");
        }


        if (answer1.equals("sunny") && answer2.equals("exercise"))

        {
            System.out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
        } else if (answer1.equals("sunny") && answer2.equals("party")) {
            System.out.println("For a fun party on a sunny day, look for a street festival.");
        } else if (answer1.equals("sunny") && answer2.equals("quiet")) {
            System.out.println("A sunny day is a beautiful time to sit under a tree and read a book.");
        }


        if (answer1.equals("cloudy") && answer2.equals("exercise")) {
            System.out.println("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
        } else if (answer1.equals("cloudy") && answer2.equals("party")) {
            System.out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
        } else if (answer1.equals("cloudy") && answer2.equals("quiet")) {
            System.out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
        }
        if (answer1.equals("rainy") && answer2.equals("exercise")) {
            System.out.println("Giant indoor trampolines are a fun place to exercise on a rainy day.");
        } else if (answer1.equals("rainy") && answer2.equals("party")) {
            System.out.println("See if your friends are playing board games to pass a rainy day.");
        } else if (answer1.equals("rainy") && answer2.equals("quiet")) {
            System.out.println("A rainy day is a peaceful time to journal and daydream.");

        }
    }
}}

