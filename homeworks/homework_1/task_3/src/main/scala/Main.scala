object Main extends App{
  val welcomeWords = Seq("Hello", "Hola", "Guten tag")

  def welcome(welcomeWord:String, name: String, shouldReverse: Boolean): String
    = s"${welcomeWord} Scala! This is ${if (shouldReverse) name.reverse else name}"

  welcomeWords.map(s => println(welcome(s, "Roman", false)))

  welcomeWords.map(s => println(welcome(s, "Roman", true)))
}
