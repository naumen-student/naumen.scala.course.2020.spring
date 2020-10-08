import Exercises.Vector2D
import utest._

object Test extends TestSuite {
  val precision = 0.000000001
  val balls1: Map[String, (Int, Double)] =
    Map(
      "Aluminum" -> (3, 2.6889), "Tungsten" -> (3, 19.35), "Graphite" -> (3, 2.1)
    )
  val balls2: Map[String, (Int, Double)] =
    Map(
      "Aluminum" -> (50, 2.6889), "Tungsten" -> (1, 19.35), "Graphite" -> (1, 2.1)
    )
  val balls3: Map[String, (Int, Double)] =
    Map(
      "Aluminum" -> (50, 1), "Tungsten" -> (50, 2), "Graphite" -> (50, 3)
    )
  val tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
      assert(Exercises.sumOfDivBy3Or5(-5, 5) == 0)

    }
    'test_primeFactor - {
      assert(Exercises.primeFactor(6) == Seq(2, 3))
      assert(Exercises.primeFactor(7) == Seq(7))
      assert(Exercises.primeFactor(1) == Seq())

    }
    'test_sumScalars - {
      assert(~=(Exercises.sumScalars(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 1), Vector2D(1, 0)), 0.0, precision))
      assert(~=(Exercises.sumScalars(Vector2D(0, 1), Vector2D(0, 1), Vector2D(0, 1), Vector2D(1, 0)), 1.0, precision))
      assert(~=(Exercises.sumScalars(Vector2D(0, 3), Vector2D(2, 1.5), Vector2D(0, 1), Vector2D(1, 0)), 9 / 2.0, precision))
    }
    'test_sumCosines - {
      assert(~=(Exercises.sumCosines(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 1), Vector2D(1, 0)), 0.0, precision))
      assert(~=(Exercises.sumCosines(Vector2D(0, 1), Vector2D(0, 1), Vector2D(0, 1), Vector2D(1, 0)), 1.0, precision))
      assert(~=(Exercises.sumCosines(Vector2D(1, 5.2), Vector2D(1, 0), Vector2D(1, 3), Vector2D(2.2, 1)), 0.18884739365012448 + 0.6804510993672778, precision))
    }
    'test_sortByHeavyweight - {
      assert(Exercises.sortByHeavyweight(balls1) == Seq("Graphite", "Aluminum", "Tungsten"))
      assert(Exercises.sortByHeavyweight(balls2) == Seq("Graphite", "Tungsten", "Aluminum"))
      assert(Exercises.sortByHeavyweight(balls3) == Seq("Aluminum", "Tungsten","Graphite"))

    }
  }

  def ~=(x: Double, y: Double, precision: Double) = {
    if ((x - y).abs < precision) true else false
  }


}
