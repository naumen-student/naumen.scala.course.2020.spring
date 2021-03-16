import  utest._
import Exercises._

object Test extends  TestSuite {
  val tests: Tests = utest.Tests {
    'tests_sumOfDivBy3Or5 - {
      'OnlyPositiveNumbers - {
        assert(sumOfDivBy3Or5(0, 15) == 60)
        assert(sumOfDivBy3Or5(155, 364) == 25305)
      }
      'withNegativeNumbers - {
        assert(sumOfDivBy3Or5(-10, 15) == 27)
      }
      'OnlyNegativeNumbers - {
        assert(sumOfDivBy3Or5(-30, -11) == -192)
      }
      'oneNumberDividedBy3Or5 - {
        assert(sumOfDivBy3Or5(5, 5) == 5)
      }
      'oneNumberNotDividedBy3Or5 - {
        assert(sumOfDivBy3Or5(11,11) == 0)
      }
    }

    'tests_primeFactor - {
      'differentNumbers - {
        assert(primeFactor(80) == Seq(2, 5))
        assert(primeFactor(98) == Seq(2, 7))
        assert(primeFactor(325) == Seq(5, 13))
      }
      'onPrimeNumber - {
        assert(primeFactor(31)== Seq(31))
      }
    }

    'tests_symByFunc - {
      'tests_sumScalars - {
        assert(sumScalars(Vector2D(6, -5), Vector2D(32, 32), Vector2D(-20, 5), Vector2D(0, 1)) == 32 + 5)
        assert(sumScalars(Vector2D(0.25, 7), Vector2D(2.135, 7.1), Vector2D(-6.986, 0), Vector2D(-71.5, 132.3))
          == 40187.toDouble/800 + 499499.toDouble/1000)
      }
      'tests_sumCosines - {
        assert(sumCosines(Vector2D(5, 0), Vector2D(7, 8), Vector2D(-5, 10), Vector2D(-7, 3))
          == 0.6585046078685182 + 0.7633862853691146)
          assert(sumCosines(Vector2D(0.25, 7), Vector2D(2.135, 7.1), Vector2D(-6.986, 0), Vector2D(-71.5, 132.3))
          == 40187 * java.lang.Math.sqrt(1726002265)/1726002265 + 715 * java.lang.Math.sqrt(2261554)/2261554)
      }
    }

    'tests_SortByHeavyweight - {
      'onSourceMap - {
        val s = sortByHeavyweight()
        assert(sortByHeavyweight() == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium",
          "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt",
          "Cesium", "Calcium", "Lithium", "Magnesium", "Potassium", "Graphite"))
      }

      val firstPart =
        Map(
          "Aluminum" -> (3,   2.6889),
          "Gold" ->     (2,   19.32),
          "Lithium" ->  (12,  0.534),
          "Nickel" ->   (2,   8.91),
          "Lead" ->     (2,   11.336),
          "Chrome" ->   (3,   7.18)
        )

      val secondPart =
        Map(
          "Tungsten" ->  (2,   19.35),
          "Potassium" -> (14,  0.862),
          "Magnesium" -> (10,  1.738),
          "Tin" ->       (1,   7.29),
          "Titanium" ->  (2,   10.50),
          "Cesium" ->    (7,   1.873)
        )

      val thirdPart =
        Map(
          "Graphite" ->  (12,  2.1),
          "Calcium" ->   (8,   1.55),
          "Copper" ->    (3,   8.96),
          "Platinum" ->  (1,   21.45),
          "Silver" ->    (4,   4.505),
          "Zirconium" -> (3,   6.45)
        )

      val fourthPart =
        Map(
          "Iron" ->      (3,   7.874),
          "Cobalt" ->    (4,   8.90),
          "Sodium" ->    (5,   0.971),
          "Plutonium" -> (3,   19.25),
          "Uranium" ->   (2,   19.04)
        )

      'onPartOfSourceMap - {
        assert(sortByHeavyweight(firstPart) == Seq("Nickel", "Aluminum", "Lead", "Gold", "Chrome", "Lithium"))
        assert(sortByHeavyweight(secondPart) == Seq("Tin", "Titanium" ,"Tungsten", "Cesium", "Magnesium", "Potassium"))
        assert(sortByHeavyweight(thirdPart) == Seq("Platinum" ,"Zirconium", "Copper", "Silver", "Calcium", "Graphite"))
        assert(sortByHeavyweight(fourthPart) == Seq("Sodium", "Uranium", "Iron", "Plutonium", "Cobalt"))
      }
    }
  }
}
