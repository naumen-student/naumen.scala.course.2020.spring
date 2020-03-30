import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == 2418)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(7) == Seq(7))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
        }

        'test_sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1), Exercises.Vector2D(2, 2), Exercises.Vector2D(2, 2)) == 10)
            assert(Exercises.sumScalars(Exercises.Vector2D(2, 2), Exercises.Vector2D(2, 2), Exercises.Vector2D(2, 2), Exercises.Vector2D(2, 2)) == 16)
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0)) == 2)
        }

        'test_sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0)) == 2)
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 2), Exercises.Vector2D(1, 2), Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 1)) == 1)
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(-2, 0), Exercises.Vector2D(1, 0)) == 0)
        }

        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map("Aluminum"->(3, 2.6889), "Tungsten"->(2, 19.35), "Graphite"->(12, 2.1), "Iron"->(3, 7.874))) == Seq("Aluminum", "Tungsten", "Iron", "Graphite"))
            assert(Exercises.sortByHeavyweight(Map("Lead"->(2, 11.336), "Titanium"->(2, 10.50), "Silver"->(4, 4.505), "Uranium"->(2, 19.04))) == Seq("Titanium", "Lead", "Uranium", "Silver"))
            assert(Exercises.sortByHeavyweight(Map("Gold"->(2, 19.32), "Potassium"->(14, 0.862), "Calcium"->(8, 1.55), "Cobalt"->(4, 8.90))) == Seq("Gold", "Cobalt", "Calcium", "Potassium"))
        }
    }
}
