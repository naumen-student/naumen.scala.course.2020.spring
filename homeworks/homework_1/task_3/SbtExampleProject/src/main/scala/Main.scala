object Main extends App {
    val myName = "Artemiy Izakov"
    val reversedName = myName.reverse

    val greetings = Seq("Hello", "Hola", "Guten tag")

    def greet(greeting: String, name: String): Unit = println(s"$greeting Scala! This is $name")

    greetings.map(greet(_, myName))

    greetings.map(greet(_, reversedName))
}
