import Exercises.Vector2D
import utest._

object Test extends TestSuite{
    implicit class ExtendedDouble(val x: Double) {
        def ~=(y: Double): Boolean = (x - y).abs < 1e-10
    }

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 1) == 0)
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(3, 6) == 14)
            assert(Exercises.sumOfDivBy3Or5(3, 10) == 33)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(3) == Seq(3))
            assert(Exercises.primeFactor(4) == Seq(2))
            assert(Exercises.primeFactor(6) == Seq(2, 3))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(1, 2), Vector2D(3, 4), Vector2D(5, 6), Vector2D(7, 8)) ~= 94)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Vector2D(1, 2), Vector2D(3, 4), Vector2D(5, 6), Vector2D(7, 8)) ~= 1.9835797185)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map()) == Seq())
            assert(Exercises.sortByHeavyweight(Map("a" -> (1, 1))) == Seq("a"))
            assert(Exercises.sortByHeavyweight(Map("a" -> (1, 1), "b" -> (2, 1))) == Seq("a", "b"))
            assert(Exercises.sortByHeavyweight(Map("b" -> (2, 1), "a" -> (1, 1))) == Seq("a", "b"))
            assert(Exercises.sortByHeavyweight(Map("a" -> (1, 1), "b" -> (1, 2))) == Seq("a", "b"))
            assert(Exercises.sortByHeavyweight(Map("b" -> (1, 2), "a" -> (1, 1))) == Seq("a", "b"))
            assert(Exercises.sortByHeavyweight().take(3) == Seq("Tin", "Platinum", "Nickel"))
        }
    }
}
