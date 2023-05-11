package ObjectPassing;

public class ObjectPassing {
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car car1 = new Car("BMW 5 Series");
        Car car2 = new Car("Toyota Camry");
        

        garage.park(car1);
        garage.park(car2);


    }
}
