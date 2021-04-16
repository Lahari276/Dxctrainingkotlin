package namedarguments

class NamedArgs {
}
data class format(val userName: String,val domain: String)
fun main() {
    println(format("lahari","example.com"))
    println(format("mydomain.com","reddy"));
    println(format(userName = "lahari",domain = "domain.com"))
}