object Exercises {

  trait Animal {
    val name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T1 <: Animal](val animals: List[T1]) {
    def +[T2 >: T1 <: Animal](animal: T2): Shelter[T2] = {
      Shelter(animal :: animals)
    }

    def ++[T2 >: T1 <: Animal](shelter: Shelter[T2]): Shelter[T2] = Shelter(animals ::: shelter.animals)

    def getNames: List[String] = animals.map(x => x.name)

    def feed[T2 >: T1 <: Animal](food: Food[T2]): List[String] = animals.map(x => food.feed(x))
  }

  trait Food[T <: Animal] {
    def feed(animal: T): String = s"${animal.name} eats ${this.toString}"
  }

  case object Meat extends Food[Animal] {
    override def toString: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override def toString: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override def toString: String = "bread"
  }

}
