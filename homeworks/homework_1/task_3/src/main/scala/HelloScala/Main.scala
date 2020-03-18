package HelloScala

object Main extends App{
  def printGreetings(name: String, grts: Array[String]) = {
    val fullGrts = grts.map(grt => s"$grt Scala! This is $name!")

    fullGrts.foreach(println)
    fullGrts.foreach(grt => println(grt.reverse))
  }

  val name = " Mikail Stepanov"
  val greetings = Array[String]("Hello ", "Salut ", "Привет ")

  printGreetings(name, greetings)
}
