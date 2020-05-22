object Exercises {

  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal](animal: A): Shelter[A] = {
      Shelter[A](animal :: animals)
    }

    def ++[A >: T <: Animal](shelter: Shelter[A]): Shelter[A] = {
      Shelter[A](animals ++ shelter.animals)
    }

    def getNames: Seq[String] = animals.map(_.name)
    def feed[A >: T <: Animal](food: Food[A]): List[String] = {
      animals.map(food.feed(_))
    }
  }

  trait Food[T <: Animal] {
    val name: String
    def feed(animal: T): String = {
      s"${animal.name} eats $name"
    }
  }

  case object Meat extends Food[Animal] {
    override val name = "meat"
  }

  case object Milk extends Food[Cat] {
    override val name = "milk"
  }

  case object Bread extends Food[Dog] {
    override val name = "bread"
  }
}
