public class Static {
    public static void main(String[] args) {
        
        Friend f1 = new Friend("John");
        Friend f2 = new Friend("Peter");
        Friend f3 = new Friend("Chicken");

        // System.out.println(Friend.noOfFriend);
        Friend.displayFriends();
    }
}
