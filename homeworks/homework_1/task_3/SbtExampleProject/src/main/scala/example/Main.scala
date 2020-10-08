object Main extends App {
  def printHello(name: String, language: String) : Unit = {
    val helloOnEnglish = "Hello"
    val helloOnGerman = "Guten tag"
    val helloInItalian = "Ciao"
    val middleOfPhrase = " Scala! This is "
    if (language == "English"){
      println(helloOnEnglish + middleOfPhrase + name)
    } else if (language == "German"){
      println(helloOnGerman + middleOfPhrase + name)
    } else if (language == "Italian"){
      println(helloInItalian + middleOfPhrase + name)
    } else {
      throw new IllegalArgumentException
    }
  }
  val myName = "Vyacheslav Shubakov"
  val myInvertedName = myName.reverse
  printHello(myName, "English")
  printHello(myName, "German")
  printHello(myName, "Italian")
  printHello(myInvertedName, "English")
  printHello(myInvertedName, "German")
  printHello(myInvertedName, "Italian")
  //printHello(myInvertedName, "Russian") - а вот эта строка уже не сработает, выскочит "java.lang.IllegalArgumentException", чего я и добивался
}
