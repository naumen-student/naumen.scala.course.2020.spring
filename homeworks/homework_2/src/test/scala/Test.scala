import utest._

object Test extends TestSuite{

    val tests = Tests {
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDiv30r5 - {
            assert(Exercises.sumOfDivBy3Or5(1,8) == 14 )
            assert(Exercises.sumOfDivBy3Or5(1,3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5,10) == 30)
        }

        'test_PrimeFactor - {
            assert(Exercises.primeFactor(10) == Seq(1,2,5))
            assert(Exercises.primeFactor(80) == Seq(1,2,2,2,2,5))
        }

        'test_SumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(4, -3), Exercises.Vector2D(5, -2), Exercises.Vector2D(4,4),Exercises.Vector2D(5,8)) == 78)
            assert(Exercises.sumScalars(Exercises.Vector2D(9, -5), Exercises.Vector2D(-3, 14), Exercises.Vector2D(7, 7), Exercises.Vector2D(-5, -5) ) == -167)
        }

        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight().take(5) == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium"))
        }

    }
}
