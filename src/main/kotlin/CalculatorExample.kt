import java.lang.IllegalArgumentException

fun main() {
    val calculator = FPCalculator()

    val result = calculator.calcualte({num1, num2 -> num1 + num2}, 1, 2)

    println(result == 3)
}

class SimpleCalculator {
    fun calculate(operator: Char, num1: Int, num2: Int): Int = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        else -> throw IllegalArgumentException("Invalidate Operator")
    }
}

class FPCalculator {
    fun calcualte(calculator: (Int, Int) -> Int, num1: Int, num2: Int): Int = calculator(num1, num2)
}