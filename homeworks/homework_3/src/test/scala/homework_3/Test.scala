package homework_3

import utest._
import Exercises._

object Test extends TestSuite{

    val tests = Tests {
        def testBoolean(func: Any => String): Unit = {
            assert(func(true) == "правда")
            assert(func(false) == "ложь")
            assert(func(123) == "123")
            assert(func("true") == "true")
        }

        'test_prettyBooleanFormatter1 - {
            testBoolean(prettyBooleanFormatter1)
        }

        'test_prettyBooleanFormatter2 - {
            testBoolean(prettyBooleanFormatter2)
        }

        'test_prettyBooleanFormatter3 - {
            testBoolean(prettyBooleanFormatter3)
        }

        def testMax[T](func: Seq[Int] => T, res1: T, res2: T, res3: T): Unit = {
            assert(func(Seq(123, 432, 12)) == res1)
            assert(func(Seq(-123, -183, 0)) == res2)
            assert(func(Seq.empty) == res3)
        }

        'test_max1 - {
            testMax[Int](max1, 432, 0, -1)
        }

        'test_max2 - {
            testMax[Seq[Int]](max2, List(432), List(0), List())
        }

        'test_max3 - {
            testMax[Option[Int]](max3, Some(432), Some(0), None)
        }

        def testSum(func: (Int, Int) => Int): Unit = {
            assert(func(4, 54) == 58)
            assert(func(90, -91) == -1)
            assert(func(1, 1) == 2)
        }

        'test_sum1 - {
            testSum(sum1)
        }

        'test_sum2 - {
            testSum(sum2)
        }

        'test_sum3 - {
            testSum(sum3)
        }
    }
}
