package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter1("123") == "123")
            assert(Exercises.prettyBooleanFormatter1(2.28) == "2.28")

            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
            assert(Exercises.prettyBooleanFormatter2("123") == "123")
            assert(Exercises.prettyBooleanFormatter2(2.28) == "2.28")

            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(1) == "1")
            assert(Exercises.prettyBooleanFormatter3("123") == "123")
            assert(Exercises.prettyBooleanFormatter3(2.28) == "2.28")
        }

        'task_2 - {
            assert((Exercises.max1(List(1, 2, 3))) == 3)
            assert((Exercises.max1(List(1, 2, 113, 3))) == 113)
            assert((Exercises.max1(List())) == 0)

            assert((Exercises.max2(List(1, 2, 3))) == List(3))
            assert((Exercises.max2(List(1, 2, 113, 3))) == List(113))
            assert((Exercises.max2(List())) == List())

            assert((Exercises.max3(List(1, 2, 3))) == Option(3))
            assert((Exercises.max3(List(1, 2, 113, 3))) == Option(113))
            assert((Exercises.max3(List())).isEmpty)
        }

        'task_3 - {
            assert(Exercises.sum1(1, 2) == 3)
            assert(Exercises.sum1(-1, 1) == 0)
            assert(Exercises.sum1(89, 11) == 100)
            assert(Exercises.sum1(0, 0) == 0)

            assert(Exercises.sum2(1, 2) == 3)
            assert(Exercises.sum2(-1, 1) == 0)
            assert(Exercises.sum2(89, 11) == 100)
            assert(Exercises.sum2(0, 0) == 0)

            assert(Exercises.sum3(1, 2) == 3)
            assert(Exercises.sum3(-1, 1) == 0)
            assert(Exercises.sum3(89, 11) == 100)
            assert(Exercises.sum3(0, 0) == 0)
        }
    }
}
