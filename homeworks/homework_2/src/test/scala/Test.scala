import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            Exercises.sumOfDivBy3Or5(1, 3) ==> 3
            Exercises.sumOfDivBy3Or5(5, 9) ==> 20
            Exercises.sumOfDivBy3Or5(0, 100) ==> 2418
        }
        'test_primeFactor - {
            Exercises.primeFactor(80) ==> Seq(2, 5)
            Exercises.primeFactor(287) ==> Seq(7, 41)
            Exercises.primeFactor(7212) ==> Seq(2, 3, 601)
            Exercises.primeFactor(4967) ==> Seq(4967)
        }
        'test_sumScalars - {
            Exercises.sumScalars(Vector2D(1, 2), Vector2D(1, 2), Vector2D(1, 2), Vector2D(1, 2)) ==> 10
            Exercises.sumScalars(Vector2D(0,0), Vector2D(1,2), Vector2D(1,2), Vector2D(7,6)) ==> 19
            Exercises.sumScalars(Vector2D(-1, -2), Vector2D(1, 2), Vector2D(-1, 2), Vector2D(1, -2)) ==> -10
        }
//        'test_sumCosines - {
//            assert(Exercises.sumCosines() == ???)
//            assert(Exercises.sumCosines() == ???)
//            assert(Exercises.sumCosines() == ???)
//        }
        'test_getVolume - {
            assert(Exercises.getVolume(0) - 0 <= Double.MinPositiveValue)
            assert(Exercises.getVolume(2) - 33 <= Double.MinPositiveValue)
        }

        val balls: Map[String, (Int, Double)] =
            Map(
                "Aluminum" -> (3, 2.6889), "Tungsten" -> (2, 19.35), "Graphite" -> (12, 2.1), "Iron" -> (3, 7.874),
                "Gold" -> (2, 19.32), "Potassium" -> (14, 0.862), "Calcium" -> (8, 1.55), "Cobalt" -> (4, 8.90),
                "Lithium" -> (12, 0.534), "Magnesium" -> (10, 1.738), "Copper" -> (3, 8.96), "Sodium" -> (5, 0.971),
                "Nickel" -> (2, 8.91), "Tin" ->  (1, 7.29), "Platinum" -> (1, 21.45), "Plutonium" -> (3, 19.25),
                "Lead" ->  (2, 11.336), "Titanium" -> (2, 10.50), "Silver" -> (4, 4.505), "Uranium" -> (2, 19.04),
                "Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45)
            )
        'test_getMass - {
            val mass = balls map {case (key, value) => (key, Exercises.getMass(value))}
            val result: Map[String, Double] =
                Map(
                    "Magnesium" -> 5460.08803193906, "Cobalt" -> 1789.4511754847463, "Plutonium" -> 1632.8427817032948,
                    "Potassium" -> 7430.897068130239, "Gold" -> 485.5645605388384, "Silver" -> 905.7839938830091,
                    "Tin" -> 22.902210444669592, "Zirconium" -> 547.1083606226624, "Tungsten" -> 486.3185427757,
                    "Nickel" -> 223.93272434788045, "Graphite" -> 11400.211421346641, "Chrome" -> 609.0291518249172,
                    "Lithium" -> 2898.910904285289, "Iron" -> 667.8963149678827, "Copper" -> 760.0140947564428,
                    "Sodium" -> 381.3108083294611, "Calcium" -> 2493.16792988886, "Uranium" -> 478.52739299479725,
                    "Cesium" -> 2018.2816427795733, "Platinum" -> 67.38716241950107, "Titanium" -> 263.89378290154264,
                    "Aluminum" -> 228.08056912841502, "Lead" -> 284.9047545687512)
            mass ==> result

        }
        'test_sortByHeavyweight - {
            val result: Seq[String] = Seq(
                "Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
                "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium", "Lithium",
                "Magnesium", "Potassium", "Graphite"
            )
            assert(Exercises.sortByHeavyweight(balls) == result)
        }
    }
}
