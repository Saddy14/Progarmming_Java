// package StaticKeyword;

public class Friend {
    
    String name;
    static int noOfFriend;

    Friend (String name) {
        this.name = name;
        noOfFriend++;
    }

    static void displayFriends () {
        System.out.println(noOfFriend);
    }
}
