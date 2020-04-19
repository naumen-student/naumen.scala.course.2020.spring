object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter [+T <: Animal] (homeless :List [T] ){
    def getNames:Seq[String] = {
      for (animal <- homeless)  yield animal.name
    }

    def + [D >: T <: Animal] (poorThing: D): Shelter[D] = {
        new Shelter [D] (poorThing :: homeless)
    }

    def ++ [D >: T <: Animal](anotherShelter: Shelter[D]) : Shelter[D]={
      new Shelter [D] (anotherShelter.homeless ::: homeless)
    }

    def feed(food: Food[T]) : List[String] ={
      for (animal <- homeless) yield food.feed(animal)
    }

  }



  trait Food [-T<: Animal]{
    def name:String = this.getClass.getSimpleName.toLowerCase()
    def feed (animal:T) : String
  }

  case object Meat extends Food[Animal]{
    override def feed(animal: Animal): String = animal.name+" eats "+this.name.substring(0,name.length-1)
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String = animal.name+" eats "+this.name.substring(0,name.length-1)
  }

  case object Bread extends Food[Dog]{
    override def feed(animal: Dog): String = animal.name+" eats "+this.name.substring(0,name.length-1)
  }
}
