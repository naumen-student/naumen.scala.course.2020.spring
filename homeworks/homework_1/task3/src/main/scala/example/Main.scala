package example

object Main extends App {
  val name = "Evgenia Dolgaeva"
  def welcome(greeting: String, myName: String): Unit = println(greeting + " Scala! This is " + myName)
  val greets = "Hello"::"Hola"::"Guten tag"::Nil

  greets.foreach(greet => welcome(greet, name))
  greets.foreach(greet => welcome(greet, name.reverse))
}
