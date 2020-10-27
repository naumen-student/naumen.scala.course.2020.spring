object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[P >: T <: Animal](newAnimal: P): Shelter[P] =
      this.copy(newAnimal :: animals)

    def ++[P >: T <: Animal](shelter: Shelter[P]): Shelter[P] =
      this.copy(animals ++ shelter.animals)

    def getNames: List[String] =
      animals.map(_.name)
    
    def feed[P >: T <: Animal](food: Food[P]): List[String] =
      animals.map(food.feed(_))
  }



  trait Food [T <: Animal] {
    def feed[P <: T](animal: P): String = 
      s"${animal.name} eats ${this.toString.toLowerCase()}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}
