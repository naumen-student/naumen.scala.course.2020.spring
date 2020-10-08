import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(0, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(5, 12) == 42)
            assert(Exercises.sumOfDivBy3Or5(-6, 6) == 0)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(1) == Seq.empty)
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(5) == Seq(5))
            assert(Exercises.primeFactor(1984) == Seq(2, 31))
            assert(Exercises.primeFactor(510510) == Seq(2, 3, 5, 7, 11, 13, 17))
        }
        'test_Vector2D - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1)) == 2.0)
            assert(Exercises.sumScalars(Exercises.Vector2D(-2, -4), Exercises.Vector2D(6, 8), Exercises.Vector2D(-10, -12), Exercises.Vector2D(14, 16)) == 528.0)

            assert(Exercises.sumCosines(Exercises.Vector2D(1, 2), Exercises.Vector2D(-1, 2), Exercises.Vector2D(2, -3), Exercises.Vector2D(3, 1)) - 0.863117405 < 1e-9)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map.empty).isEmpty)
            assert(Exercises.sortByHeavyweight(Map("1" -> (1, 1), "2" -> (2,2), "3" -> (3,3))) == Seq("1", "2", "3"))

            val balls = Exercises.sortByHeavyweight()
            assert(balls.head == "Tin")
            assert(balls.last == "Graphite")
            assert(balls.indexOf("Nickel") <= balls.indexOf("Silver"))
        }
    }
}
