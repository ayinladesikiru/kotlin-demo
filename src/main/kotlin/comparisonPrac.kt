import kotlin.math.max

fun main(args: Array<String>){
    val a = -12
    val b =12
    // use of greater than operator
    val max = if (a > b){
        println("a is greater than b.")
        a
    } else {
        println("b is geater than a.")
        b
    }
    println("max = $max")

    var num: Int = 5
    print(num.toDouble())
}

fun maxFind(){
    val maxi: Int = 7
    val mini: Int = 5
    if(maxi > mini){
        println("$maxi")
    } else {
        print("$mini")
    }
}