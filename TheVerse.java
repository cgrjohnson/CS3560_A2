
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
    //validate unique idea, parse string id
    //time of creation long var
    //lastUpdated to refresh on each post of comm
    
//User Group Class
class Group {
    private String id;
    private List<User> users;

    public Group(String id) {
        this.id = id;
        this.users = new ArrayList<>();
    }

    //get id
    public String getId(){
        return id;
    }
    //add users
    public void addUser(User user){
        users.add(user);
    }
    //get users
    public List<User> getUsers(){
        return users;
    }
    //time of creation long var
    //validate group id, parse string id
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

    //public void addUser, add User
    //public void addGroup, add group
    //public void displayControlPanel, display control panel
    
    //Control Panel UI
    //Create New User, JButton
    //Create New Group, JButton
    //Create Show User Count, JButton
    //Create Show Group Count, JButton
    //Create Show Comms Count, JButton
    //Create Show Liked Comms Count, JButton

    //after creating elements, add event listeners for
    //"addActionListener" for JButtons(new user/group, show ... 
    //will need contraints for Control panel UI

    //counting number of Users
    private int countTotalUsers(Group group) {
        int count = group.getUsers().size();
        for (Group subGroup : group.getUsers()){
            count += countTotalUsers(subGroup);
        }
        return count;
    }

    //counting number of Groups
    private int countTotalGroups(Group group) {
        int count = group.getUsers().size();
        for (Group subGroup : group.getUsers()){
            count += countTotalGroups(subGroup);
        }
        return count;
    }
    
    //counting number of comms 
    private int countTotalComms(Group group) {
        int count = 0;
        for (User user : group.getUsers()){
            count += user.getComms().size();
        }
        for (Group subGroup : group.getUsers()){
            count += countTotalComms(subGroup);
        }
        return count;
    }
    
    //create int to count number of liked comms
    
    //user view UI
    //Follow JButton
    //Post Comm JButton
    //event listeners for user view UI

    //search for users and for groups by unique ID

    //ASSIGNMENT 3
    //User/Group ID verification
    //Add creation time attribute to User and Group(in User and Group class)
    //add last update time attribute to User(in User class)
    //find the last updated User(user UI should have last user to update visible, button?)

public static void main(String[] args) {                              //displays control panel when you run prog
  TheVerse theVerse = new TheVerse();
  theVerse.displayControlPanel();
}
}
