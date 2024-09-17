package example

object Main extends App {
  def printGreeting(greeting: String, name: String) : Unit = {
    println(s"$greeting Scala! This is $name")
  }

  val myName = "Danil"
  val namesList = List(myName, myName.reverse)
  val greetingsList = List("Hello", "Zdarova", "Sup")

  for(greeting <- greetingsList){
    for(name <- namesList){
      printGreeting(greeting, name)
    }
  }
}
