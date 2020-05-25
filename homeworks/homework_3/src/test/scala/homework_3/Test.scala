package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example1 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(1) == "1")

            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(1) == "1")

            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(1) == "1")
        }

        'test_example2 - {
            assert(Exercises.max1(Seq(1, 2)) == 2)
            assert(Exercises.max1(Seq(1, 2, -1, -2)) == 2)
            assert(Exercises.max1(Seq()) == Int.MinValue)

            assert(Exercises.max2(Seq(1, 2)) == Seq(2))
            assert(Exercises.max2(Seq(1, 2, -1, -2)) == Seq(2))
            assert(Exercises.max2(Seq()) == Seq())

            assert(Exercises.max3(Seq(1, 2)).contains(2))
            assert(Exercises.max3(Seq(1, 2, -1, -2)).contains(2))
            assert(Exercises.max3(Seq()).isEmpty)
        }

        'test_example3 - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(-1, 1) == 0)
            assert(Exercises.sum1(0, 0) == 0)

            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(-1, 1) == 0)
            assert(Exercises.sum2(0, 0) == 0)

            assert(Exercises.sum3(1, 2) == 3)
            assert(Exercises.sum3(-1, 1) == 0)
            assert(Exercises.sum3(0, 0) == 0)
        }
    }
}
