package classes

data class User(var name : String, val id :Int)

fun main() {
    val user = User("lahari",1)
    val user2 = User("lahari",1)

    println(user)
    println(user.name)
    //user.name = "reddy"
    //println(user.name)
    println(user==user2)
    println(user.hashCode())
    println(user2.hashCode())
}
