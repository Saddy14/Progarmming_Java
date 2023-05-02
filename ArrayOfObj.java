public class ArrayOfObj {
    public static void main(String[] args) {
        
        // food[] fridge = new food[3];
        
        food food1 = new food("Burger");
        food food2 = new food("Chicken");
        food food3 = new food("Biryani");

        food[] food = {food1, food2, food3};

        // fridge[0] = food1;
        // fridge[1] = food2;
        // fridge[2] = food3; 

        for (int i = 0; i < food.length; i++) {

            System.out.println(food[i].name);

        }   
    }
}

class food {
    String name;

    food(String name) {
        this.name = name;
    }
}