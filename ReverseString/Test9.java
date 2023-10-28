package ReverseString;
import java.util.Scanner;

public class Test9 {
    
    public static void main(String[] args) {
        
        reString();
    }

    private static void reString() {

        System.out.println("Reverse a String Game\n");

        Scanner scanner = new Scanner(System.in);
        String string;
        
        System.out.print("Enter your String: "); 
        string = scanner.nextLine();

        char[] arry = new char[string.length()];
        int x = 0;
        
        for(int i = string.length()-1; i >=0; i--) {

            // char test = string.charAt(i);
            // arry[x] = test;
            // x++;
            arry[x++] = string.charAt(i);
        }
        System.out.println("Reversed String: ");
        System.out.println(arry);
        scanner.close();
    }

}
