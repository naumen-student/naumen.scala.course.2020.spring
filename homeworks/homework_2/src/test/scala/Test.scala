import Exercises._
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(sumOfDivBy3Or5(0, 2) == 0)
            assert(sumOfDivBy3Or5(1, 3) == 3)
            assert(sumOfDivBy3Or5(5, 9) == 20)
            assert(sumOfDivBy3Or5(1, 10) == 33)
        }
        'test_primeFactor - {
            assert(primeFactor(1) == Seq.empty)
            assert(primeFactor(7) == Seq(7))
            assert(primeFactor(80) == Seq(2, 5))
            assert(primeFactor(2020) == Seq(2, 5, 101))
        }
        'test_sumScalars - {
            assert(sumScalars(Vector2D(1, 2), Vector2D(-1, 2), Vector2D(2, -3), Vector2D(3, 1)) == 6)
        }
        'test_sumCosines - {
            assert(sumCosines(Vector2D(1, 2), Vector2D(-1, 2), Vector2D(2, -3), Vector2D(3, 1)) - 0.863117405 < 1e-9)
        }
        'test_sortByHeavyweight - {
            assert(sortByHeavyweight(Map.empty).isEmpty)
            assert(sortByHeavyweight(Map("" -> (0, 0))) == Seq(""))
            assert(sortByHeavyweight(Map("z" -> (1, 3), "y" -> (1, 2), "x" -> (1, 1))) == Seq("x", "y", "z"))
            assert(sortByHeavyweight(Map("y" -> (2, 1), "z" -> (3, 1), "x" -> (1, 1))) == Seq("x", "y", "z"))
            assert(sortByHeavyweight(Map("z" -> (3, 1), "x" -> (2, 2), "y" -> (2, 3))) == Seq("x", "y", "z"))
            assert(sortByHeavyweight().take(5) == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium"))
        }
    }
}
