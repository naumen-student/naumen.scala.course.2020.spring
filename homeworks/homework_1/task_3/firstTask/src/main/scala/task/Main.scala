package task

object Main extends App {
  var name = "Pavel Grachev"
  val hi = (hiWord: String) => print(hiWord + " Scala! This is " + name + "\n")
  val hiWords = Array("Hello","Bonjour","Guten tag")

  for ( word <- hiWords) hi(word)

  name = name.reverse
  for ( word <- hiWords) hi(word)
}
