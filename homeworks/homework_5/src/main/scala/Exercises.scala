object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](listOfAnimals: List[T]){
    def +[V >: T <: Animal](animal: V): Shelter[V] = Shelter(listOfAnimals :+ animal)

    def ++[V >: T <: Animal](shelter: Shelter[V]): Shelter[V] = Shelter(listOfAnimals ++ shelter.listOfAnimals)

    def getNames: List[String] = listOfAnimals.map(_.name)

    def feed(food: Food[T]): List[String] = listOfAnimals.map(food.feed)
  }



  trait Food[-T <: Animal] {
    def feed(animal: T) = s"${animal.name} eats"
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal) = s"${super.feed(animal)} meat"
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat) = s"${super.feed(animal)} milk"
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String = s"${super.feed(animal)} bread"
  }


}
