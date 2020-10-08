package example

object Main extends App {
  val name = "Ilya"
  val greetings = List("Hello Scala! This is", "Hola Scala! This is", "Guten tag Scala! This is")

  def printGreeting(greeting: String, name: String): Unit = {
    println(greeting + " " + name)
  }

  for (greeting <- greetings) printGreeting(greeting, name)
  for (greeting <- greetings) printGreeting(greeting, name.reverse)
}