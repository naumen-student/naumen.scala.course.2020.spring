object Exercises {
  sealed trait Animal extends Product with Serializable {
    def name: String

  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+A <: Animal](inhabitants: List[A]) {
    def +[B >: A <: Animal](other: B): Shelter[B] =
      this.copy(other :: inhabitants)

    def ++[B >: A <: Animal](others: Shelter[B]): Shelter[B] =
      this.copy(inhabitants ++ others.inhabitants)

    def getNames: List[String] = inhabitants.map(_.name)
    def feed[AA >: A <: Animal](food: Food[AA]): List[String] = inhabitants.map(food.feed(_))
  }

  sealed trait Food[A <: Animal] extends Product with Serializable {
    def feed[B <: A](that: B): String =
      s"${that.name} eats ${this.toString.toLowerCase}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}
