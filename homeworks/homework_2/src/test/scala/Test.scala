import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
        }
        'primeFactor - {
            assert(Exercises.primeFactor(5) == Seq(5))
            assert(Exercises.primeFactor(20) == Seq(2,5))
            assert(Exercises.primeFactor(70) == Seq(2,5,7))
        }
        'sumScalars - {
            assert(Exercises.sumScalars(Vector2D(0, 1), Vector2D(1, 0), Vector2D(1, 1), Vector2D(1, 1)) == 2)
            assert(Exercises.sumScalars(Vector2D(1, 2), Vector2D(3, 4), Vector2D(5, 6), Vector2D(7, 8)) == 94)
            assert(Exercises.sumScalars(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1)) == 4)
        }
        'sumCosines - {
            assert(Math.abs(Exercises.sumCosines(Vector2D(0, 1), Vector2D(1, 0), Vector2D(1, 1), Vector2D(1, 1)) - 1) < 0.00001)
            assert(Math.abs(Exercises.sumCosines(Vector2D(1, 2), Vector2D(3, 4), Vector2D(5, 6), Vector2D(7, 8)) - 1.98357971857) < 0.00001)
            assert(Math.abs(Exercises.sumCosines(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1)) - 2) < 0.00001)
        }
        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map(
                "ball1" -> (0, 0), "ball2" -> (3, 4), "ball3" -> (1, 2), "ball4" -> (5, 6)
            )) == Seq("ball1", "ball3", "ball2", "ball4"))
            assert(Exercises.sortByHeavyweight(Map(
                "ball1" -> (9, 8), "ball2" -> (7, 6), "ball3" -> (5, 4), "ball4" -> (3, 2)
            )) == Seq("ball4", "ball3", "ball2", "ball1"))
            assert(Exercises.sortByHeavyweight(Map(
                "ball1" -> (1, 2.55), "ball2" -> (1, 1.005), "ball3" -> (5, 4.99), "ball4" -> (36, 28)
            )) == Seq("ball2", "ball1", "ball3", "ball4"))
        }
    }
}