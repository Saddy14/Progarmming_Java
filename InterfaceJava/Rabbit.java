package InterfaceJava;

public class Rabbit implements Prey {
    
    @Override
    public void flee() {
        System.out.println("Rabbit eats grass");
    }
}
