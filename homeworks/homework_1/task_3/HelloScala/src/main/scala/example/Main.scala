package example

object Main extends App {
  def printHello(salutatory_word:String, name: String): Unit = println(f"$salutatory_word%s Scala! This is $name%s")
  val salutatory_words = Seq("Hello", "Hola", "Guten tag")
  val name = "Maksim Zayakin"
  for {name <- Seq(name, name.reverse)
       salutatory_word <- salutatory_words} printHello(salutatory_word, name)
}
