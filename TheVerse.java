
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

//User Class
class User {
    private String id;
    private List<User> followers;
    private List<User> following;
    private List<String> comms;

    public User(String id) {
        this.id = id;
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.comms = new ArrayList<>();
    }
    //get id, followers, following. comms
    //add followers and following
    //post a comm(tweet)
    //end user class
}
    
//User Group Class
class Group {
    private String id;
    private List<User> users;

    public Group(String id) {
        this.id = id;
        this.users = new ArrayList<>();
    }
    //get id, users
    //add users
}

//Main Class for application
class TheVerse {
    private Groop rootGroup;                                        //for the Root Group containing everything
    private DefaultMutableTreeNode rootNode;                        //Node for Root Group
    private DefaultTreeModel treeModel                              //Tree model for The Verse

    public TheVerse() {                                             //public class TheVerse
          this.rootGroup = new Group("Root");                      
          this.rootNode = new DefaultMutableTreeNode(rootGroup);   
          this.treeModel = new DefaultTreeModel(rootNode);
    }

  //add in functions
  //add in UI components(buttons, text input)

public static void main(String[] args) {                              //displays control panel when you run prog
  TheVerse theVerse = new TheVerse();
  theVerse.displayControlPanel();
}
}

  
