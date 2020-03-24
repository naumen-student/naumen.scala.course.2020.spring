package example

object Main extends App {
  val me = "Matthew"
  val eng = "Hello"
  val ger = "Guten tag"
  val jap = "こんにちは"
  val meReversed = me.reverse

  def hello(greet: String, name: String): Unit = {
    println(s"$greet Scala! This is $name")
  }

  val greets = Array(eng, ger, jap)

  greets.foreach(greet => hello(greet, me))
  greets.foreach(greet => hello(greet, meReversed))
}
