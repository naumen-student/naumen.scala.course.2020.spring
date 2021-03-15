import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
            assert(Exercises.sumOfDivBy3Or5(1, 100) == 2418)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(3) == Seq(3))
            assert(Exercises.primeFactor(4) == Seq(2))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }

        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(2, 6), Vector2D(3, 4), Vector2D(10, 1), Vector2D(4, 13)) == 83)
            assert(Exercises.sumScalars(Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0), Vector2D(0, 0)) == 0)
            assert(Exercises.sumScalars(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1)) == 4)
            assert(Exercises.sumScalars(Vector2D(2, 6), Vector2D(3, 4), Vector2D(-2, -6), Vector2D(3, 4)) == 0)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Vector2D(-3, -4), Vector2D(3, 4), Vector2D(-3, -5), Vector2D(3, 5)) == -2)
            // this failed if cosBetween = scalar(vec0, vec1) / abs(vec0) / abs(vec1)
            assert(Exercises.sumCosines(Vector2D(0, 4), Vector2D(4, 0), Vector2D(-3, -5), Vector2D(3, 5)) == -1)
            assert(Exercises.sumCosines(Vector2D(0, 4), Vector2D(4, 0), Vector2D(-3, -5), Vector2D(3, 5)) == -1)
        }

        'test_sumCosines - {
            assert(Exercises.sortByHeavyweight(Map("1" -> (2, 3), "3" -> (5, 4), "2" -> (3, 3))) == Seq("1", "2", "3"))
            assert(Exercises.sortByHeavyweight() ==
              Seq(
                  "Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
                  "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium",
                  "Lithium", "Magnesium", "Potassium", "Graphite"
              )
            )
        }
    }
}
