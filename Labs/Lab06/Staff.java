package Labs.Lab06;

public abstract class Staff {
    
    String name;
    double salary;

    Staff() {

    }

    Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double getPaid();

    public String toString() {
        return "Name: " + this.name + ", Salary: " + this.salary + ",";
    }

}
