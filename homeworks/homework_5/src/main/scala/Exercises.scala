object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](val animals: List[T]) {
    def ++[U >: T <: Animal](others: Shelter[U]): Shelter[U] = Shelter(animals ++ others.animals)
    def +[U >: T <: Animal](other: U): Shelter[U] = Shelter(animals :+ other)
    def getNames: Seq[String] = animals.map(_.name)
    def feed(food: Food[T]): List[String] = animals.map(food.feed)
  }


  trait Food[-T <: Animal] {
    def feed(animal: T): String
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String = animal.name + " eats meat"
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String = animal.name + " eats milk"
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String = animal.name + " eats bread"
  }
}
