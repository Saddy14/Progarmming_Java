package InterfaceJava;

public class inter {
    public static void main(String[] args) {
        
        // Interface = a template that can be applied to a class.
        //             similar to inheritance, but specifies what a class has/must do.
        //              class can apply more than 1 interface, inheritance limited to 1 superclass

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();

    }
}
