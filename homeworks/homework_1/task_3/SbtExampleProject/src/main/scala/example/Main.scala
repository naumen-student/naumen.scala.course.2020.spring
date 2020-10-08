package example

object Main extends App {
  def greeting(name: String, hello: String = "Hello"): Unit = {
    println(hello + " Scala! This is " + name)
  }

  greeting("Denis")
  greeting("Denis", "Guten tag")
  greeting("Denis", "Hola")
  greeting("Denis".reverse, "Hola")
  greeting("Denis".reverse, "Guten tag")
  greeting("Denis".reverse)
}