//user group has unique ID
//can contain any number of Users
//users can only subscribe to one group
//"root" group contains everything

class Group {
    private String id;                    //declare Group id var
    private List<User> users;             //declare users list

    public Group(String id) {             //public Group class
        this.id = id;                     //initialize var and list for public Group
        this.users = new ArrayList<>();
    }

    //getId
    //getUsers
    //add to user list
}
