object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](private val animals: List[T]) {
    def +[Arg >: T <: Animal](animal: Arg): Shelter[Arg] = Shelter(animals :+ animal)

    def ++[Arg >: T <: Animal](that: Shelter[Arg]): Shelter[Arg] = Shelter(animals ++ that.animals)

    def getNames: List[String] = animals.map(_.name)

    def feed(food: Food[T]): List[String] = animals.map(food.feed)
  }

  trait Food[-A <: Animal] {
    def feed(animal: A): String = s"${animal.name} eats ${this.toString}"
  }

  case object Meat extends Food[Animal] {
    override def toString: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override def toString: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override def toString: String = "bread"
  }
}
