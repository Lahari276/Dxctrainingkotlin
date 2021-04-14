package basics

class Second {
}

fun main() {
    var a = 1;
    var name = "Lahari stands $a st in class. Lahari is bold"
    var age = 20
    //var sentence = "${name.replace("Lahari","Reddy")}"
    //println(sentence)
    //println(maxOfNumbers(15,17))
    //println(minOfNumbers(15,17))
    var students = listOf("lahari","reddy","hyma")
    when(students.size > 0)  {
        "lahari" in students -> println("lahari in ap")
        "reddy" in students -> println("reddy in telangana")

    }
    /*var index = 0
    while(index < items.size) {
        println("${items[index]} is at $index")
        index++
    }*/
/*for(index in items.indices) {
        println("${items[index]} is at $index")
    }*/
}

fun maxOfNumbers(a: Int,b: Int): Int {
    if(a > b) return a
    else return b
}

fun minOfNumbers(a: Int,b: Int): Int {
    if(a < b) return a
    else return b
}