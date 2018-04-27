package MicroBlog2;
import java.util.ArrayList;
import java.util.Iterator;
public class Posts {
    String username;
    int ordernumber;
    String url;
    String post;


    public Posts(String username, String url, String post) {
        this.username = username;
        this.url = url;
        this.post = post;

    }


    public String getPosts() {
        return post;


    }


    public Posts(String username) {
        this.username=username;

}
    public String getUsername() {
        return username;
    }
        public int getOrdernumber()
    {
        return ordernumber;
    }}

