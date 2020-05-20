object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+A <: Animal](animals: List[A]){
    def +[T >: A <: Animal](animal: T): Shelter[T] = Shelter(animals :+ animal)
    def ++[T >: A <: Animal](shelter: Shelter[T]): Shelter[T] = Shelter(animals ++ shelter.animals)
    def getNames: List[String] = animals.map(_.name)
    def feed[T >: A <: Animal](food: Food[T]): List[String] = animals.map(food.feed(_))
  }


  trait Food[A <: Animal]{
    def feed(animal: A): String = s"${animal.name} eats ${this.toString.toLowerCase}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}
