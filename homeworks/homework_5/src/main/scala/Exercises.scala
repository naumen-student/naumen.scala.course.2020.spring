import scala.collection.mutable.ListBuffer

object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T])
  {
    def +[A >: T <: Animal](addingAnimal: A): Shelter[A] = {
      val result: Shelter[A] = new Shelter[A](animals ++ List(addingAnimal))
      result
    }

    def ++[A >: T <: Animal](addingShelter: Shelter[A]): Shelter[A] = {
      val result: Shelter[A] = new Shelter[A](this.animals ++ addingShelter.animals)
      result
    }

    def getNames: List[String] = {
      val result: ListBuffer[String] = new ListBuffer()
      for (currentAnimal <- animals) {
        result += currentAnimal.name
      }
      result.toList
    }

    def feed[A >: T <: Animal](food: Food[A]): List[String] = animals.map(food.feed)
  }



  trait Food[-T <: Animal] {
    val food: String
    def feed(animal: T): String = s"${animal.name} eats ${food}"
  }

  case object Meat extends Food[Animal]{
    override val food = "meat"
  }

  case object Milk extends Food[Cat] {
    override val food = "milk"
  }

  case object Bread extends Food[Dog] {
    override val food = "bread"
  }
}
