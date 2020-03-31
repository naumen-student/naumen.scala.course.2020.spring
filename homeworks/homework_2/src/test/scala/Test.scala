import utest._
import Exercises.Vector2D

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 2) == 0)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(5, 5) == 5)
            assert(Exercises.sumOfDivBy3Or5(1, 15) == 60)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(1024) == Seq(2))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1), Vector2D(1, 1)) == 4)
            assert(Exercises.sumScalars(Vector2D(1, 3), Vector2D(2, 4), Vector2D(0, 0), Vector2D(0, 0)) == 14)
            assert(Exercises.sumScalars(Vector2D(1, 3), Vector2D(2, 4), Vector2D(-5, 7), Vector2D(6, -8)) == -72)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Vector2D(2, 0), Vector2D(3, 0), Vector2D(2, 3), Vector2D(4, 5)) == 1.996240588195683)
        }
        'test_sortByHeavyweight {
            assert(Exercises.sortByHeavyweight(Map()) == Seq())
            assert(Exercises.sortByHeavyweight(Map("b1" -> (1, 2))) == Seq("b1"))
            assert(Exercises.sortByHeavyweight(Map("b1" -> (1, 2), "b2" -> (1, 2))) == Seq("b1", "b2"))
            assert(Exercises.sortByHeavyweight(Map(
                "Iron" -> (3, 7.874),
                "Gold" -> (4, 3.5),
                "Cesium" -> (7, 1.873),
                "Zirconium" -> (3, 6.45)
            )) == Seq("Zirconium", "Iron", "Gold", "Cesium"))
        }
    }
}
