import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 30) == 225)
            assert(Exercises.sumOfDivBy3Or5(5, 50) == 590)
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(51) == Seq(3, 17))
            assert(Exercises.primeFactor(19) == Seq(19))
        }

        'test_sumScalars - {
            val leftVec0 = Exercises.Vector2D(1, 0)
            val leftVec1 = Exercises.Vector2D(0, 1)
            val rightVec0 = Exercises.Vector2D(-1, 0)
            val rightVec1 = Exercises.Vector2D(-1, 0)
            assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 1)
        }

        'test_sumScalars - {
            val leftVec0 = Exercises.Vector2D(1, 1)
            val leftVec1 = Exercises.Vector2D(2, 2)
            val rightVec0 = Exercises.Vector2D(-3, 1)
            val rightVec1 = Exercises.Vector2D(5, -3)
            assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == -14)
        }

        'test_sumCosines - {
            val leftVec0 = Exercises.Vector2D(1, 0)
            val leftVec1 = Exercises.Vector2D(0, 1)
            val rightVec0 = Exercises.Vector2D(-1, 0)
            val rightVec1 = Exercises.Vector2D(-1, 0)
            assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 1)
        }

        'test_sumCosines - {
            val leftVec0 = Exercises.Vector2D(1, 1)
            val leftVec1 = Exercises.Vector2D(2, 2)
            val rightVec0 = Exercises.Vector2D(-3, -3)
            val rightVec1 = Exercises.Vector2D(-5, -5)
            assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 2)
        }

        'test_sortByHeavyweight - {
            val balls: Map[String, (Int, Double)] =
                Map(
                    "Cola" -> (2, 2.5),
                    "Sprite" -> (3, 3.5),
                    "7up" -> (4, 4.5),
                    "Mirinda" -> (1, 1.5)
                )
            assert(Exercises.sortByHeavyweight(balls) == Seq("Mirinda", "Cola", "Sprite", "7up"))
        }

    }
}
