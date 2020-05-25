package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'formatters_tests - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)

            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)

            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
            assert(Exercises.prettyBooleanFormatter3(1) == "1")

            assert(Exercises.prettyBooleanFormatter1("str") == "str")
            assert(Exercises.prettyBooleanFormatter2("str") == "str")
            assert(Exercises.prettyBooleanFormatter3("str") == "str")

            assert(Exercises.prettyBooleanFormatter1(List(1, 2, 3)) == "List(1, 2, 3)")
            assert(Exercises.prettyBooleanFormatter2(List(1, 2, 3)) == "List(1, 2, 3)")
            assert(Exercises.prettyBooleanFormatter3(List(1, 2, 3)) == "List(1, 2, 3)")
        }

        'max_tests - {
            intercept[UnsupportedOperationException](Exercises.max1(Seq()))
            assert(Exercises.max1(Seq(1)) == 1)
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)

            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(1)) == Seq(1))
            assert(Exercises.max2(Seq(1, 2, 3)) == Seq(3))

            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(Seq(1)).contains(1))
            assert(Exercises.max3(Seq(1, 2, 3)).contains(3))
        }

        'sum_tests - {
            assert(Exercises.sum1(1, 10) == 11)
            assert(Exercises.sum1(-5, 10) == 5)
            assert(Exercises.sum1(Int.MaxValue, Int.MinValue) == -1)

            assert(Exercises.sum2(1, 10) == 11)
            assert(Exercises.sum2(-5, 10) == 5)
            assert(Exercises.sum2(Int.MaxValue, Int.MinValue) == -1)

            assert(Exercises.sum3(1, 10) == 11)
            assert(Exercises.sum3(-5, 10) == 5)
            assert(Exercises.sum3(Int.MaxValue, Int.MinValue) == -1)
        }
    }
}
