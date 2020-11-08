object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal](other: A): Shelter[A] = this.copy(animals :+ other)
    def ++[A >: T <: Animal](other: Shelter[A]): Shelter[A] = this.copy(animals ++ other.animals)

    def getNames: List[String] = animals.map(_.name)
    def feed[B >: T <: Animal](food: Food[B]): List[String] = animals.map(food.feed)
  }


  trait Food[A <: Animal] {
    def feed(animal: A): String = s"${animal.name} eats ${this.toString.toLowerCase}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}
