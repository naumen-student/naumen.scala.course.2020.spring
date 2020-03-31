package homework_3

import utest._
import Exercises._

object Test extends TestSuite {
  def testPBF(f: Any => String): Unit = {
    f(true) ==> правда
    f(false) ==> ложь
    f(1) ==> "1"
    f(List(1, 2)) ==> "List(1, 2)"
    f(1 -> 2) ==> "(1,2)"

  }
  def testSum(f: (Int, Int) => Int): Unit = {
    f(1, 2) ==> 3
    f(2, 1) ==> 3
    f(0, 0) ==> 0
    f(0, 1) ==> 1
    f(1, 0) ==> 1
    f(-1, 1) ==> 0
    f(-5, 10) ==> 5
    f(5, -10) ==> -5
  }
  val tests: Tests = Tests {

    'test_prettyBooleanFormatter1 - testPBF(prettyBooleanFormatter1)
    'test_prettyBooleanFormatter2 - testPBF(prettyBooleanFormatter2)
    'test_prettyBooleanFormatter3 - testPBF(prettyBooleanFormatter3)

    'test_max1 - {
      max1(Seq(1, 2, 3, 4, 5)) ==> 5
      max1(Seq(5)) ==> 5
      intercept[UnsupportedOperationException](max1(Seq()))
    }
    'test_max2 - {
      max2(Seq(1, 2, 3, 4, 5)) ==> 5 +: Seq()
      max2(Seq(5)) ==> 5 +: Seq()
      max2(Seq()) ==> Seq()
    }
    'test_max3 - {
      max3(Seq(1, 2, 3, 4, 5)) ==> Some(5)
      max3(Seq(5)) ==> Some(5)
      max3(Seq()) ==> None
    }

    'test_sum1 - testSum(sum1)
    'test_sum2 - testSum(sum2)
    'test_sum3 - testSum(sum3)

  }
}
