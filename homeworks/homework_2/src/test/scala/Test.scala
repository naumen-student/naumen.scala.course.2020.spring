import utest._


object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(10, 64) == 910)
            assert(Exercises.sumOfDivBy3Or5(-4, 4) == 0)
            assert(Exercises.sumOfDivBy3Or5(5, 5) == 5)
            assert(Exercises.sumOfDivBy3Or5(1, 150) == 5325)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(60) == Seq(2, 3, 5))
            assert(Exercises.primeFactor(100) == Seq(2, 5))
            assert(Exercises.primeFactor(1) == Seq(1))
            assert(Exercises.primeFactor(3) == Seq(3))
            assert(Exercises.primeFactor(10) == Seq(2, 5))
            assert(Exercises.primeFactor(5123) == Seq(47, 109))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1), Exercises.Vector2D(2, 2), Exercises.Vector2D(2, 2)) == 10)
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(0, 0), Exercises.Vector2D(0, 0), Exercises.Vector2D(1, 1)) == 0)
            assert(Exercises.sumScalars(Exercises.Vector2D(38, 5), Exercises.Vector2D(16, 9), Exercises.Vector2D(2, 28), Exercises.Vector2D(32, 2)) == 773)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(5, 5), Exercises.Vector2D(6, 6), Exercises.Vector2D(10, 10), Exercises.Vector2D(2, 2)) == 2)
            assert(math.round(Exercises.sumCosines(Exercises.Vector2D(-5, 5), Exercises.Vector2D(5, -5), Exercises.Vector2D(5, -5), Exercises.Vector2D(-5, 5))) == -2)

        }
        'test_sortByHeavyweigth - {
            assert(Exercises.sortByHeavyweight(Map.empty) == Seq.empty)
            assert(Exercises.sortByHeavyweight(Map("X" -> (5, 3), "Y" -> (6, 3), "Z" -> (7, 3))) == Seq("X", "Y", "Z"))
            assert(Exercises.sortByHeavyweight(Map("Y" -> (6, 3), "X" -> (5, 3), "Z" -> (7, 3))) == Seq("X", "Y", "Z"))
            assert(Exercises.sortByHeavyweight(Map("Z" -> (7, 3), "X" -> (5, 3), "Y" -> (6, 3))) == Seq("X", "Y", "Z"))
            assert(Exercises.sortByHeavyweight(Map("X" -> (7, 3), "Y" -> (5, 3), "Z" -> (6, 3))) == Seq("Y", "Z", "X"))
            assert(Exercises.sortByHeavyweight(Map("X" -> (3, 5.1), "Y" -> (3, 5.2), "Z" -> (3, 5))) == Seq("Z", "X", "Y"))
            assert(Exercises.sortByHeavyweight() == Seq("Tin", "Platinum", "Nickel",
                "Aluminum", "Titanium", "Lead", "Sodium",
                "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver",
                "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
        }
    }
}
