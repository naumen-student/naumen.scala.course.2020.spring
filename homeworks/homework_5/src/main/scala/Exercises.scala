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

    def feed[R >: T <: Animal](food: Food[R]): Seq[String] = animals.map(food.feed(_))
  }

  trait Food[T <: Animal] {
    protected val name: String

    def feed(animal: T): String = s"${animal.name} eats $name"
  }

  case object Meat extends Food[Animal] {
    override protected val name = "meat"
  }

  case object Milk extends Food[Cat] {
    override protected val name = "milk"
  }

  case object Bread extends Food[Dog] {
    override protected val name = "bread"
  }
}
