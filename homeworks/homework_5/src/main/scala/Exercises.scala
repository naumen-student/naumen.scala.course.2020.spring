object Exercises {

  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+T <: Animal](val animals: List[T]) {

    def +[T1 >: T <: Animal](animal: T1): Shelter[T1] = Shelter(animals :+ animal)

    def ++[T1 >: T <: Animal](otherAnimals: Shelter[T1]): Shelter[T1] = Shelter(animals ++ otherAnimals.animals)

    def getNames: List[String] = animals.map(_.name)

    def feed(food: Food[T]): List[String] = animals.map(food.feed)
  }


  trait Food[-T <: Animal] {
    val food: String

    def feed(animal: T): String = s"${animal.name} eats ${food}"
  }


  case object Meat extends Food[Animal] {
    override val food: String = "meat"
  }


  case object Milk extends Food[Cat] {
    override val food: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override val food: String = "bread"
  }

}
