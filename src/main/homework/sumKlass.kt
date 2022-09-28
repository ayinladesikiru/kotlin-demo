import java.util.Scanner

class sumKlass {
    var reader = Scanner(System.`in`)

    fun main3() {
        val num1 = reader.nextInt()
        val num2 = reader.nextInt()
        var ans = num1 * num2
        println("The multiplication of $num1 and $num2 is $ans")

    }
}