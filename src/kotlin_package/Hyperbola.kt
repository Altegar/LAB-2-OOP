package kotlin_package

import kotlin.math.pow
import kotlin.math.sqrt

class Hyperbola(private var a: Double, private var b: Double) : Curve() {
    @Override
    override fun calculateY(x: Double): Double {
        return sqrt((x.pow(2) / a.pow(2)) - 1) * b
    }
}