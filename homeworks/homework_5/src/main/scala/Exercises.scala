object Exercises {
  sealed trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+A <: Animal](val animals: List[A]) {
    def +[B >: A <: Animal](newAnimal: B): Shelter[B] = Shelter[B](newAnimal :: animals)

    def ++[B >: A <: Animal](newAnimals : Shelter[B]): Shelter[B] = Shelter[B](newAnimals.animals ++ animals)

    def getNames(): List[String] = for (animal <- animals) yield animal.name

    def feed[B >: A <: Animal](food: Food[B]): List[String] = for (animal <- animals) yield food.feed(animal)
  }

  sealed trait Food[A <: Animal] {
    def feed[B <: A](animal: B): String = s"${animal.name} eats ${this.toString.toLowerCase}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}