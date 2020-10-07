object Main extends App {
  val greetings = List("Hello", "Hola", "Sup")
  val name = "Polina Galeeva"

  def print_greet(greet: String, name: String): Unit = {
    println(s"$greet Scala! This is $name")
  }

  greetings.foreach(greeting => print_greet(greeting, name))
  greetings.foreach(greeting => print_greet(greeting, name.reverse))
}