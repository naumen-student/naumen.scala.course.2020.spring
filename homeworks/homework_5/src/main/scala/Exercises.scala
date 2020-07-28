object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+T <: Animal](arg: List[T]){
    val animals: List[T] = arg

    def +[A >: T <: Animal](otherAnimal: A): Shelter[A] = Shelter(animals :+ otherAnimal)

    def ++[A >: T <: Animal](otherShelter: Shelter[A]): Shelter[A] = {
      Shelter(this.animals ::: otherShelter.animals)
    }

    def getNames: List[String] = animals.map(x => x.name)

    def feed[A >: T <: Animal](food: Food[A]): List[String] = {
      animals.map(food.feed)
    }
  }


  trait Food[T <: Animal] {
    def feed(animal: T): String = s"${animal.name} eats ${this.toString.toLowerCase()}"
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]
}
