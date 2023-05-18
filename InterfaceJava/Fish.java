package InterfaceJava;

public class Fish implements Prey,Predator {

    @Override
    public void hunt() {
        System.out.println("Fish is hunting small fish");
    }

    @Override
    public void flee() {
        System.out.println("Fish is fleeing");
    }
    
}
