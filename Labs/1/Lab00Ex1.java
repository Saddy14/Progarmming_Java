import java.util.Scanner;

public class Lab00Ex1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Asking user for the total number of items
        System.out.print("Enter the total number of items: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        // Declaring the the array with no. items as it's size
        double[] prices = new double[size];

        // for loop to enter prices for all the prices
        System.out.println("Enter the prices for "+size+" items: ");
        for(int x = 0; x < size; ++x)
        {
            prices[x] = scanner.nextDouble();
            scanner.nextLine();
        }
        // for loop that shows all the prices
        System.out.println("\nThe prices: ");
        for(int x = 0; x < size; ++x)
        {
            System.out.println(prices[x]);
        }
        // sum of all the items
        double sum = 0;
        for(int x = 0; x < size; ++x)
        {
            sum = sum + prices[x];
        }

        System.out.println("\nSum of all the Items: "+sum);

        scanner.close();
    }
}
