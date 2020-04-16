object Exercises {

    sealed trait Animal {
        def name: String
    }

    case class Cat(override val name: String) extends Animal

    case class Dog(override val name: String) extends Animal

    case class Shelter[+A <: Animal](animals: List[A]) {
        def +[B >: A <: Animal](otherAnimal: B): Shelter[B] = Shelter(animals :+ otherAnimal)
        def ++[B >: A <: Animal](otherShelter: Shelter[B]): Shelter[B] = Shelter(animals ++ otherShelter.animals)
        def getNames: Seq[String] = animals.map(_.name)
        def feed[B >: A <: Animal](food: Food[B]): Seq[String] = animals.map(food.feed)
    }

    sealed trait Food[A <: Animal] {
        def feed(animal: A): String = s"${animal.name} eats ${this.toString.toLowerCase}"
    }

    case object Meat extends Food[Animal]

    case object Milk extends Food[Cat]

    case object Bread extends Food[Dog]
}
