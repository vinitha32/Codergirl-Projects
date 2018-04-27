package MicroBlog2;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    String firstname;
    String lastname;
    String webaddress;
    String email ;
   String username;


public User(String username,String firstname,String lastname,String webaddress,String email )
{
    this.firstname=firstname;
    this.lastname=lastname;
    this.webaddress=webaddress;
    this.email=email;
    this.username=username;


}

public String getUser()
{
        return username+firstname + lastname +  webaddress + email;
    }

    public String getUsername()
  {
    return username;
   }



  }




