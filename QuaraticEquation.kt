import kotlin.math.*
fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }
    val discriminant = (b.pow(2))-(4*a*c)
    if (a == 0.0){
        //It's Not a quadratic equation. It can be Linear.

    }else if (discriminant<0.0){
        //It has two complex roots.(Imaginary outputs)


    }
    else if (discriminant==0.0){
        // It has two real and equal roots.(two real and equal roots)

        val x = -b/(2*a)
        println("Root1: $x")
        println("Root2: $x")

    }
    else {
        // It has two real and distinct roots.

        val x1 = (-b+sqrt(discriminant))/(2*a)
        val x2 = (-b-sqrt(discriminant))/(2*a)
        println("Root1 = %.5f".format(x1))
        println("Root2 = %.5f".format(x2))
    }

}