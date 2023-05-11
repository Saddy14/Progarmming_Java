import java.util.ArrayList;
import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        
        ArrayList<String> player1 = new ArrayList<>(Arrays.asList("c4", "d9", "h5", "s9"));
        ArrayList<String> player2 = new ArrayList<>(Arrays.asList("c1", "d6", "hx", "sQ"));
        ArrayList<String> center = new ArrayList<>();
               
        // center.add("s9");
        // center.add("hx");

        center.add("s5");
        System.out.println("player1: "+ player1);
        System.out.println("player2: "+ player2);
        System.out.println("center: "+ center);

        System.out.println(startingPlayer(center));    
    }

    static int startingPlayer(ArrayList<String> center) {

        ArrayList<String> player1 = new ArrayList<>(Arrays.asList("c4", "d9", "h5", "s9"));
        ArrayList<String> player2 = new ArrayList<>(Arrays.asList("c1", "d6", "hx", "sQ"));
        int temp = 0;

        for (int i = 0; i < 4; i++) {

            if (center.contains(player1.get(i))) {
                System.out.println("p1");
                temp = 1;
                break;
            }
            if (center.contains(player2.get(i))) {
                System.out.println("p2");
                temp = 2;
                break;
            }
            else {
                temp = -1;
            }
            
        }

        return temp;
    }
}




