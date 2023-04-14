package java_package;

public class Hyperbola extends Curve {
    private double a; // hyperbola's a coefficient
    private double b; // hyperbola's b coefficient

    public Hyperbola(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateY(double x) {
        return Math.sqrt((Math.pow(x, 2) / Math.pow(a, 2)) - 1) * b;
    }
}