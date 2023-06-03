import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        ArrayList<String> carName = new ArrayList<>();

        carName.add("Volvo");
        carName.add("BMW");
        carName.add("Ford");
        carName.add("Audi");

        for (int i = 0; i < carName.size(); i++) {
            cars.add(carName.get(i));
        }

        cars.addLast("Chicken Nuggets");

        System.out.println("LinkedList Cars    : "+ cars);
        System.out.println("Arraylist  Car Name: " + carName);
        
    }
}
