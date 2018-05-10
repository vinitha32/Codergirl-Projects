package MicroBlog2;


import java.util.Scanner;
import java.util.ArrayList;


public class MicroBlog2 {


    public void display_menu () {

        System.out.println("Main Menu");
        System.out.println("1) Create a new user");
        System.out.println("2) Become an existing user");
        System.out.println("3) Create a post as the current user");
        System.out.println("4) Print all posts");
        System.out.println("5) Print all users");

    }

    public  MicroBlog2() {
        ArrayList<User> users = new ArrayList<User>();
        ArrayList<Posts> contents = new ArrayList<Posts>();
        ArrayList<Posts> inputs = new ArrayList<Posts>();
        String user = "pug";


        while (true) {

            display_menu();
            Scanner in = new Scanner(System.in);
            System.out.println("You are currently user "+ user +" .What would you like to do?");
            switch (in.nextInt()) {

                case 1:

                    System.out.println("#####Create a new user#######");
                    System.out.println("What is your username?");
                    in.nextLine();
                    String userName = in.next();
                    System.out.println("What is your Firstname?");
                    in.nextLine();
                    String firstName = in.next();
                    System.out.println("What is your Latname?");
                    in.nextLine();
                    String lastName = in.next();
                    System.out.println("What is your Webaddress");
                    in.nextLine();
                    String webAddress = in.next();
                    System.out.println("What is your url");
                    in.nextLine();
                    String url = in.next();
                    System.out.println("What is your email?");
                    in.nextLine();
                    String email = in.next();
                    users.add(new User(userName, firstName, lastName, webAddress, email));
                    System.out.println("What you want to post");
                    in.nextLine();
                    String post = in.next();
                    contents.add(new Posts(userName, url, post));

                    break;

                case 2:
                    System.out.println("#####Become an existing user######");
                    System.out.println("The existing users are shown below.Which user name you want to pick?");

                    for (int j = 0; j < users.size(); j++) {
                        System.out.println((users.get(j).getUsername() + " "));
                    }
                     if(in.nextLine().equals(user))
                    {
                    user = in.next();}
                    else
                    {
                        System.out.println("user not exists");
                    }



                    break;

                case 3:
                    System.out.println("#####Creating post as existing user######");
                    System.out.println("Last post by "+user);
                    String userPost = "Post not found";
                    for (int i = 0; i < contents.size(); i++) {
                      if(contents.get(i).getUsername().equals(user))
                        userPost=contents.get(i).getPosts();
                    }
                    System.out.println(userPost);

                    System.out.println("Type the new post "+user);
                    in.nextLine();
                    String post1 = in.next();
                    contents.add(new Posts(user,"", post1));

                    break;

                case 4:
                  System.out.println("######Print all posts######");
                    for (int j = 0; j < contents.size(); j++) {
                        System.out.println(" " + contents.get(j).getPosts()+"\n");
                    }
                    break;

                case 5:

                   System.out.println("#####Print all users#####");
                    for (int i = 0; i < users.size(); i++) {
                        System.out.println(" " + users.get(i).getUsername());

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

            new MicroBlog2();


        }

    }
}
