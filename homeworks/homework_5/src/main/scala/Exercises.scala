object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[aT >: T <: Animal](addingAnimal: aT): Shelter[aT] =  Shelter(addingAnimal :: animals)

    def ++[aT >: T <: Animal](addingShelter: Shelter[aT]): Shelter[aT] = Shelter[aT](animals ::: addingShelter.animals)

    def getNames: List[String] = animals.map(_.name)

    def feed[aT >: T <: Animal](food: Food[aT]): List[String] = animals.map(food.feed)
  }



  trait Food[T <: Animal] {
    def feed(animal: T): String
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String = s"${animal.name} eats meat"
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String = s"${animal.name} eats milk"
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String = s"${animal.name} eats bread"
  }
}
