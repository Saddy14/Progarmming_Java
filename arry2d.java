import java.util.ArrayList;

// import java.util.*;

public class arry2d {
    public static void main(String[] args) {
        //2D Arraylist = a dynamic list of lists
        // U can change the size of these lists during runtime

        ArrayList< ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("Bread");
        bakeryList.add("Tortilla");
        bakeryList.add("Pizza");

        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("Tomatos");
        produceList.add("Salad");
        produceList.add("Meat");

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("Coke");
        drinksList.add("Red Bull");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        // System.out.println(groceryList);
        System.out.println(groceryList.get(2).get(0));
        
    }
}
