package example

object Main extends App {
  var name = "Alexandr"
  var greet = (greeting: String, name: String) => println(s"${greeting} Scala! This is ${name}")
  greet("Hello", name)
  greet("Hola", name)
  greet("Guten tag", name)
  greet("Guten tag", name.reverse)
  greet("Hola", name.reverse)
  greet("Hello", name.reverse)
}