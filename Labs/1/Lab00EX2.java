import java.util.ArrayList;
import java.util.Scanner;

public class Lab00EX2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String word;
        boolean zero_entered = false;

        do {
            String zero = "0";
            System.out.println("Enter a word (0 to end): ");
            word = scanner.nextLine();
            if (zero.equals(word))
            {
                zero_entered = true;
            }
            else
            {
                words.add(word);
            }

        } while(!zero_entered);

        System.out.println("You entered: ");
        for(int x = 0; x < words.size(); ++x)
        {
            System.out.print(words.get(x)+" ");
        }
        System.out.println();

        // boolean ascending = true;
        // boolean duplicate = false;

        for(int x = 0; x < words.size()-1; ++x)
        {
            if(words.get(x).compareTo(words.get(x+1)) > 0)
            {
                // ascending = false;
            }
        }

        scanner.close();



    }
}
