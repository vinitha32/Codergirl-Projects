package MicroBlog;
import java.util.ArrayList;
import java.util.Iterator;
public class Posts {
    String username;
    int ordernumber;
    String url;
    String contents;


    public Posts(String username, int ordernumber, String contents, String url) {
        this.username = username;
        this.ordernumber = ordernumber;
        this.url = url;
        this.contents = contents;


    }}

    /*public void add(User username) {
        users.add(username);
    }

    public ArrayList getUsername() {
        return users;
    }

    public String getPosts() {
        return username + " " + ordernumber + " " + contents + " " + url;


    }

}*/