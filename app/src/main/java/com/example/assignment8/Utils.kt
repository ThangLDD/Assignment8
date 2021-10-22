package com.example.assignment8

import kotlin.math.sqrt

object Utils {

    fun solveQuadraticEquation(a: Double, b: Double, c: Double): String {
        if (a == 0.0) {
            return if (b == 0.0) {
                ("No solution")
            } else {
                "${-c / b}"
            }
        }

        val delta = b * b - 4 * a * c
        val x1: Double
        val x2: Double

        return when {
            delta > 0.0 -> {
                x1 = ((-b + sqrt(delta)) / (2 * a))
                x2 = ((-b - sqrt(delta)) / (2 * a))
                ("$x1 $x2")
            }
            delta == 0.0 -> {
                x1 = -b / (2 * a)
                "$x1"
            }
            else -> {
                "No solution"
            }
        }
    }
}
