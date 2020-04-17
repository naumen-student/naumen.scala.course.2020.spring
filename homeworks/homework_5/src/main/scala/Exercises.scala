object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T <: Animal] (val animals: List[T]) {
    def + [B >: T <: Animal](new_animal: B): Shelter[B]           = Shelter(new_animal :: animals)
    def ++[B >: T <: Animal](new_animals: Shelter[B]): Shelter[B] = Shelter(animals ++ new_animals.animals)
    def getNames() : List[String]                                 = for (animal <- animals) yield animal.name
    def feed(food : Food[T]) : List[String]                       = for (animal <- animals) yield food.feed(animal)
  }

  trait Food[-T <: Animal] {
    def feed(animal: T) : String
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
