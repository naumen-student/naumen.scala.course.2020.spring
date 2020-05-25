package homework_3

object Exercises {


    /**
     * Задание №1
     * Реализуйте функцию, которая принимает любой тип и преобразует его в строку.
     * Для всех типов кроме Boolean достаточно воспользоваться стандартной функцией .toString.
     * Для типа Boolean сделайте особое преобразование: true -> "правда", false -> "ложь".
     *
     * Реализуйте функцию тремя разными способами, отличающимися тем, как определяется какой тип имеет значение переданное в аргументе. 
     * Определение типа необходимо для реализации специальной логики работы с Boolean значениями, которая описана в условии выше.
     */
    def prettyBooleanFormatter1(x: Any): String = {
        if (x.getClass.getSimpleName == "Boolean") {
            if (x == true){
                return "правда"
            } else {
                return "ложь"
            }
        } else {
            x.toString
        }
    }

    def prettyBooleanFormatter2(x: Any): String = {
        x match {
            case bool: Boolean =>
                if (bool) {
                    return "правда"
                } else {
                    return "ложь"
                }
            case _ =>
        }
        x.toString
    }

    def prettyBooleanFormatter3(x: Any): String = {
        if (x.isInstanceOf[Boolean]) {
            if (x == true) {
                return "правда"
            } else {
                return "ложь"
            }
        }
        x.toString
    }


    /**
     * Задание №2
     * Реализуйте функцию нахождения максимального числа в переданной коллекции интов (можно использовать все методы стандартной библиотеки).
     *
     * Реализуйте функцию тремя разными способами, отличающимися тем как функция себя ведет на пустой коллекции.
     * Обратите внимание на возвращаемые типы.
     */
    def max1(xs: Seq[Int]): Int = xs match {
        case _ if xs.isEmpty => 0
        case _  => xs.max
    }

    def max2(xs: Seq[Int]): Seq[Int] = {
        if (xs == Nil) {
            Seq.empty[Int]
        } else {
            Seq(xs.max)
        }
    }

    def max3(xs: Seq[Int]): Option[Int] = {
        if (xs.nonEmpty) {
            Some(xs.max)
        } else {
            None
        }
    }

    /**
     * Задание №3
     * Допустим дана функция sumIntegers, которая умеет суммировать числа.
     */
    def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

    /**
     * Реализуйте на основе нее 3 варианта суммирования 2х чисел, отличающиеся способом передачи этих 2х чисел в функцию sumIntegers.
     * Как минимум одна из реализаций должна использовать тип данных (класс) написанный вами самостоятельно.
     */
    class MyClass (x: Int, y: Int) extends Iterable[Int] {
        override def iterator: Iterator[Int] = Iterator(x, y)
    }

    def sum1(x: Int, y: Int): Int = sumIntegers(new MyClass(x, y))
    def sum2(x: Int, y: Int): Int = sumIntegers(x :: y :: Nil)
    def sum3(x: Int, y: Int): Int = sumIntegers(Iterable[Int](x, y))

}
