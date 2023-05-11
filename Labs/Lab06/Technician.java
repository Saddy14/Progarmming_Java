package Labs.Lab06;

public class Technician extends Staff {
    
    double overTimePay;

    Technician(String name, double salary, double overTimePay) {

        super(name, salary);

        this.overTimePay = overTimePay;
    }

    @Override
    public double getPaid() {
        return salary + overTimePay;
    }

    public String toString() {
        return "Technician: " + super.toString() + " OverTimePay = " + overTimePay + ", Paid: " + getPaid();
    }
}
