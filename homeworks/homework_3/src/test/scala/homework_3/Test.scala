package homework_3

import utest._

object Test extends TestSuite{

    val trueStr = "правда"
    val falseStr = "ложь"

    def testFormatter(formatter: Any => String): Unit = {
        formatter(true) == trueStr
        formatter(false) == falseStr
        formatter(123) == 123.toString
    }

    def testSum(sumF: (Int, Int) => Int): Unit = {
        sumF(1, 2) == 3
        sumF(0, 0) == 0
        sumF(-10, 100) == 90
    }

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            testFormatter(Exercises.prettyBooleanFormatter1)
        }
        'test_prettyBooleanFormatter2 - {
            testFormatter(Exercises.prettyBooleanFormatter2)
        }
        'test_prettyBooleanFormatter3 - {
            testFormatter(Exercises.prettyBooleanFormatter3)
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(1)) == 1)
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            intercept[UnsupportedOperationException](Exercises.max1(Seq.empty[Int]))
        }

        'test_max2 - {
            assert(Exercises.max1(Seq(1)) == 1)
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            assert(Exercises.max2(Seq.empty[Int]) == Seq.empty[Int])
        }

        'test_max3 - {
            assert(Exercises.max3(Seq.empty[Int]) == None)
            assert(Exercises.max3(Seq(1, 2, 3)) == Option(3))
            assert(Exercises.max3(Seq(1)) == Option(1))
        }

        'test_sum1 - {
            testSum(Exercises.sum1)
        }
        'test_sum2 - {
            testSum(Exercises.sum2)
        }
        'test_sum3 - {
            testSum(Exercises.sum3)
        }
    }
}
