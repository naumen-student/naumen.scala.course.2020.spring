import Exercises.Vector2D
import utest._

object Test extends TestSuite {

  val tests: Tests = Tests {
    'test_divBy3Or7 - {
      assert(Exercises.divBy3Or7(1, 3) == Seq(3))
      assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
      assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
    }
  }
  val test2: Tests = Tests {
    'test_sumOfDivBy3Or5 - {
      assert(Exercises.sumOfDivBy3Or5(1, 40) == 408)
      assert(Exercises.sumOfDivBy3Or5(8, 500) == 58404)
      assert(Exercises.sumOfDivBy3Or5(90, 100) == 573)
      assert(Exercises.sumOfDivBy3Or5(-100, 100) == 0)
    }
  }

  val test3: Tests = Tests {
    'test_primeFactor - {
      assert(Exercises.primeFactor(10) == Seq(2, 5))
      assert(Exercises.primeFactor(148) == Seq(2, 27))
      assert(Exercises.primeFactor(2) == Seq(2))
      assert(Exercises.primeFactor(2345321) == (Seq(11, 101, 2111)))
    }
  }

  val test4: Tests = Tests {
    'test_sumByFunc - {
      assert(Exercises.sumByFunc(Vector2D(0, 0), Vector2D(0, 0), Exercises.scalar, Vector2D(0, 0), Vector2D(0, 0)) == 0)
      assert(Exercises.sumByFunc(Vector2D(1, 1), Vector2D(1, 1), Exercises.scalar, Vector2D(1, 1), Vector2D(1, 1)) == 4)
      assert(Exercises.sumByFunc(Vector2D(2, 2), Vector2D(2, 2), Exercises.scalar, Vector2D(2, 2), Vector2D(2, 2)) == 8)
    }
  }

  val test5: Tests = Tests {
    'test_sortByHeavyweight - {
      val ball: Map[String, (Int, Double)] = Map("Metal" -> (1, 1), "Gold" -> (2, 2), "Silver" -> (3, 3))
      val ball2: Map[String, (Int, Double)] = Map("Metal" -> (1, 10), "Gold" -> (2, 15), "Silver" -> (3, 30))
      val ball3: Map[String, (Int, Double)] = Map("Metal" -> (40, 10), "Gold" -> (50, 15), "Silver" -> (10, 30))

      assert(Exercises.sortByHeavyweight(ball) == Seq("Metal", "Gold", "Silver"))
      assert(Exercises.sortByHeavyweight(ball2) == Seq("Metal", "Gold", "Silver"))
      assert(Exercises.sortByHeavyweight(ball3) == Seq("Silver", "Metal", "Gold"))
    }
  }

}
