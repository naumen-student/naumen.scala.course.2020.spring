package sbt

object Main extends App {
  val name = "Matvey"
  val reg = " Scala! This is "
  val lt: List[String] = List("Hello", "Hola", "Guten tag")
  def pt(greet: String, name: String = name): Unit = println(greet + reg + name)
  lt.foreach(gt => pt(gt))
  lt.foreach(gt => pt(gt, name.reverse))
}