package functions

class HigherOrder {
}
fun mul(a: Int, b: Int):Int{//
    return a*b
}
fun sum(x: Int, y: Int) = x+y
fun funReturningOtherFun(): (Int)->Int {
    return ::square
}
fun square(x: Int) = x*x

fun calculate(x: Int, y: Int, operation: (Int,Int) -> Int): Int{
    return operation(x,y)
}
fun main() {
    val func = funReturningOtherFun()
    val resultSum = calculate(20,20, ::sum)
    val resultMul = calculate(60,18,::mul)
    println(resultSum)
    println(resultMul)
    println(func(8))
}