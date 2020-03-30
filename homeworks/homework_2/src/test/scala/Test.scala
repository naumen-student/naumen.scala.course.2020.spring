import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(1) == Seq())
        }

        'test_sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1), Exercises.Vector2D(2, 2), Exercises.Vector2D(1, 1)) == 6)
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0), Exercises.Vector2D(1, 1)) == 0)
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 1)) == 2)
        }

        'test_sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0)) == 2)
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 1), Exercises.Vector2D(1, 0)) == 0)
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 1)) == 1)
        }

        'test_sortByH - {
            assert(Exercises.sortByHeavyweight(Map("Aluminum"->(3, 2.6889), "Tungsten"->(2, 19.35), "Graphite"->(12, 2.1), "Iron"->(3, 7.874))) == Seq("Aluminum", "Tungsten", "Iron", "Graphite"))
            assert(Exercises.sortByHeavyweight(Map("Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45))) == Seq("Zirconium", "Chrome", "Cesium"))
            assert(Exercises.sortByHeavyweight(Map("Nickel" -> (2, 8.91), "Tin" -> (1, 7.29), "Platinum" -> (1, 21.45), "Plutonium" -> (3, 19.25))) == Seq("Tin", "Platinum", "Nickel", "Plutonium"))
        }
    }
}
