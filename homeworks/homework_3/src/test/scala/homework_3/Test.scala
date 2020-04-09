package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'prettyBooleanFormatter1 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            val any: Any = List(12, 2)
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter1(any) == "List(12, 2)")
        }

        'prettyBooleanFormatter2 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            val any: Any = List(12, 2)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter2(any) == "List(12, 2)")
        }
        'prettyBooleanFormatter3 - {
            val trueStr = "правда"
            val falseStr = "ложь"
            val any: Any = List(12, 2)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            assert(Exercises.prettyBooleanFormatter3(any) == "List(12, 2)")
        }

        'max1 - {
            assert(Exercises.max1(List(12, 2)) == 12)
            assert(Exercises.max1(Seq(12, 2)) == 12)
            assert(Exercises.max1(Seq()) == 0)
        }

        'max2 - {
            assert(Exercises.max2(List(12, 2)) == Seq(12))
            assert(Exercises.max2(Seq(12, 2)) == Seq(12))
            assert(Exercises.max2(Seq()) == Seq())
        }
        'max3 - {
            assert(Exercises.max3(List(12, 2)) == Some(12))
            assert(Exercises.max3(Seq(12, 2)) == Some(12))
            assert(Exercises.max3(Seq()) == None)
        }
        'sum1 - {
            assert(Exercises.sum1(12, 2) == 14)
            assert(Exercises.sum1(-12, -2) == -14)
            assert(Exercises.sum1(0, 12) == 12)
        }
        'sum2 - {
            assert(Exercises.sum2(12, 2) == 14)
            assert(Exercises.sum2(-12, -2) == -14)
            assert(Exercises.sum2(0, 12) == 12)
        }
        'sum3 - {
            assert(Exercises.sum3(12, 2) == 14)
            assert(Exercises.sum3(-12, -2) == -14)
            assert(Exercises.sum3(0, 12) == 12)
        }
    }
}
