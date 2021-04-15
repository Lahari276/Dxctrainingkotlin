package collections

class Filter {
}
val nos = listOf<Int>(1,-2,3,4,-5,-9)
val words = listOf<String>("first","element","of","found","the","list","last")
fun main() {
    println("${nos.count()} digits")
    println("${nos.count { it %2 ==0 }} even numbers")
    val first = words.find { it.startsWith("f") }
    println(first)
    val last = words.findLast { it.startsWith("f") }
    println(last)
    val firstNo = nos.first()
    val lastNo = nos.last()
    println("first of nos = $firstNo, last of nos = $lastNo")
    val firstEvenNo = nos.first { it % 2 == 0 }
    val lastEvenNo = nos.last { it % 2 == 0 }
    println("first even no = $firstEvenNo, last even no = $lastEvenNo")
    val positives = nos.filter { it > 0}
    //x ->x>0
    println(positives)
    val doubles = nos.map { x -> x*2 }
    println("doubles = $doubles")
    println(nos.any{ it >2 } )
    println(nos.all{ it < 5})
    println(nos.none { it < 4})
}