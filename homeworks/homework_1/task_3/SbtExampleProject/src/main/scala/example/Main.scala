package example

object Main extends App {

  var body = "Scala! This is "
  var name = "Ekaterina Guseva"
  var greetings = List("Hello","Hola","Guten tag")
  def allPhrases(): Unit = {
    println("Correct name:")
    greetings.foreach(hi=>println(hi+body+name))
    println("Changed name:")
    greetings.foreach(hi=>println(hi+body+name.reverse))
  }
  allPhrases()

}
