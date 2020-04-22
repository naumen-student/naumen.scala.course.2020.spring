object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+A <: Animal] (val animals: List[A]) {
    def +[B >: A <: Animal](animal: B): Shelter[B] = this.copy(animal :: animals)

    def ++[B >: A <: Animal](others: Shelter[B]): Shelter[B] = this.copy(animals ++ others.animals)

    def getNames: List[String] = animals.map(x => x.name)

    def feed[B >: A <: Animal](food: Food[B]): List[String] = animals.map(x => food.feed(x))
  }

  trait Food [A <: Animal] {
    def feed[B <: A](animal: B): String = s"${animal.name} eats ${this.toString.toLowerCase}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}
