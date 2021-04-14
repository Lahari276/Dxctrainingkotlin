package basics

class WhenThen {
}

fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(3L))
    println(describe(5))
    println(describe("something"))

}
fun describe(obj :Any):String {
    return when(obj) {
        1 -> "one"
        "Hello" -> "greeting"
        is Long -> "long no"
        !is String -> "it is not string"
        else -> "unknown"
    }
}
