package java_package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(2, 3);
        Ellipse ellipse = new Ellipse(4, 5);
        Hyperbola hyperbola = new Hyperbola(3, 2);

        // Calculating y values for different x values using different classes
        Scanner read = new Scanner(System.in);
        double x = read.nextDouble(); // For Europe, use a comma separator (,) instead of a period (.)
        double yLine = line.calculateY(x);
        double yEllipse = ellipse.calculateY(x);
        double yHyperbola = hyperbola.calculateY(x);

        // Output results
        System.out.println("For x = " + x + ':');
        System.out.println("Line: y = " + yLine);
        System.out.println("Ellipse: y = " + yEllipse);
        System.out.println("Hyperbola: y = " + yHyperbola);
    }
}