package collections

class Filter {
}
val nos = listOf<Int>(1,-2,3,4,-5,-9)
fun main() {
    val positives = nos.filter { it > 0}
    //x ->x>0
    println(positives)
    val doubles = nos.map { x -> x*2 }
    println("doubles = $doubles")
    println(nos.any{ it >2 } )
    println(nos.all{ it < 5})
    println(nos.none { it < 4})
}