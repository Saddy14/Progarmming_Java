package Test6;
public class Test6 {
    public static void main(String[] args) {
       
        Human human1 = new Human("Rick", "Office Job", 45);
        Human human2 = new Human("John", "Chicken Nugget", 25);

        human1.drink();
        human2.happy();
        System.out.println(human1.age); 
        
        
    }

}
