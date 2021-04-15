package collections

class AssociateBy {
}
data class Person(val name:String, val city :String, val phone : Int)

val people = listOf<Person> (
    Person("lahari","Hyderabad",7896),
    Person("reddy","Hyderabad",346373),
    Person("srujan","Bangalore",983272),
    Person("hyma","Bangalore",6326))
fun main() {
    val phoneBook = people.associateBy { it.city }
    println(phoneBook)
}