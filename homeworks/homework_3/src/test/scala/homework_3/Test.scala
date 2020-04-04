package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_foremetters - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)

            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)

            assert(Exercises.prettyBooleanFormatter1("привет") == "привет")
            assert(Exercises.prettyBooleanFormatter2("привет") == "привет")
            assert(Exercises.prettyBooleanFormatter3("привет") == "привет")

            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter2(2) == "2")
            assert(Exercises.prettyBooleanFormatter3(3) == "3")
        }
        'test_max - {
            assert(Exercises.max1(Seq.empty) == Int.MinValue)
            assert(Exercises.max1(Seq(1)) == 1)
            assert(Exercises.max1(Seq(10, -5, 3, 8, 0, 12, 5, 5)) == 12)

            assert(Exercises.max2(Seq.empty) == Seq.empty)
            assert(Exercises.max2(Seq(1)) == Seq(1))
            assert(Exercises.max2(Seq(10, -5, 3, 8, 0, 12, 5, 5)) == Seq(12))

            assert(Exercises.max3(Seq.empty) == None)
            assert(Exercises.max3(Seq(1)) == Some(1))
            assert(Exercises.max3(Seq(10, -5, 3, 8, 0, 12, 5, 5)) == Some(12))
        }
        'test_sum - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(100, -100) == 0)

            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(0, 0) == 0)
            assert(Exercises.sum2(100, -100) == 0)

            assert(Exercises.sum3(1, 2) == 3)
            assert(Exercises.sum3(0, 0) == 0)
            assert(Exercises.sum3(100, -100) == 0)
        }
    }
}
