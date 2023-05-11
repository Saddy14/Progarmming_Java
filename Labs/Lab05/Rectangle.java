package Labs.Lab05;

class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public String toString() {
        return "width = " + width + ", height = " + height + ", area = " +
                getArea();
    }
}