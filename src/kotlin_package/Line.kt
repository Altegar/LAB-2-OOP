package kotlin_package

class Line(private var a: Double, private var b: Double) : Curve() {
    @Override
    override fun calculateY(x: Double): Double {
        return a * x + b
    }
}