
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
}
    
//get id, followers, following. comms
//add followers and following
//post a comm(tweet)
//end user class


//User Group Class
//class Group {}
//above is a placeholder for once I'm done working on the class


//Main Class for application
/**/class TheVerse {
    /*private Groop rootGroup;                                        //for the Root Group containing everything
    private DefaultMutableTreeNode rootNode;                        //Node for Root Group
    private DefaultTreeModel treeModel                              //Tree model for The Verse
*/
    public TheVerse() {                                             //public class TheVerse
          //this.rootGroup = new Group("Root");                      
          //this.rootNode = new DefaultMutableTreeNode(rootGroup);   
          //      this.treeModel = new DefaultTreeModel(rootNode);
        JFrame frame = new JFrame();
      
        JPanel panel = new JPanel();
        panel.setborder(BorderFactory.creatEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,  1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Welcome to The Verse");
        frame.pack();
        frame.setVisible(true);
    }

  //add in functions
  //add in UI components(buttons, text input)


/*public static void main(String[] args) {                              //displays control panel when you run prog
  TheVerse theVerse = new TheVerse();
  theVerse.displayControlPanel();
*/
//}
//}

  
