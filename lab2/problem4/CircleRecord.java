package lab2.problem4;

public record CircleRecord(double radius) {
    public CircleRecord {
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid Input, Circle radius must be greater than zero");

        }
    }

    /**
     * Method to compute area of circle
     * Formula used is π*r2
     */
    public double computeArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
