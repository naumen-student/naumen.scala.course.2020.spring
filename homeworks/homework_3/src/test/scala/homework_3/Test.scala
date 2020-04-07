package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        'test_prettyBooleanFormatter - {
            val trueStr = "правда"
            val falseStr = "ложь"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(5) == "5")

            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2("example") == "example")

            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(Seq(1.5, 3.6, 9)) == "List(1.5, 3.6, 9.0)")
        }

        'test_max- {
            assert(Exercises.max1(Seq()) == Int.MinValue)
            assert(Exercises.max1(Seq(12, 3, -78, -90, 1)) == 12)
            assert(Exercises.max1(Seq(12, 36, 9)) == 36)

            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(12, 3, -78, -90, 1)) == Seq(12))
            assert(Exercises.max2(Seq(12, 36, 9)) == Seq(36))

            assert(Exercises.max3(Seq()) == None)
            assert(Exercises.max3(Seq(12, 3, -78, -90, 1)) == Option(12))
            assert(Exercises.max3(Seq(12, 36, 9)) == Option(36))
        }

        'test_sum - {
            assert(Exercises.sum1(1,3)== 4)
            assert(Exercises.sum1(0,-10) == -10 )
            assert(Exercises.sum1(-3,-9) == -12)

            assert(Exercises.sum2(Int.MinValue,Int.MaxValue)==Int.MinValue+Int.MaxValue )
            assert(Exercises.sum2(-15,0) == -15 )
            assert(Exercises.sum2(0,18) == 18)

            assert(Exercises.sum2(98,0)== 98 )
            assert(Exercises.sum2(0,0) == 0 )
            assert(Exercises.sum2(987,-789) == 198)
        }
    }
}
