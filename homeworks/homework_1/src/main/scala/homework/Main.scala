package homework

object Main extends App {
  val name = "Valera Vedernikov"
  val greetings = Array("Hello", "Hola", "Guten tag")
  def printGreet(greetings: Array[String], name: String): Unit ={
    for (greeting <- greetings){
      println(s"${greeting} Scala! This is ${name}")
    }
  }
  printGreet(greetings, name)
  printGreet(greetings, name.reverse)
}
