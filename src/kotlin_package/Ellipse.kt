package kotlin_package

import kotlin.math.pow
import kotlin.math.sqrt

class Ellipse(private var a: Double, private var b: Double) : Curve() {
    @Override
    override fun calculateY(x: Double): Double {
        return sqrt(1 - (x.pow(2) / a.pow(2))) * b
    }
}