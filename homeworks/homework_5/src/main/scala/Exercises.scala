object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal](animal: A): Shelter[A] = Shelter(animal::animals)
    def ++[A >: T <: Animal](shelter: Shelter[A]): Shelter[A] = Shelter(animals:::shelter.animals)
    def getNames: List[String] = animals.map(_.name)
    def feed[A >: T <: Animal](food: Food[A]): List[String] = animals.map(food.feed)
  }



  trait Food[A <: Animal]{
    val products: String
    def feed(animal: A): String = s"${animal.name} eats ${products}"
  }

  case object Meat extends Food[Animal]{
    override val products: String = "meat"
  }

  case object Milk extends Food[Cat]{
    override val products: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override val products: String = "bread"
  }
}
