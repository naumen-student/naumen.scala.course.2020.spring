import utest._

object Test extends TestSuite{

    val tests = Tests{
        val a = Exercises.primeFactor(80)

        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 10) == 30)
        }

        'primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }

        'sumScalars -{
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 2), Exercises.Vector2D(-3, 4), Exercises.Vector2D(5, 6), Exercises
              .Vector2D(-8, 9)) == 19.0)
            assert(Exercises.sumScalars(Exercises.Vector2D(-1, -2), Exercises.Vector2D(3, 4), Exercises.Vector2D(-5, -6),
                Exercises
              .Vector2D(8, 9)) == -105.0)
        }

        'sumCosines -{
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 1), Exercises.Vector2D(2, 2), Exercises.Vector2D(3, 3), Exercises
              .Vector2D(4, 4)) == 2.0)
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 1), Exercises.Vector2D(-2, 2), Exercises.Vector2D(3, 3), Exercises
              .Vector2D(4, 4)) == 1.0)
        }

        'sortByHeavyweight - {
            val sortedBalls = Exercises.sortByHeavyweight()
            assert(sortedBalls.head == "Tin")
            assert(sortedBalls.last == "Graphite")
            assert(sortedBalls.indexOf("Gold") < sortedBalls.indexOf("Tungsten"))
        }
    }
}
