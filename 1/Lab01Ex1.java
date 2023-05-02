import java.util.Scanner;

public class Lab01Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String phoneNum;
        System.out.print("Enter The Phone Number As a String: ");
        phoneNum = scanner.nextLine();
    

        System.out.println("Phone Number: ");

        for(int i = 0; i < phoneNum.length(); i++) {

            if((getNumber(phoneNum.charAt(i))) == -1) {
                System.out.println("Char Not Found");
                
            }
            
            System.out.print(getNumber(phoneNum.charAt(i)));

        }

        scanner.close();
    }
     
    public static int getNumber (char letter) {
        
        letter = Character.toLowerCase(letter); 

        if(letter == 'a' || letter == 'b' || letter == 'c' ) {
            return 2;
        }
        else if(letter == 'd' || letter == 'e' || letter == 'f') {
            return 3;
        }
        else if(letter == 'g' || letter == 'h' || letter == 'i') {
            return 4;
        }
        else if(letter == 'j' || letter == 'k' || letter == 'l') {
            return 5;
        }
        else if(letter == 'm' || letter == 'n' || letter == 'o') {
            return 6;
        }
        else if(letter == 'p' || letter == 'q' || letter == 'r' || letter == 's' ) {
            return 7;
        }
        else if(letter == 't' || letter == 'u' || letter == 'v') {
            return 8;
        }
        else if(letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
            return 9;
        }
        else {
            return -1;
        }
    }

}
