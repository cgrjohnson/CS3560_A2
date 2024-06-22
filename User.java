//UserID
//list<User> followers
//list<User> following 
//list<string> Comms

class User {
    private String id;                        //declare id variable
    private List <User> followers;            //declare followers list
    private List <User> following;            //declare following list
    private List <String> comms;              //declare Comms list(News Feed)

    public User(String ID) {                  //public User class
        this.id = id;                         //intialize var/lists for public User
        this.followers = new ArrayList<>();  
        this.following = new ArrayList<>();
        this.comms = new ArrayList<>();
    }
}
