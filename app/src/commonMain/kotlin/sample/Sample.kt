package sample

class Greeting {
    private val date = KMPDate("MMM dd")
    fun hello(): String =  "Hello, Android and iOS worlds, today is ${date.asString()}!"
}

expect class KMPDate(formatString: String) {
    fun asString(): String
}
