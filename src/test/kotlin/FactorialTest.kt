import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class FactorialTest {

    private val factorialClass = Factorial()

    @Test
    fun factorialWithLooping() {
        val result = factorialClass.factorialWithLooping(4)
        println("Factorial with looping: ${factorialClass.factorialWithLooping(4)}")
        assertEquals(24, result)
    }

    @Test
    fun factorialWithRecursive1() {
        val result = factorialClass.factorialWithRecursive1(4)
        println("Factorial with recursive (if else expression): ${factorialClass.factorialWithRecursive1(4)}")
        assertEquals(24, result)
    }

    @Test
    fun factorialWithRecursive2() {
        val result = factorialClass.factorialWithRecursive2(4)
        println("Factorial with recursive (when expression): ${factorialClass.factorialWithRecursive2(4)}")
        assertEquals(24, result)
    }

    @Test
    fun factorialWithTailRecursive() {
        val result = factorialClass.factorialWithTailRecursive(1, 4)
        println("Factorial with tail recursive): ${factorialClass.factorialWithTailRecursive(1, 4)}")
        assertEquals(24, result)
    }

    @Test
    fun factorialWithTransformation() {
        val result = factorialClass.factorialWithTransformation(4)
        println("Factorial with transformation: ${factorialClass.factorialWithTransformation(4)}")
        assertEquals(24, result)
    }

    @Test
    fun factorialWithReduce() {
        val result = factorialClass.factorialWithReduce(4)
        println("Factorial with reduce: ${factorialClass.factorialWithReduce(4)}")
        assertEquals(24, result)
    }

    @Test
    fun factorialWithFold() {
        val result = factorialClass.factorialWithFold(4)
        println("Factorial with fold: ${factorialClass.factorialWithFold(4)}")
        assertEquals(24, result)
    }
}