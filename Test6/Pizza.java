package Test6;

public class Pizza {
    
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce) {

        this.bread = bread;
        this.sauce = sauce;

    }

    Pizza(String bread, String sauce, String cheese, String topping) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }
    public String toString() {
        return bread + "\n" + sauce + "\n";
    }
}
