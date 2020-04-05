package homework_3

import utest._
import Exercises._
object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
    }

    val testPrettyBooleanFormatter = Tests{
        'test_pretty_booleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(prettyBooleanFormatter1(true) == trueStr)
            assert(prettyBooleanFormatter1(false) == falseStr)
            assert(prettyBooleanFormatter1(10) == "10")

            assert(prettyBooleanFormatter2(true) == trueStr)
            assert(prettyBooleanFormatter2(false) == falseStr)
            assert(prettyBooleanFormatter2(10f) == "10.0")

            assert(prettyBooleanFormatter3(true) == trueStr)
            assert(prettyBooleanFormatter3(false) == falseStr)
            assert(prettyBooleanFormatter3(10.5) == "10.5")
        }
    }

    val testMax = Tests{
        'test_max - {
            assert(max1(Seq()) == 0)
            assert(max1(Seq(4, 2, 7, 10)) == 10)

            assert(max2(Seq()) == Seq())
            assert(max2(Seq(4, 2, 7, 10)) == Seq(10))

            assert(max3(Seq()) == Option.empty[Int])
            assert(max3(Seq(4, 2, 7, 10)).contains(10))
        }
    }

    val testSum = Tests{
        'test_sum - {
            assert(sum1(10, 20) == 30)
            assert(sum2(17, 83) == 100)
            assert(sum3(95, 105) == 200)
        }
    }
}
