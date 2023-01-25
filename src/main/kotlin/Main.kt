import com.rsk.Person

fun main(args: Array<String>) {
    println("Hello World!")

    val kevin = Person()

    kevin.Name = "Kevin"

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")
}