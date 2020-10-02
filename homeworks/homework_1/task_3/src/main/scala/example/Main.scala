package example

object Main extends App{
  val hello = (name: String) => "Hello Scala! This is " + name
  val helloReplacer = (oldPattern: String, newPattern: String, hello: String) => hello.replaceAll(oldPattern, newPattern)

  val name = "Denis Matafonov"
  val hello_denis = hello(name)

  println(hello_denis)
  println("Esp: " + helloReplacer("Hello", "Hola", hello_denis))
  println("Ger: " + helloReplacer("Hello", "Guten tag", hello_denis))
  println("Reversed: " + helloReplacer(name, name.reverse, hello_denis))
}
