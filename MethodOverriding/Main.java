package MethodOverriding;

public class Main {
    public static void main(String[] args) {

        // Method Overriding = Declaring a method in sub class, 
        //                     which is already present in parent class.
        //                    done so that a child class can give it's own implementation

        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        
        animal1.speak();
        dog1.speak();
    }
}
