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
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 3 + 5 + 6 + 9 + 10)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(0, 1), Vector2D(1, 0), Vector2D(2, 6), Vector2D(-1, 2)) == 10)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Vector2D(0, 1), Vector2D(1, 0), Vector2D(2, 6), Vector2D(-1, 2)) - 0.7072 < 0.0001)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map("A" -> (1, 1), "B" -> (2, 4), "C" -> (2, 1))) == Seq("A", "C", "B"))
            assert(Exercises.sortByHeavyweight().take(1) == Seq("Tin"))
        }
    }
}
