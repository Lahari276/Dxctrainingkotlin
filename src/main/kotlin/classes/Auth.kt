package classes

object Auth {
    fun takeCredentials(name: String, password: String){
        println("log in with $name and $password ")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        Auth.takeCredentials("lahari","reddy")

    }
}