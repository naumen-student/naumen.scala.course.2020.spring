package homework_3

import utest._
import Exercises._

object Test extends TestSuite{
    def tests_prettyBooleanFormatter(formatter: Any => String): Tests = Tests{
        'test_booleanTrue - {
            assert(formatter(true) == "правда")
        }

        'test_booleanFalse - {
            assert(formatter(false) == "ложь")
        }

        'test_string - {
            assert(formatter("true") == "true")
        }

        'test_float - {
            assert(formatter(2F) == "2.0")
        }

        'test_int - {
            assert(formatter(2) == "2")
        }
    }

    val tests_prettyBooleanFormatter1 = tests_prettyBooleanFormatter(prettyBooleanFormatter1)
    val tests_prettyBooleanFormatter2 = tests_prettyBooleanFormatter(prettyBooleanFormatter2)
    val tests_prettyBooleanFormatter3 = tests_prettyBooleanFormatter(prettyBooleanFormatter3)

    val tests_Max1 = Tests{
        'test_notEmptySeq - {
            assert(max1(Seq(1, 200, 3, 4)) == 200)
            assert(max1(Seq(-1, -200, -3, -4)) == -1)
        }

        'test_emptySeq - {
            intercept[Exception] {max1(Seq())}
        }
    }

    val tests_Max2 = Tests{
        'test_notEmptySeq - {
            assert(max2(Seq(1, 200, 3, 4)) ==  Seq(200))
            assert(max2(Seq(-1, -200, -3, -4)) == Seq(-1))
        }

        'test_emptySeq - {
            assert(max2(Seq()) == Seq())
        }
    }

    val tests_Max3 = Tests{
        'test_notEmptySeq - {
            assert(max3(Seq(1, 200, 3, 4)) == Option(200))
            assert(max3(Seq(-1, -200, -3, -4)).contains(-1))
        }

        'test_emptySeq - {
            assert(max3(Seq()).isEmpty)
        }
    }

    def tests_sum(adder: (Int, Int) => Int): Tests = Tests{
        'test_positiveNumbers - {
            assert(adder(3, 40) == 43)
        }

        'test_negativeNumbers - {
            assert(adder(-7, -2) == -9)
            assert(adder(-50, 20) == -30)
        }

        'test_sumWithZero - {
            assert(adder(0, 0) == 0)
            assert(adder(17, -0) == 17)
        }
    }

    val tests_Sum1 = tests_sum(sum1)
    val tests_Sum2 = tests_sum(sum2)
    val tests_Sum3 = tests_sum(sum3)

    val tests = Tests {}
}
