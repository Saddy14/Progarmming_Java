package MethodOverriding;

public class Dog extends Animal {
    
    @Override               // <--- overide convention 
    void speak() {
        System.out.println("This Dog goes Bark!!!!");
    }
}
