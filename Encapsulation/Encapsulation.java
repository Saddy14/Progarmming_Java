package Encapsulation;
public class Encapsulation {
    public static void main(String[] args) {

        Car car = new Car("BMW", "5 Series M Edition", 2023);
        
        System.out.println(car.getBrand());
        System.out.println(car.getModel());

        car.setBrand("Toyota");
        System.out.println(car.getBrand());

        car.setModel("Camry");
        System.out.println(car.getModel());
    }
}
