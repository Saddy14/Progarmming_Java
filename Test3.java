import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double r;
        int userIn;

        System.out.println("Enter 1 to Calulate Area of Square");
        System.out.println("Enter 2 to Calulate Area of Circle");
        System.out.print("Enter a Number -> "); userIn = scanner.nextInt();

        if(userIn ==1) {
            System.out.println("\nPlz Enter the Lenght & Height.");
            System.out.print("Length -> "); x = scanner.nextDouble();
            System.out.print("Height -> "); y = scanner.nextDouble();

            System.out.println("\nThe Area of Sq. = "+getAreaSq(x, y));
        }
        else if (userIn ==2) {
            System.out.println("\nPlz Enter the Radius.");
            System.out.print("Radius -> "); r = scanner.nextDouble();

            System.out.println("\nThe Area of Circle = "+getAreaCir(r));
        }
        else {
            System.out.print("Plz Enter 1 or 2 Only -> ");
            // userIn = scanner.nextInt();
        }

        scanner.close();

    }
    
    
    
    private static double getAreaSq(double x, double y) {
        return x*y ;
    }

    private static double getAreaCir(double r) {
        return 3.141592653589793238462643*r*r ;
    }

}