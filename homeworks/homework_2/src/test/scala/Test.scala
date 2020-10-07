import Exercises._
import utest._

object Test extends TestSuite {
  implicit class doubleEqOps(x: Double) {
    def ~=(y: Double): Boolean = math.abs(x - y) < 0.00001
  }
  val tests = Tests {
    'test_divBy3Or7 - {
      assert(divBy3Or7(1, 3) == Seq(3))
      assert(divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(
        divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28,
          30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69,
          70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99)
      )
    }
    'test_sumOfDivBy3Or5 - {
      assert(sumOfDivBy3Or5(1, 6) == 14)
      assert(sumOfDivBy3Or5(-6, 6) == 0)
      assert(sumOfDivBy3Or5(6, 6) == 6)
      assert(sumOfDivBy3Or5(1, 100) == 2418)
    }
    'test_primeFactor - {
      assert(primeFactor(80) == Seq(2, 5))
      assert(primeFactor(98) == Seq(2, 7))
      assert(primeFactor(1) == Seq(1))
      assert(primeFactor(3) == Seq(3))
      assert(primeFactor(10) == Seq(2, 5))
      assert(primeFactor(10) == Seq(2, 5))
    }
    'test_sumScalar - {
      assert(sumScalars(1 ->> 2, 3 ->> 4, 5 ->> 6, 7 ->> 8) == 94)
      assert(sumScalars(1 ->> 0, 0 ->> 4, 5 ->> 6, 0 ->> 0) == 0)
      assert(sumScalars(1 ->> 1, 0 ->> 4, 5 ->> 6, 0 ->> 1) == 10)
      assert(sumScalars(0 ->> 0, 0 ->> 0, 0 ->> 0, 0 ->> 0) == 0)
    }

    'test_sumCosines - {
      assert(sumCosines(4 ->> 3, 3 ->> 4, 5 ->> 12, 12 ->> 5) ~= 1.670059)
      assert(sumCosines(1 ->> 0, 0 ->> 4, 3 ->> 4, 9 ->> 0) ~= 0.6)
      assert(sumCosines(1 ->> 3, 1 ->> 3, 0 ->> 4, 9 ->> 0) ~= 1)
    }

    'test_balls - {
      assert(
        sortByHeavyweight(Map.empty[String, (Int, Double)]) == Seq.empty[String]
      )
      assert(
        sortByHeavyweight(Map("A" -> (1 -> 2), "B" -> (3 -> 4))) == Seq("A","B")
      )
      assert(
        sortByHeavyweight(Map("A" -> (2 -> 2), "B" -> (3 -> 2), "C" -> (4 -> 2))) == Seq("A", "B", "C")
      )
      assert(
        sortByHeavyweight(Map("A" -> (6 -> 2), "B" -> (4 -> 2), "C" -> (2 -> 4))) == Seq("C", "B", "A")
      )
    }
  }

}
