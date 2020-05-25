package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_boolean_formatter - {
            val trueStr = "правда"
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(123) == "123")
            assert(Exercises.prettyBooleanFormatter1("some string") == "some string")

            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(123) == "123")
            assert(Exercises.prettyBooleanFormatter2("some string") == "some string")

            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(123) == "123")
            assert(Exercises.prettyBooleanFormatter3("some string") == "some string")
        }

        'test_seq_max - {
            val defaultSeq = Seq(1, 2, 3, 4, 5)
            val negativeSeq = Seq(-1, -2, -3, 0)
            val emptySeq = Seq()
            assert(Exercises.max1(defaultSeq) == 5)
            assert(Exercises.max1(emptySeq) == Int.MinValue)
            assert(Exercises.max1(negativeSeq) == 0)

            assert(Exercises.max2(defaultSeq) == Seq(5))
            assert(Exercises.max2(emptySeq) == Seq())
            assert(Exercises.max2(negativeSeq) == Seq(0))

            assert(Exercises.max3(defaultSeq).get == 5)
            assert(Exercises.max3(emptySeq).isEmpty)
            assert(Exercises.max3(negativeSeq).get == 0)
        }

        'test_pair_sum - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(2, 0) == 2)
            assert(Exercises.sum1(-3, 2) == -1)

            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(2, 0) == 2)
            assert(Exercises.sum2(-3, 2) == -1)

            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(2, 0) == 2)
            assert(Exercises.sum2(-3, 2) == -1)
        }
    }
}
