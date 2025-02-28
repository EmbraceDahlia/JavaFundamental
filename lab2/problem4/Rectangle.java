package lab2.problem4;

public final class Rectangle {

    // Instance variables declared as final, can not be changed
    private final double width;
    private final double height;

    // Parameter constructor to initialize the instance fields
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Method to compute area of the rectangle
     * Formula used is length * width
     */
    public double computeArea() {
        double area = height * width;
        return area;
    }
}
