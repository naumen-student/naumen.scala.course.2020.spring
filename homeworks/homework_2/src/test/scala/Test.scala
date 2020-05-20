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
            assert(Exercises.sumOfDivBy3Or5(-10, -1) == -33)
            assert(Exercises.sumOfDivBy3Or5(-1, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(5, 15) == 57)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(90) == Seq(2,3,5))
            assert(Exercises.primeFactor(80) == Seq(2,5))
            assert(Exercises.primeFactor(590) == Seq(2,5,59))
        }
        'sumScalars - {
            assert(Exercises.sumScalars(Vector2D(1,5),Vector2D(0,0), Vector2D(3,10),Vector2D(2,1))==16)
            assert(Exercises.sumScalars(Vector2D(1,5),Vector2D(0,0), Vector2D(3,10),Vector2D(0,0))==0)
            assert(Exercises.sumScalars(Vector2D(3,4),Vector2D(-9,-8), Vector2D(-1,1),Vector2D(3,-4))== -66)
        }

        'sumCosines - {
            assert(Exercises.sumCosines(Vector2D(3,4),Vector2D(4,3), Vector2D(3.6,4.8),Vector2D(2.7,3.2)) == 1.9583557503321822)
            assert(Exercises.sumCosines(Vector2D(18,24),Vector2D(9,12), Vector2D(6,4),Vector2D(-1,-2)) == 0.1317568578755408)
            assert(Exercises.sumCosines(Vector2D(0,7),Vector2D(10,5), Vector2D(9,8),Vector2D(4,5)) == 1.4328974952417874)
        }

        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(
                Map(
                    "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874)
                )
            ) == Seq ("Aluminum", "Tungsten", "Iron", "Graphite"))

            assert(Exercises.sortByHeavyweight(
                Map(
                    "Aluminum" -> (3,   2.6889)
                )
            ) == Seq ("Aluminum"))

            assert(Exercises.sortByHeavyweight(
                Map(
                    "Tungsten" ->  (2,   19.35), "Gold" ->     (2,   19.32), "Nickel" ->   (2,   8.91),
                    "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Uranium" ->   (2,   19.04)
                )
            ) == Seq ("Nickel","Titanium","Lead","Uranium", "Gold","Tungsten"))
        }

    }
}