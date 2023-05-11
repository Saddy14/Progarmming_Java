// package Labs.Lab05;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab05_Q1 {
    public static void main(String[] args) {
        ArrayList<Rectangle> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double width, height;
        int count = 0;
        while (true) {
            try {
                System.out.print("Enter width & height (0 to finish): ");
                width = input.nextDouble();
                if (width == 0)
                    break;
                height = input.nextDouble();
                if (height == 0)
                    break;

                list.add(new Rectangle(width, height));
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine(); // clear the input buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("No\tRectangles");
        for (int i = 0; i < count; i++) {
            System.out.println(i + "\t" + list.get(i));
        }
        input.close();

    }
}
