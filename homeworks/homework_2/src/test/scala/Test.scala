import Exercises.{Vector2D, cosBetween, primeFactor, scalar, sumByFunc, sumOfDivBy3Or5, sortByHeavyweight}
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
    }

    val firstTests = Tests{
        'test_sumOfDivBy3Or5 - {
            assert(sumOfDivBy3Or5(1, 10) == 33)
            assert(sumOfDivBy3Or5(3, 70) == 1203)
            assert(sumOfDivBy3Or5(69, 150) == 4261)
        }
    }

    val secondTests = Tests{
        'test_primeFactor - {
            assert(primeFactor(30) == Seq(2, 3, 5))
            assert(primeFactor(81) == Seq(3))
            assert(primeFactor(159) == Seq(3, 53))
            assert(primeFactor(504) == Seq(2, 3, 7))
        }
    }

    val thirdTests = Tests{
        'test_sumByFunc - {
            assert(sumByFunc(Vector2D(3.1, 5.4), Vector2D(2.4, 1.3), scalar, Vector2D(-3.5, 6.7), Vector2D(-5, 3)) == 52.06)
            assert(sumByFunc(Vector2D(3.1, 5.4), Vector2D(2.4, 1.3), cosBetween, Vector2D(-3.5, 6.7), Vector2D(-5, 3)) == 1.703886371902637)
            assert(sumByFunc(Vector2D(-13.11, 25.42), Vector2D(22.4, 11.43), cosBetween, Vector2D(3.584, 62.911),
                Vector2D(-28.21, -10)) == -0.3915094026781605)
            assert(sumByFunc(Vector2D(-13.11, 25.42), Vector2D(22.4, 11.43), scalar, Vector2D(3.584, 62.911),
                Vector2D(-28.21, -10)) == -733.32804)

        }
    }

    val fourthTests = Tests{
        'test_sortByHeavyweight - {
            val balls1 = Map(
                "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874)
            )
            val balls2 = Map(
                "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
            )
            val balls3 = Map(
                "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)
            )
            assert(sortByHeavyweight(balls1) == Seq("Aluminum", "Tungsten", "Iron", "Graphite"))
            assert(sortByHeavyweight(balls2) == Seq("Sodium", "Copper", "Lithium", "Magnesium"))
            assert(sortByHeavyweight(balls3) == Seq("Zirconium", "Chrome", "Cesium"))
        }
    }
}
