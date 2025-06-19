class Person(val name: String){
    val age:Int =0    //age is initialized by the secondary constructor, so it must be declared in the class body.


    constructor(name: String,age:Int):this(name){
        this.age

        println("$name is $age years old.")
    }
}

fun main(args: Array<String>) {
    val person1 = Person("Niloy",)
    println("My name is ${person1.name}")
    val parson2 = Person("Rubel",22)
    val person3 = Person("Akash",23)

}