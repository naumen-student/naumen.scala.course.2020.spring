package example

object Main extends App {
  val myName = "Danil Mironov"
  val reversedName = myName.reverse
  val hello = (helloWord: String, name: String) => s"$helloWord Scala! This is $name\n"
  for (name <- Seq(myName, reversedName)){
    for (hWord <- Seq("Hello", "Hola", "Guten tag"))
      print(hello(hWord, name))
  }
}
