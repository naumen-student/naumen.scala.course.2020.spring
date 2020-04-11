object Main extends App {

  val greetings = "Holla" :: "Hello" :: "Gutten tag" :: Nil

  def myPrinln(greet: String, name: String, f: String => String): Unit =
    println(s"$greet Scala! This is ${f(name)}")

  greetings.foreach(greet => myPrinln(greet, "Georgy Naboychenko", identity))
  greetings.foreach(greet => myPrinln(greet, "Georgy Naboychenko", _.reverse))

}
