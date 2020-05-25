object Main extends App {
  val a = 3
  val name = "Matthew"
  "111223".reverse
  val reverseFun: String => String = _.reverse

  val f: String => String => Unit = greet => name =>  println(s"$greet, this is $name")

  f("Hello")("Matthew")
  f("Hi")("Matvey".reverse)
  f("oi")("Matthew")
  f("So")(reverseFun("Matthew"))
}
