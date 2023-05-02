package abstractionKeyword;

public class abs {
    public static void main(String[] args) {
        
        // abstract = abstract classes can't be instantiated, but they can have a subclass
        //            abstract methods are declared without an implementation
        
        // Vehicle v = new Vehicle(); it's like a layer of protection 
        Car car = new Car();
        car.go();
    }
}
