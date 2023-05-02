import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("To quit the game press 'q'or 'Q'.. -> ");
        String respone = scanner.next();

        if(respone.equals("q") || respone.equals("Q")) {
            System.out.println("You have quit the game..");
        }
        else {
            System.out.println("U are still playin the Game 'pewpew'");
        }
        scanner.close();
    }

    

}
