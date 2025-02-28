package lab2.problem4;

public record CircleRecord(double radius) {

    /**
     * Method to compute area of circle
     * Formula used is π*r2
     */
    public double computeArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
