package example

object Main extends App {
  var hello = "Hello"
  var name = "Mr Anton Kokorin"


  def printToConsole(hi: String, name: String): Unit ={
    println(s"${hi} Scala! This is ${name}")
  }

  printToConsole(hello, name)

  hello = "Hohoho"
  printToConsole(hello, name)

  hello = "WHASSUPPP!"
  printToConsole(hello, name)

  printToConsole(hello, name.reverse)

  printToConsole(hello, name.toLowerCase)

  printToConsole(hello.toLowerCase, name.reverse)

}
