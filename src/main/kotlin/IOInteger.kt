import java.util.Scanner

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    print("Enter a number: ")
    var number: Int = reader.nextInt()
    println("You entered: $number")
}