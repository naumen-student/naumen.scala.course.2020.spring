object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal


  case class Shelter[+A <: Animal](pets: List[A]) {
    def +[P >: A <: Animal](pet: P): Shelter[P] = {
      Shelter[P](pet :: pets)
    }

    def ++[P >: A <: Animal](another: Shelter[P]): Shelter[P] = {
      Shelter(pets ++ another.pets)
    }

    def getNames: Seq[String] = pets.map(e => e.name)

    def feed(food: Food[A]): Seq[String] = {
      pets.map(pet => food.feed(pet))
    }
  }


  trait Food [-A <: Animal] {
    def feed(animal: A): String
  }

  case object Meat extends Food[Animal] {
    override def toString: String = "meat"

    override def feed(animal: Animal): String = s"${animal.name} eats ${toString}"
  }

  case object Milk extends Food[Cat] {
    override def toString: String = "milk"

    override def feed(animal: Cat): String = s"${animal.name} eats ${toString}"
  }

  case object Bread extends Food[Dog] {
    override def toString: String = "bread"

    override def feed(animal: Dog): String = s"${animal.name} eats ${toString}"
  }
}
