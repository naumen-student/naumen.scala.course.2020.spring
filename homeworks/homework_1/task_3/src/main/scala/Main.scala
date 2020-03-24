object Main extends App {
  val name = "Artemiy Manakov"
  val greets = "Hello"::"Hola"::"Guten Tag"::"Salut"::Nil
  def welcome(greeting: String, inputName: String): Unit = println(greeting + ", Scala! This is " + inputName)

  greets.foreach(greet => welcome(greet, name))
  greets.foreach(greet => welcome(greet, name.reverse))
}