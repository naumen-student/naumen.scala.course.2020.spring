object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T] (animals: List[Animal]) {

    def +[TT <: Animal](animal: TT): Shelter[TT] = Shelter(animals :+ animal)
    def ++[TT >: Dog with Cat](others: Shelter[Animal]): Shelter[TT] = Shelter(animals ++ others.animals)
    def getNames: List[String] = animals.map(_.name)

    def feed[TT <: Animal](food: Food[TT]): List[String] = animals.map(food.feed)
  }



  trait Food [T] {
    def feed[TT <: Animal](animal: TT): String
  }

  case object Meat extends Food[Animal] {
    def feed[TT <: Animal](animal: TT): String = animal.name + " eats meat"
  }

  case object Milk extends Food[Cat] {
    def feed[TT <: Animal](cat: TT): String = cat.name + " eats milk"
  }

  case object Bread extends Food[Dog] {
    def feed[TT <: Animal](dog: TT): String = dog.name + " eats bread"
  }
}
