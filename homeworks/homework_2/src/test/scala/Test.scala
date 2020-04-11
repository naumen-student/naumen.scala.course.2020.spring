import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
    }

    val tests1 = Tests{
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
            assert(Exercises.sumOfDivBy3Or5(-3, 3) == 0)
        }
    }

    val tests2 = Tests{
        'test_primeFactor - {
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(15) == Seq(3, 5))
            assert(Exercises.primeFactor(7) == Seq(7))
        }
    }

    val tests3 = Tests{
        'test_sumByFunc - {
            assert(Exercises.sumByFunc(Vector2D(0, 0), Vector2D(1, 1), Exercises.scalar, Vector2D(0, 0), Vector2D(1, 1)) == 0)
            assert(Exercises.sumByFunc(Vector2D(1, 1), Vector2D(1, 1), Exercises.scalar, Vector2D(1, 1), Vector2D(1, 1)) == 4)
            assert(Exercises.sumByFunc(Vector2D(1, 0), Vector2D(0, 1), Exercises.cosBetween, Vector2D(1,0), Vector2D(0, 1)) == 0)
            assert(Exercises.sumByFunc(Vector2D(1, 1), Vector2D(1, 0), Exercises.cosBetween, Vector2D(-1, -1), Vector2D(1, 0)) == 0)
        }
    }

    val tests4 = Tests{
        'test_sortByHeavyweight - {
            val balls1: Map[String, (Int, Double)] =
                Map(
                    "B" -> (2, 1), "A" ->  (1, 1), "C" ->  (3,  1),   "D" ->  (4, 1),
                )
            assert(Exercises.sortByHeavyweight(balls1) == Seq("A", "B", "C", "D"))
            val balls2: Map[String, (Int, Double)] =
                Map(
                    "B" -> (1, 2), "A" ->  (1, 1), "C" ->  (1,  3),   "D" ->  (1, 4),
                )
            assert(Exercises.sortByHeavyweight(balls2) == Seq("A", "B", "C", "D"))
            val balls3: Map[String, (Int, Double)] =
                Map(
                    "B" -> (4, 2.5), "A" ->  (5, 1), "C" ->  (7,  0.5),   "D" ->  (1, 4),
                )
            assert(Exercises.sortByHeavyweight(balls3) == Seq("D", "A", "B", "C"))
            val balls4: Map[String, (Int, Double)] =
                Map(
                    "B" -> (1, 1), "A" ->  (1, 1), "C" ->  (1,  1),   "D" ->  (1, 1),
                )
            assert(Exercises.sortByHeavyweight(balls4) == Seq("B", "A", "C", "D"))
        }
    }
}
