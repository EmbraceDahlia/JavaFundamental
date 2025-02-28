package lab2.problem4;

public record TriangleRecord(double height, double base) {
    public TriangleRecord {
        if (height <= 0 || base <= 0) {
            throw new IllegalArgumentException("Invalid Input: height and base must be greater than zero");
        }
    }

    /**
     * Method to compute area of the triangle
     * Formula used is 1/2 * height * base
     */
    public double computeArea() {
        double area = (0.5 * (height * base));
        return area;
    }
}
