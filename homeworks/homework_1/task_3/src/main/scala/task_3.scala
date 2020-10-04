object Hello extends App{
  val greetArray = Array("Hello", "Privet", "Isenmesez")
  val part = ", Scala! This is "
  val names = Array("Nikita", "Atikin")


  def sayHi(): Unit ={
    for (greeting <- 0 to 2)
      for (name <- 0 to 1)
        println(greetArray(greeting) + part + names(name))
  }

  sayHi()
}
