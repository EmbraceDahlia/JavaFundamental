package lab3;

public class Exponential {
    public double power(double x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x;
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Exponential exp = new Exponential();
        int x = 9;
        int n = 2;
        System.out.println(exp.power(x, n));
        System.out.println(Math.pow(x, n));
    }
}
