package classes

enum class State {IDLE, CALLING, ANSWERING, RINGING}

fun main() {
    val state = State.CALLING
    val message =
        when(state) {
            State.IDLE -> "its idle"
            State.CALLING -> "calling phone"
            else -> "Nothing happening"
        }
    println(State.ANSWERING.ordinal)
}