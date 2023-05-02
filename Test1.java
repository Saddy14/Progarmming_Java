import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.print("Enter the value for X: ");
        x = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the value for Y: ");
        y = scanner.nextDouble();
        scanner.nextLine();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The Hypotenese of the Triangle "+z);

        scanner.close();





    }
}
