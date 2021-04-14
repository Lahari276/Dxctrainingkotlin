package basics

class Range {
}

fun main() {
    val x =5
    for (x in 10 downTo 1 step 3) println(x)
    //val y = 6
    //num(2)
    //num(345)
    //num(56)
    num(7654)

    /*if(x in 3..y) {
        println("in range")

    }
    else {
        println("not in range")

    }*/

}
fun num(a :Int) {
    return when(a) {
        in 1..10 -> println("its in 10s")

        in 100..999 -> println("its in 100's")
        in 999..9999 -> println("its in 1000")

        else -> println("not in mentioned range")
    }
}