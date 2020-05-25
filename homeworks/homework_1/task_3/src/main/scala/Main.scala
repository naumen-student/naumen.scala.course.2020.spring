object Main extends App {
  val secondPhrase = ", Scala! This is "
  val name = "Roman Yaschenko"
  val phrases = Array("Hello", "Hola", "Gutten tag")

  def Hello(a: String, b: String, c: String) = println(a + b + c)

  for(phrase <- phrases)
    Hello(phrase, secondPhrase, name)

  def Reverse(n: String) = n.reverse.toString

  for(phrase <- phrases)
    Hello(phrase, secondPhrase, Reverse(name))
}
