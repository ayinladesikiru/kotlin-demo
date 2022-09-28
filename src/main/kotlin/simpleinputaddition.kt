import java.util.Scanner

fun main(args: Array<String>){
    print("Enter num1 and Num2: ")
    var reader = Scanner(System.`in`)
    var num1: Int = reader.nextInt()
    var num2: Int = reader.nextInt()
    var result = num1 + num2
    println("The sum of $num1 and $num2 is $result")
    if (num1 > num2) {
        println("$num1 is greater than $num2")
    }
    else if (num1 == num2){
        println("$num1 is the as same $num2")
    } else {
        println("$num2 is greater than $num1")
    }

}