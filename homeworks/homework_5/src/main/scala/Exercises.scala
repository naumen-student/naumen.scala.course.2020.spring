object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter [+T <: Animal](list: List[T]) {

    def + [B >: T <: Animal](animal: B): Shelter[B] = Shelter(list :+ animal)

    def ++ [B >: T <: Animal](shelter: Shelter[B]): Shelter[B] = Shelter(list ++ shelter.list)

    def getNames: List[String] = list.map(_.name)

    def feed[B >: T <: Animal](food: Food[B]): List[String] = list.map(food.feed)

  }




  trait Food[-T <: Animal]  {
    def feed (animal: T): String = "%s eats %s".format(animal.name,this.toString)
  }


  case object Meat extends Food[Animal] {
    override def toString: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override def toString: String = "milk"
  }

  case object Bread extends Food[Dog]  {
    override def toString: String = "bread"
  }
}
