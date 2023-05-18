package copyObj;

public class Car {
    
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters
    public String getMake() {
        return make;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car x) {
        this.make = x.getMake();
        this.model = x.getModel();
        this.year = x.getYear();
    }
}
