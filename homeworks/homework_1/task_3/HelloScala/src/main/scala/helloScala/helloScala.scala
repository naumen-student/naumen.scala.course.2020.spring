package helloScala

object Main extends App {
  val helloName = (g: String, n: String) =>
    println(g + " Scala!! This is " + n)

  val greetings = Array("Aloha", "Privet", "Salam")

  val reversedName = "Vlad Malyshev".reverse

  greetings.foreach(g => helloName(g, reversedName))
}
