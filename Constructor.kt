class Person(val name: String){
    val age:Int =0    //age is initialized by the secondary constructor, so it must be declared in the class body.
    init {
        println("My name is $name")
    }
    constructor(name: String,age:Int):this(name){
        this.age
        println("I'm $age years old.")
    }
}

fun main(args: Array<String>) {
    val person = Person("Niloy",22)

}