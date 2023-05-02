package Test6;

public class Human {
    
    String name;
    String job;
    int age;

    Human(String name, String job, int age) {

        this.name = name;
        this.job = job;
        this.age = age;
    }
    void drink() { 
        System.out.println(this.name + " Is drinking Coke");
    }
    void happy() {
        System.out.println(this.name+ " is Happy");
    }
}
