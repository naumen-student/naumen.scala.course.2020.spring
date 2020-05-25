package homework_3


import utest._


object Test extends TestSuite {


  val tests: Tests = Tests {
    'Test_1 - {
      assert(Exercises.prettyBooleanFormatter1(true) == "правда")
      assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter1(1) == "1")
      assert(Exercises.prettyBooleanFormatter2(true) == "правда")
      assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter2(1) == "1")
      assert(Exercises.prettyBooleanFormatter3(true) == "правда")
      assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
      assert(Exercises.prettyBooleanFormatter3(1) == "1")
    }

    'Test_2 - {
      assert(Exercises.max1(Seq(1, 5)) == 5)
      assert(Exercises.max1(Seq(7, 2, -3)) == 7)
      assert(Exercises.max1(Seq()) == Int.MinValue)

      assert(Exercises.max2(Seq(1, 8)) == Seq(8))
      assert(Exercises.max2(Seq(10, 7, -3, -22)) == Seq(10))
      assert(Exercises.max2(Seq()) == Seq())

      assert(Exercises.max3(Seq(11, 20)).contains(20))
      assert(Exercises.max3(Seq(11, 12, -11, -12)).contains(12))
      assert(Exercises.max3(Seq()).isEmpty)
    }

    'Test_3 - {
      assert(Exercises.sum1(1, 5) == 6)
      assert(Exercises.sum1(-1, 6) == 5)
      assert(Exercises.sum1(0, 0) == 0)

      assert(Exercises.sum2(13, 2) == 15)
      assert(Exercises.sum2(-1, 11) == 10)
      assert(Exercises.sum2(0, 0) == 0)

      assert(Exercises.sum3(12, 42) == 54)
      assert(Exercises.sum3(-1100, 1100) == 0)
      assert(Exercises.sum3(0, 0) == 0)
    }
  }
}
