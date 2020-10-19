import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == Seq(3).sum)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == Seq(5,6,9).sum)
            assert(Exercises.sumOfDivBy3Or5(0, 100) == Seq(0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25, 27, 30, 33, 35, 36, 39, 40, 42, 45, 48, 50, 51, 54, 55, 57, 60, 63, 65, 66, 69, 70, 72, 75, 78, 80, 81, 84, 85, 87, 90, 93, 95, 96, 99, 100).sum)
        }
        'test_primeFactor - {
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(80) == Seq(2,5))
            assert(Exercises.primeFactor(98) == Seq(2,7))
            assert(Exercises.primeFactor(134) == Seq(2, 67))
        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(2, 1), Exercises.Vector2D(2, 1)) == 6)
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 2), Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 1)) == 1)
        }
        'test_sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(1, 0), Exercises.Vector2D(-1, 0), Exercises.Vector2D(2, 0)) == 0)
            assert(Exercises.sumCosines(Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 2), Exercises.Vector2D(0, 2), Exercises.Vector2D(0, 2)) == 2)
            assert(Exercises.sumCosines(Exercises.Vector2D(1, 0), Exercises.Vector2D(0, 2), Exercises.Vector2D(0, 1), Exercises.Vector2D(0, 1)) == 1)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Map("Iron" -> (3, 7.874), "Gold" -> (4, 3.5), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45))) == Seq("Zirconium", "Iron", "Gold", "Cesium"))
            assert(Exercises.sortByHeavyweight(Map("Tin" -> (1, 7.29), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45), "Nickel" -> (2, 8.91), "Calcium" -> (8, 1.55), "Plutonium" -> (3, 19.25))) == Seq("Tin", "Nickel", "Zirconium", "Plutonium", "Cesium", "Calcium"))
            assert(Exercises.sortByHeavyweight(Map("Uranium" -> (2, 19.04), "Silver" -> (4, 4.505), "Zirconium" -> (3, 6.45), "Nickel" -> (2, 8.91), "Potassium" -> (14, 0.862), "Aluminum" -> (3, 2.6889), "Chrome" -> (3, 7.18))) == Seq("Nickel", "Aluminum", "Uranium", "Zirconium", "Chrome", "Silver", "Potassium"))
        }
    }
}
