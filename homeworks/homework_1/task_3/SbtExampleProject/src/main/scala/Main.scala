object Main extends App {
  def hello(greeting: String, name: String): Unit = println(s"$greeting Scala! This is $name")

  val greetings = Array("Hello", "Hola", "Guten tag")
  var name = "Dima Kholstinin"
  for (greeting <- greetings) hello(greeting, name)

  name = name.reverse
  greetings.foreach(greeting => hello(greeting, name))
}
