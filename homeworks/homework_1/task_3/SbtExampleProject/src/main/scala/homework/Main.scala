package homework

object Main extends App {
  val a = 3
  val name = "anton"
  "aaabbc".reverse
  val revF: String => String = _.reverse

  val f: String => String => Unit = greet => name =>  println(s"$greet, this is $name")
  f("Hello")("Anton")

  f("Hola")("Anton")

  f("GutenTag")("Anton")

  f("Hello")("Anton".reverse)

  f("Hola")("Anton".reverse)

  f("GutenTag")("Anton".reverse)

}