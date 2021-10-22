package com.example.assignment8

import io.mockk.mockkObject
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Unit test class for solveQuadraticEquation function
 * includes: 3 failed test case + 5 passed test case
 */
class SolveQuadraticEquationFunctionUnitTest {
    /**
     * Utils.solveQuadraticEquation must be returned: "No solution"
     * Passed test case
     */
    @Test
    fun solveQuadraticEquation_resultHasNoSolution() {
        mockkObject(Utils)

        assertEquals("No solution", Utils.solveQuadraticEquation(2.0, -3.0, 5.0))
    }

    /**
     * Utils.solveQuadraticEquation must be returned: "No solution", not "No Solution"...
     * Failed test case
     */
    @Test
    fun solveQuadraticEquation_resultHasNoSolutionSpellingMistake() {
        mockkObject(Utils)

        assertEquals("No Solution", Utils.solveQuadraticEquation(2.0, -3.0, 5.0))
    }

    /**
     * Utils.solveQuadraticEquation must be returned 1 solution
     * Passed test case
     */
    @Test
    fun solveQuadraticEquation_resultHasOneSolution() {
        mockkObject(Utils)

        assertEquals("1.25", Utils.solveQuadraticEquation(16.0, -40.0, 25.0))
    }

    /**
     * Utils.solveQuadraticEquation must be returned 1 solution with correct format
     * Failed test case
     */
    @Test
    fun solveQuadraticEquation_resultHasOneSolutionFalseFormat() {
        mockkObject(Utils)

        assertEquals("1.250", Utils.solveQuadraticEquation(16.0, -40.0, 25.0))
    }

    /**
     * Utils.solveQuadraticEquation must be returned 2 solution: bigger solution then smaller solution
     * Passed test case
     */
    @Test
    fun solveQuadraticEquation_resultHasTwoSolutionByOrder() {
        mockkObject(Utils)

        assertEquals("1.0 0.2", Utils.solveQuadraticEquation(5.0, -6.0, 1.0))
    }

    /**
     * Utils.solveQuadraticEquation must be returned exactly 2 solution
     * Failed test case
     */
    @Test
    fun solveQuadraticEquation_resultHasTwoSolutionButOneCorrect() {
        mockkObject(Utils)

        assertEquals("1.0 2.0", Utils.solveQuadraticEquation(5.0, -6.0, 1.0))
    }

    /**
     * Utils.solveQuadraticEquation must be returned solution with case: 0x^2 + Bx + C = 0
     * Passed test case
     */
    @Test
    fun solveQuadraticEquation_resultWithAEqualsZero() {
        mockkObject(Utils)

        assertEquals("2.0", Utils.solveQuadraticEquation(0.0, -6.0, 12.0))
    }

    /**
     * Utils.solveQuadraticEquation must be returned solution with case: 0x^2 + 0x + C = 0
     * Passed test case
     */
    @Test
    fun solveQuadraticEquation_resultWithAAndBEqualsZero() {
        mockkObject(Utils)

        assertEquals("No solution", Utils.solveQuadraticEquation(0.0, 0.0, 1.0))
    }
}