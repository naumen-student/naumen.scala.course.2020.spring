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
            assert(sumOfDivBy3Or5(1,3) == 3)
            assert(sumOfDivBy3Or5(-10,9) == -10)
            assert(sumOfDivBy3Or5(-42, 666) == 103514)
        }

        'test_primeFactor - {
            assert(primeFactor(42) == Seq(2, 3, 7))
            assert(primeFactor(666) == Seq(2, 3, 37))
            assert(primeFactor(13) == Seq(13))
        }

        'test_sumScalars - {
            assert(sumScalars(Vector2D(1, 2), Vector2D(3, 4), Vector2D(5, 6), Vector2D(7, 8)) == 94)
            assert(sumScalars(Vector2D(-5, 0), Vector2D(0, 6), Vector2D(42, 13), Vector2D(1, 25)) == 367.0)
            assert(sumScalars(Vector2D(-5, 1), Vector2D(2, 3), Vector2D(3, -6), Vector2D(-3, 15)) == -106.0)
        }

        'test_sumCosines - {
            assert(sumCosines(Vector2D(1, -1), Vector2D(2, -2), Vector2D(-1, 1), Vector2D(-2, 2)) == 1.9999999999999998)
            assert(sumCosines(Vector2D(-5, 0), Vector2D(0, 6), Vector2D(42, 13), Vector2D(1, 25)) == 0.33362836768039444)
            assert(sumCosines(Vector2D(1, 2), Vector2D(3, 4), Vector2D(5, 6), Vector2D(7, 8)) == 1.9835797185673898)
        }

        'test_sortByHeavyweight - {
            assert(
                sortByHeavyweight(Map("first" -> (1, 5), "second" -> (2, 6), "third" -> (55,42))) == Seq("first","second","third")
            )
            assert(
                sortByHeavyweight(Map("first" -> (2, 4.231), "second" -> (3, 4.231), "third" -> (4, 4.231))) == Seq("first", "second", "third")
            )
            assert(sortByHeavyweight(Map[String, (Int, Double)]()) == Seq[String]())
        }
    }
}
