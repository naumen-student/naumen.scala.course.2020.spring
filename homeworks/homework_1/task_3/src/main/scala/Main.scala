object Main {
  def main(args: Array[String]) = {
    val my_name = "Alexander Chernetsow"
    val reverse_my_name = my_name.reverse

    val names = Array(my_name, reverse_my_name)
    val hi = Array("Hello", "Saluton", "Ohayou")

    val func = (greeting:String, name:String) => s"${greeting} Scala! This is ${name}"

    names foreach (name => hi foreach (word => println(func(word, name))))
  }
}
