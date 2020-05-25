package homework_3

object Exercises {

  val правда = "правда" //раз уж используем рефлексию, то и не-ASCII сойдет

  val ложь = "ложь" //во все тяжкие, так-с сказать

  /**
    * Задание №1
    * Реализуйте функцию, которая принимает любой тип и преобразует его в строку.
    * Для всех типов кроме Boolean достаточно воспользоваться стандартной функцией .toString.
    * Для типа Boolean сделайте особое преобразование: true -> "правда", false -> "ложь".
    *
    * Реализуйте функцию тремя разными способами, отличающимися тем, как определяется какой тип имеет значение переданное в аргументе.
    * Определение типа необходимо для реализации специальной логики работы с Boolean значениями, которая описана в условии выше.
    */
  def prettyBooleanFormatter1(x: Any): String = x match {
    case true  => правда
    case false => ложь
    case _     => x.toString
  }

  def prettyBooleanFormatter2(x: Any): String =
    if (x.isInstanceOf[Boolean]) if (x.asInstanceOf[Boolean]) правда else ложь
    else x.toString

  def prettyBooleanFormatter3(x: Any): String =
    if (x.getClass.getName == "java.lang.Boolean")
      if (x.asInstanceOf[Boolean]) правда else ложь
    else x.toString

  /**
    * Задание №2
    * Реализуйте функцию нахождения максимального числа в переданной коллекции интов (можно использовать все методы стандартной библиотеки).
    *
    * Реализуйте функцию тремя разными способами, отличающимися тем как функция себя ведет на пустой коллекции.
    * Обратите внимание на возвращаемые типы.
    */
  def max1(xs: Seq[Int]): Int = xs.max

  def max2(xs: Seq[Int]): Seq[Int] = xs match {
    case s @ Seq() => s
    case _         => xs.max +: Seq()
  }

  /**
    * Scala 2.13 has [[https://www.scala-lang.org/api/2.13.x/scala/collection/immutable/List.html#maxOption[B%3E:A](implicitord:scala.math.Ordering[B]):Option[A]  maxOption]]
    */
  def max3(xs: Seq[Int]): Option[Int] = xs match {
    case Seq() => Option.empty[Int]
    case _     => Option.apply(xs.max)
  }

  /**
    * Задание №3
    * Допустим дана функция sumIntegers, которая умеет суммировать числа.
    */
  def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int =
    xs.sum

  /**
    * Реализуйте на основе нее 3 варианта суммирования 2х чисел, отличающиеся способом передачи этих 2х чисел в функцию sumIntegers.
    * Как минимум одна из реализаций должна использовать тип данных (класс) написанный вами самостоятельно.
    */
  case class TupleIt(x: Int, y: Int) extends Iterable[Int] {
    override def iterator: Iterator[Int] = new Iterator[Int] {
      override def hasNext: Boolean = count < 2
      private var count = 0
      override def next(): Int = count match {
        case 0 =>
          count += 1
          x
        case 1 =>
          count += 1
          y
        case _ => -1
      }
    }
  }
  def sum1(x: Int, y: Int): Int = sumIntegers(Seq(x, y))
  def sum2(x: Int, y: Int): Int = sumIntegers(x :: y :: Nil)
  def sum3(x: Int, y: Int): Int = sumIntegers(TupleIt(x, y))

}
