import utest._
import Exercises.Vector2D

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 1) == 0)
            assert(Exercises.sumOfDivBy3Or5(-1, -1) == 0)
            assert(Exercises.sumOfDivBy3Or5(0, 4) == 3)
            assert(Exercises.sumOfDivBy3Or5(-4, 0) == -3)
            assert(Exercises.sumOfDivBy3Or5(4, 5) == 5)
            assert(Exercises.sumOfDivBy3Or5(13, 31) == 180)
            assert(Exercises.sumOfDivBy3Or5(-100000, 100000) == 0)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(3) == Seq(3))
            assert(Exercises.primeFactor(4) == Seq(2))
            assert(Exercises.primeFactor(6) == Seq(2, 3))
            assert(Exercises.primeFactor(31) == Seq(31))
            assert(Exercises.primeFactor(256) == Seq(2))
            assert(Exercises.primeFactor(9282) == Seq(2, 3, 7, 13, 17))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(0, 1), Vector2D(0, 2), Vector2D(0, 2), Vector2D(0, 2)) == 6)
            assert(Exercises.sumScalars(Vector2D(1, 0), Vector2D(0, 2), Vector2D(0, 1), Vector2D(0, 1)) == 1)
        }
        'test_sumCosines - {
            assert(Math.abs(Exercises.sumCosines(Exercises.Vector2D(-1, -1), Exercises.Vector2D(1, 1),
                Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 8)) - 0 ) < 1e-6 )
        }
        'test_sortByHeavyweight - {              
            assert(Exercises.sortByHeavyweight() == Seq(
                "Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium",
                "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium",
                "Cobalt", "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"
            ))
            var map = Map("Uranium" -> (2, 19.04), "Nickel" -> (2, 8.91), "Aluminum" -> (3, 2.6889))
            assert(Exercises.sortByHeavyweight(map) == Seq("Nickel", "Aluminum", "Uranium"))
        }
    }
}
