object Main extends App {
  val name = "Andrey"
  val reversedName = name.reverse
  val greetings = Seq("Hello", "Hola", "Guten tag")

  def hello(greet: String, name: String) : Unit = println(s"${greet} Scala! This is ${name}")

  greetings.map(hello(_, name))
  greetings.map(hello(_, reversedName))
}