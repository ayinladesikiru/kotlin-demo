fun main(){
    val a = 10
    val b = 9
    val c = -1

    val result: Boolean = (a>b) xor (a>c) || (a>b) and (a>c)
    println(result)
    main1()
}

private fun main1(){
    val numbers = intArrayOf(1, 4, 42, -3)
    if (4 in numbers){
        println("numbers array contains 4")
    }
}

