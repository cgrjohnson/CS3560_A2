
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

//User Class
class User {                                //declare variables/lists for class
    private String id;
    private List<User> followers;
    private List<User> followings;
    private List<String> comms;

    public User(String id) {                //initialize class var and lists
        this.id = id;
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.comms = new ArrayList<>();
    }
    //get id                            //getter methods for class var/lists
    public String getId(){
        return id;
    }
    //get followers
    public List<User> getFollowers(){
        return followers;
    }
    //get following
    public List<User> getFollowing(){
        return following;
    }
    //get comms
    public List<String> getComms(){
        return comms;
    }
    //add followers 
    public void addFollower(User follower) {
        followers.add(follower);
    }
    //add following
    public void addFollowing(User following) {
        followings.add(following);
    }
    //post a comm(tweet)                    //"tweet" capability, post to followers
    public void postAComm(String comm {
        comms.add(comm);
        for (User follower : followers) {
            follower.getComms().add(comm);
        }
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

    //add User, group
    //display control panel
    //user buttons: user, group
    //viewing buttons: user, group, comms, likes

    //counting: users, groups, comms, likes

    //user view

  //add in functions
  //add in UI components(buttons, text input)

public static void main(String[] args) {                              //displays control panel when you run prog
  TheVerse theVerse = new TheVerse();
  theVerse.displayControlPanel();
}
}
