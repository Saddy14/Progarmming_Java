package SuperKeyword;

public class Main {
    public static void main(String[] args) {
        
        // super = keyword that refers to the superclass (parent) of an object
        //         very similar to "this" keyword

        SuperHero s1 = new SuperHero("John", 23, "Gold Nuggets");
        SuperHero s2 = new SuperHero("Jack", 43, "$$$");

        // System.out.println(s1.name);
        // System.out.println(s2.name);

        System.out.println(s1);                  //or System.out.println(s1.toString()); 
        System.out.println(s2.toString());      // or System.out.println(s2);
    }
}
