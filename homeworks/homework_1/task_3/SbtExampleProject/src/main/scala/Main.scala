object Main extends App {
  def greeter(greet: String, body: String, who: String): Unit = println((greet :: body :: who :: Nil).mkString(" "))

  val foo = (x: String) => greeter(x, "Scala! This is", "reshke")
  val bar = (x: String) => greeter(x, "Scala! This is", "reshke".reverse)

  val funs = foo :: bar :: Nil

  val greetings = "Hello" :: "Hola" :: "Guten Tag" :: Nil

  funs.foreach { (x) =>
    greetings.foreach {
      x
    }
  }
}
