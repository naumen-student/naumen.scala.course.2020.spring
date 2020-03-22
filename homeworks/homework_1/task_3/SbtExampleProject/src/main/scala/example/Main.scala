object Main extends App {
  def printGreetings(name: String): Unit = {
    val names = Array(name, name.reverse)
    val greetings = Array("Hello", "Hola", "Guten tag")

    for (name <- names) {
      for (greeting <- greetings) {
        println(s"$greeting Scala! This is $name")
      }
    }
  }

  printGreetings("Timofey Utrobin")
}
