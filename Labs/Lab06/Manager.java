package Labs.Lab06;

public class Manager extends Staff {

    double allowance;

    Manager() {

    }

    Manager(String name, double salary, double allowance) {

        super(name, salary);
        this.allowance = allowance;
    }

    @Override
    public double getPaid() {
        return salary+allowance;
    }

    public String toString() {
        return "Manager: " + super.toString() + " Allowance: " + allowance + ", Paid: " + getPaid();
    }
    
}
