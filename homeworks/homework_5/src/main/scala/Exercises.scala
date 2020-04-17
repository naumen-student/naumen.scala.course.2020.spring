object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](private val animals: List[T] = Nil) {

    def +[R >: T <: Animal](animal: R): Shelter[R] = Shelter(animal :: animals)

    def ++[R >: T <: Animal](other: Shelter[R]): Shelter[R] = Shelter(animals ++ other.animals)

    def getNames: Seq[String] = animals.map(_.name)
  }

  trait Food ...

  case object Meat extends Food[Animal] ...

  case object Milk extends Food[Cat] ...

  case object Bread extends Food[Dog] ...
}
