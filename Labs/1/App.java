import java.util.Scanner;

public class App {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("What is ur Name?");
       String name = scanner.nextLine();

       System.out.println("How old are u?");
       int age = scanner.nextInt();
       scanner.nextLine();

       System.out.println("What is ur Fav Food?");
       String food = scanner.nextLine();

       System.out.println("\nHello "+name);
       System.out.println("Ur age is "+age);
       System.out.println("Ur Fav Food is "+food);

       scanner.close();
        
    }
}
