class Person(val name: String){
    init {
        println("My name is $name")
    }
}

fun main(args: Array<String>) {
    val person = Person("Niloy")

}