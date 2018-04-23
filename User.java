package MicroBlog;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    String firstname;
    String lastname;
    String webaddress;
    String email ;
   String username;
//ArrayList users;


  public  User (String username,String firstname, String lastname, String webaddress, String email) {
    this.username=username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.webaddress = webaddress;
        this.email = email;

  }

    public String getUser() {
        return username+firstname + " " + lastname + " " + webaddress + " " + email;
    }
public String getUsername()
{
    return username;
}

}




