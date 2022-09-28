fun main(){
    main1()
    main2(2, 3)
    main3()
    main4()
    main5()
    main6()
}

private fun main1(){
    var myName = "Asa"
    myName = "Zhikirullah"
    println("my name is $myName")
}

private fun main2(a: Int, b: Int) {
    var ans = a + b
    println("The sum of $a and $b is $ans")
}

private fun main3() {
    val num1 = 25
    val num2: Int = 25
    var ans = num1 * num2
    println("The multiplication of $num1 and $num2 is $ans")
}
    private fun main4(){
        val num1 = 25
        val num2: Int = 25
        var ans = num1 % num2
        println("The remainder of $num1 and $num2 is $ans")

}

private fun main5() {
    val num1 = 25
    val num2: Int = 25
    var ans = num1 / num2
    println("The division of $num1 and $num2 is $ans")
}

private fun main6() {
    val num1 = 25
    val num2: Int = 25
    var ans = num1 - num2
    println("The subtraction of $num1 and $num2 is $ans")
}