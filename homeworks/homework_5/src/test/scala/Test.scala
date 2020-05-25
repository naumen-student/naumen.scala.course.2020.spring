import Exercises._
import utest._

object Test extends TestSuite {

  val tests = Tests {

    //Test task 1

    val catShelter = Shelter(List(Cat("Garfield")))

    val dogShelter = Shelter(List(Dog("Goofy")))

    val animalShelter = catShelter ++ dogShelter

    val oneMoreAnimalShelter = animalShelter + Cat("Kuzya")

    assert(oneMoreAnimalShelter.getNames.toSet == Set("Garfield", "Goofy", "Kuzya"))

    val yetAgainAnimalShelter = catShelter + Dog("Barbos")

    assert(yetAgainAnimalShelter.getNames.toSet == Set("Garfield", "Barbos"))

    val oneMoreDogShelter = dogShelter + Dog("Barbos")

    assert(oneMoreDogShelter.getNames.toSet == Set("Goofy", "Barbos"))

    //Test task 2

    val r1 = catShelter.feed(Meat)

    assert(r1.toSet == Set("Garfield eats meat"))

    val r2 = catShelter.feed(Milk)

    assert(r2.toSet == Set("Garfield eats milk"))

    val r3 = dogShelter.feed(Meat)

    assert(r3.toSet == Set("Goofy eats meat"))

    val r4 = dogShelter.feed(Bread)

    assert(r4.toSet == Set("Goofy eats bread"))

    val r5 = oneMoreAnimalShelter.feed(Meat)

    //Shelter(List(Cat("Garfield"), Dog("Goofy"))).feed(Milk)
    //Milk.feed(Dog("Goofy"))
    assert(
      r5.toSet == Set(
        "Garfield eats meat",
        "Goofy eats meat",
        "Kuzya eats meat"
      )
    )

  }

}
