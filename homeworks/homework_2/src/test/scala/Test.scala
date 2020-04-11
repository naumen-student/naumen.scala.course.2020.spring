import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(-1, 1) == 0)
            assert(Exercises.sumOfDivBy3Or5(5, 6) == 11)
            assert(Exercises.sumOfDivBy3Or5(-5, 6) == 6)
            assert(Exercises.sumOfDivBy3Or5(-5, 1) == -8)
            assert(Exercises.sumOfDivBy3Or5(2147483645, 2147483647) == 4294967291L)
        }
        'primeFactor - {
            assert(Exercises.primeFactor(2) == Seq(2))
            assert(Exercises.primeFactor(25) == Seq(5))
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(30) == Seq(2, 3, 5))
        }

        'sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(0, 1), Exercises.Vector2D(1, 0),
                Exercises.Vector2D(0, -1), Exercises.Vector2D(-1, 0)) == 0)
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1),
                Exercises.Vector2D(-1, -1), Exercises.Vector2D(-1, -1)) == 4)
        }

        'sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(0, 1), Exercises.Vector2D(1, 0),
                Exercises.Vector2D(0, -1), Exercises.Vector2D(-1, 0)) == 0)
            assert(java.lang.Math.abs(Exercises.sumCosines(Exercises.Vector2D(1, 1), Exercises.Vector2D(1, 1),
                Exercises.Vector2D(-1, -1), Exercises.Vector2D(-1, -1)) - 2) < 0.0001)
        }

        'sortByHeavyweight - {
            val map_1: Map[String, (Int, Double)] =
              Map("a" -> (1, 2), "b" -> (2, 2))
            val map_2: Map[String, (Int, Double)] =
                Map("a" -> (1, 2), "b" -> (2, 2), "c" -> (1, 1))
            val map_3: Map[String, (Int, Double)] =
                Map("a" -> (1, 2), "c" -> (0, 1234), "b" -> (2, 2), "d" -> (11, 2))
            assert(Exercises.sortByHeavyweight(map_1) == Seq("a", "b"))
            assert(Exercises.sortByHeavyweight(map_2) == Seq("c", "a", "b"))
            assert(Exercises.sortByHeavyweight(map_3) == Seq("c", "a", "b", "d"))
        }
    }
}
