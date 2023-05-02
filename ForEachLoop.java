import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        
        ArrayList<String> array = new ArrayList<>();

        array.add("John");
        array.add("Nuggets");
        array.add("Max");
        for (String i : array) {
            System.out.println(i);
        }

        System.out.println();

        String[] arrayStrings = {"John", "Chicken", "Burger"};

        for (String string : arrayStrings) {
            System.out.println(string);
        }
    }
}
