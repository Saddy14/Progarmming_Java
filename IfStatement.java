import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        if(age >= 75 || age >= 50) {
            System.out.println("You are old");
        }
        else if(age >= 18) {
            System.out.println("Ok you are an Adult");
        }
        else if(age >=12) {
            System.out.println("U an Teenager");
        }
        else {
            System.out.println("Bruh!!, U a Kiddo");
        }

        scanner.close();

    }
}
