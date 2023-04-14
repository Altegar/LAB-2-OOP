package java_package;

public class Line extends Curve {
    private double a; // line's a coefficient
    private double b; // line's b coefficient

    public Line(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateY(double x) {
        return a * x + b;
    }
}