object Main extends App {
  def greet(greeting: String, name: String): Unit = {
    println (s"${greeting}, Scala! This is ${name}")
  }

  var name = "Mary Kuzovleva"
  var greeting = Seq("Hello", "Bonjour", "Ciao")

  greeting.foreach(s => greet(s, name))
  greeting.foreach(s => greet(s, name.reverse))

}