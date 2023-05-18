package copyObj;

public class copyObj {
    public static void main(String[] args) {
        
        Car car1 = new Car("BMW", "5 Series", 2022);
        Car car2 = new Car("Toyota", "Camry", 2023);

        System.out.println(car1.getMake());
        System.out.println(car2.getMake());

        car2.copy(car1);
        System.out.println(car2.getMake());
    }
}
