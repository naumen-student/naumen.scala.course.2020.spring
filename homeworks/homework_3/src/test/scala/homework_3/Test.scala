package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests {
        'test_task1 - {
            val trueStr = "правда"
            val falseStr = "ложь"

            'test_prettyBooleanFormatter1 - {
                assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
                assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
                assert(Exercises.prettyBooleanFormatter1(Double) == Double.toString())
            }
            'test_prettyBooleanFormatter2 - {
                assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
                assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
                assert(Exercises.prettyBooleanFormatter2(Int) == Int.toString())
            }
            'test_prettyBooleanFormatter3 - {
                assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
                assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
                assert(Exercises.prettyBooleanFormatter1(Array) == Array.toString())
            }
        }
        'test_task2 - {
            'test_max1 - {
                assert(Exercises.max1(Seq(1, 5, 6)) == 6)
                assert(Exercises.max1(Seq()) == -1)
                assert(Exercises.max1(Seq(10)) == 10)
            }
            'test_max2 - {
                assert(Exercises.max2(Seq(1, 5, 6)) == Seq(6))
                assert(Exercises.max2(Seq()) == Seq())
                assert(Exercises.max2(Seq(10)) == Seq(10))
            }
            'test_max3 - {
                assert(Exercises.max3(Seq(1, 5, 6)) == Option(6))
                assert(Exercises.max3(Seq()).isEmpty)
                assert(Exercises.max3(Seq(10)) == Option(10))
            }
        }
        'test_task3 - {
            'test_sum1 - {
                assert(Exercises.sum1(10, 43) == 53)
                assert(Exercises.sum1(32, -32) == 0)
                assert(Exercises.sum1(-100, -42)== -142)
            }
            'test_sum2 - {
                assert(Exercises.sum2(10, 43) == 53)
                assert(Exercises.sum2(32, -32) == 0)
                assert(Exercises.sum2(-100, -42)== -142)
            }
            'test_sum3 - {
                assert(Exercises.sum3(10, 43) == 53)
                assert(Exercises.sum3(32, -32) == 0)
                assert(Exercises.sum3(-100, -42)== -142)
            }
        }
    }
}
