import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
    }

    val firstTaskTests = Tests{
        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(5, 6) == 11)
            assert(Exercises.sumOfDivBy3Or5(1, 20) == 98)
            assert(Exercises.sumOfDivBy3Or5(33, 36) == 104)
        }
    }

    val secondTaskTests = Tests{
        'primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(30) == Seq(2, 3, 5))
        }
    }

    val thirdTaskTests = Tests{
        'sumByFunc - {
            assert(Exercises.sumScalars(Exercises.Vector2D(6, 2), Exercises.Vector2D(-3, 10), Exercises.Vector2D(2, 3), Exercises.Vector2D(2, 9)) == 33.0)
            assert(Exercises.sumScalars(Exercises.Vector2D(-6, 2), Exercises.Vector2D(5, 6), Exercises.Vector2D(2, -3), Exercises.Vector2D(7, 14)) == -46.0)
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 2), Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 1)) == 1.0)
        }

        'sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(2, -1), Exercises.Vector2D(3, 8), Exercises.Vector2D(0, 6), Exercises.Vector2D(-2, 4)) == 0.7897424064818731)
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 2), Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 1)) == 1.0)
            assert(Exercises.sumCosines(Exercises.Vector2D(-6, 2), Exercises.Vector2D(5, 6), Exercises.Vector2D(2, -3), Exercises.Vector2D(7, 14)) == -0.8605382869373461)
        }
    }

    val fourthTaskTests = Tests{
        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map("Graphite" -> (12, 2.1), "Iron" -> (3, 7.874))) == Seq("Iron", "Graphite"))
            assert(Exercises.sortByHeavyweight(Map("Aluminum" -> (3, 2.6889), "Tungsten" -> (2, 19.35), "Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873))) == Seq("Aluminum", "Tungsten", "Chrome", "Cesium"))
            assert(Exercises.sortByHeavyweight(Map("Gold" -> (2, 19.32), "Iron" -> (3, 7.874), "Tin" -> (1, 7.29))) == Seq("Tin", "Gold", "Iron"))
        }
    }
}
