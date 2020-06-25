import Exercises._
import utest._

object Test extends TestSuite {
  val tests = Tests {
    'test_divBy3Or7 - {
      assert(divBy3Or7(1, 3) == Seq(3))
      assert(divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }

    'test_sumOfDivBy3Or5 - {
      assert(sumOfDivBy3Or5(2, 6) == 14)
      assert(sumOfDivBy3Or5(-6, 6) == 0)
      assert(sumOfDivBy3Or5(6, 1) == 0)
      assert(sumOfDivBy3Or5(3, 3) == 3)
      assert(sumOfDivBy3Or5(1, 100) == 2418)
    }

    'test_primeFactor - {
      assert(primeFactor(1) == Seq.empty)
      assert(primeFactor(30) == Seq(2, 3, 5))
      assert(primeFactor(81) == Seq(3))
      assert(primeFactor(100) == Seq(2, 5))
      assert(primeFactor(159) == Seq(3, 53))
      assert(primeFactor(173) == Seq(173))
      assert(primeFactor(504) == Seq(2, 3, 7))
      assert(primeFactor(1024) == Seq(2))
    }

    'test_sumByFunc - {
      assert(sumByFunc(Vector2D(1.1, 5.4), Vector2D(2.3, 1.4), scalar, Vector2D(3.5, 1.7), Vector2D(-5, 4)) == -0.6099999999999994)
      assert(sumByFunc(Vector2D(3.1, 5.4), Vector2D(2.4, 1.3), cosBetween, Vector2D(-3.5, 6.7), Vector2D(-5, 3)) == 1.703886371902637)
      assert(sumByFunc(Vector2D(-42.151, 24.13), Vector2D(41.23, 151.13), cosBetween, Vector2D(1.584, 42.32), Vector2D(-14.32, -145)) == -0.7472507207392238)
    }

    'test_sumScalar - {
      assert(sumScalars(Vector2D(1, 2),Vector2D(3, 4), Vector2D(5, 6), Vector2D(7, 8)) == 94)
      assert(sumScalars(Vector2D(1, 0), Vector2D(0, 4), Vector2D(5, 6), Vector2D(0, 0)) == 0)
      assert(sumScalars(Vector2D.one, Vector2D(0, 4), Vector2D(5, 6), Vector2D(0, 1)) == 10)
      assert(sumScalars(Vector2D.empty, Vector2D.empty, Vector2D.empty, Vector2D.empty) == 0)
    }


    'test_sumCosines - {
      'test_divBy3Or7 - {
        assert(sumCosines(Vector2D(4, 3), Vector2D(3, 4), Vector2D(5, 12), Vector2D(12, 5)) == 1.6700591715976332)
        assert(sumCosines(Vector2D(1, 0), Vector2D(0, 4), Vector2D(3, 4), Vector2D(9, 0)) == 0.6000000000000001)
        assert(sumCosines(Vector2D(1, 3), Vector2D(1, 3), Vector2D(0, 4), Vector2D(9, 0)) == 0.9999999999999999)
      }
    }

    'test_balls - {
      assert(
        sortByHeavyweight(Map.empty) == Seq.empty
      )
      assert(
        sortByHeavyweight(Map("1" -> (1 -> 2), "2" -> (3 -> 4))) == Seq("1","2")
      )
      assert(
        sortByHeavyweight(Map("1" -> (2 -> 2), "2" -> (3 -> 2), "3" -> (4 -> 2))) == Seq("1", "2", "3")
      )
      assert(
        sortByHeavyweight(Map("1" -> (6 -> 2), "2" -> (4 -> 2), "3" -> (2 -> 4))) == Seq("3", "2", "1")
      )
    }
  }
}
