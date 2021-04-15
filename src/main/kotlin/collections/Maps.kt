package collections

class Maps {
}

val passedStudents: MutableMap<Int,String> = mutableMapOf();

fun main() {
    passedStudents.put(1,"lahari")
    passedStudents.put(2,"reddy")
    passedStudents.put(3,"alekhya")
    println(passedStudents)
    println(passedStudents.keys)
}