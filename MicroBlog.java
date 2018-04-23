package MicroBlog;


import java.util.Scanner;
import java.util.ArrayList;


public class MicroBlog {


        public void display_menu () {

                System.out.println("Main Menu");
                System.out.println("1) Create a new user");
                System.out.println("2) Become an existing user");
                System.out.println("3) Create a post as the current user");
                System.out.println("4) Print all posts");
                System.out.println("5) Print all users");
                System.out.println("You are currently user" + "pug." + "What would you like to do?");
            }

       public  MicroBlog() {
           ArrayList<String> username = new ArrayList<String>();
           ArrayList<String> users = new ArrayList<String>();
           ArrayList<String> contents = new ArrayList<String>();
           ArrayList<Integer> inputs = new ArrayList<Integer>();

           while (true) {

               display_menu();
               Scanner in = new Scanner(System.in);
               switch (in.nextInt()) {
                   case 1:

                       System.out.println("#####Create a new user#######");
                       // username.add(in.nextLine());
                       System.out.println("What is your username?");
                       in.nextLine();
                       String m = in.next();
                       username.add(m);
                       System.out.println("What is your Firstname?,Lastname?,Webaddress,Email?");
                       in.nextLine();
                       String n = in.next();
                       users.add(n);
                       System.out.println("What you want to post");
                       in.nextLine();
                       String o = in.next();
                       contents.add(o);
                       break;

                   case 2:
                       System.out.println("#####Become an existing user######");
                       System.out.println("The existing users are shown below.Which user name you want to pick?use number");

                       for (int j = 0; j < username.size(); j++) {
                           System.out.print((j + ")" + username.get(j) + " "));
                       }
                       int p=in.nextInt();
                       inputs.add(p);
                       System.out.println("The last Post of the current user is");
                       for (int j = 0; j < inputs.size(); j++) {
                           System.out.println(" " + contents.get(p));
                       }
                       ;
                       break;

                   case 3:
                       System.out.println("#####Creating post as existing user######");

                          System.out.println("New Post by existing user");
                       in.nextLine();
                       String w=in.nextLine();
                       contents.add(w);
                       break;

                   case 4:
                       System.out.println("######Print all posts######");
                       for (int j = 0; j < contents.size(); j++) {
                           System.out.println(" " + contents.get(j));
                       }
                       System.out.println(" ");
                       break;

                   case 5:

                       System.out.println("#####Print all users#####");
                       for (int i = 0; i < username.size(); i++) {
                           System.out.print(" " + username.get(i) + "\n");

                       }

                       System.out.println(" ");
                       break;
                   default:
                       System.err.println("Unrecognized option");
                       break;
               }
           }
       }

        public static void main(String args[]) {

            while (true)
            {
            new MicroBlog();


    }

        }
}
