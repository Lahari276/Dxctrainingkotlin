package collections
val issues: MutableSet<String> = mutableSetOf("issue1","issue2","issue3","issue1")

fun addIssue(issue: String):Boolean {
    if(issues.add(issue)) {
        println("issue added")
        return true
    }
    else {
        println("issue exists")
        return false
    }
}
class Sets {
}

fun main(){
    println(issues)
    println(addIssue("issue4"))
    println(issues)
    println(addIssue("issue1"))

}