package SuperKeyword;

public class SuperHero extends Person {
    
    String power;

    SuperHero(String name, int age, String power) {

        super(name, age);
        this.power = power;
    }
    public String toString() {

        return super.toString() + power;
    }
}
