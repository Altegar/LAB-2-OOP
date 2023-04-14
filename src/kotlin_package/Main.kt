package kotlin_package

fun main(args: Array<String>) {
    val line = Line(2.0, 3.0)
    val ellipse = Ellipse(4.0, 5.0)
    val hyperbola = Hyperbola(3.0, 2.0)

    // Calculating y values for different x values using different classes
    val x = readln().toDouble()
    val yLine = line.calculateY(x)
    val yEllipse = ellipse.calculateY(x)
    val yHyperbola = hyperbola.calculateY(x)

    // Output results
    println("Fox x = $x")
    println("Line: y = $yLine")
    println("Ellipse: y = $yEllipse")
    println("Hyperbola: y = $yHyperbola")
}