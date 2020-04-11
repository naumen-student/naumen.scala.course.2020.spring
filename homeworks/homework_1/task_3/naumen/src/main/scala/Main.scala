object Main extends App {
  val hello = List("Hello", "Hola", "Guten tag")
  val name = "Pavel Kargapolov"

  hello.foreach(hello => println(s"$hello Scala! This is $name"))
  hello.foreach(hello => println(s"$hello Scala! This is ${name.reverse}"))
}
