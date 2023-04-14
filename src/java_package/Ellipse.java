package java_package;

public class Ellipse extends Curve {
    private double a; // ellipse's a coefficient
    private double b; // ellipse's b coefficient

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateY(double x) {
        return Math.sqrt(1 - (Math.pow(x, 2) / Math.pow(a, 2))) * b;
    }
}