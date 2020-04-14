package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        'task1 - {
            def makeTests(func:Any => String): Unit = {
                assert(func(true) == "правда")
                assert(func(false) == "ложь")
                assert(func(10) == "10")
                assert(func(Seq(1, 2, 3, 4, 5)) == "List(1, 2, 3, 4, 5)")
                assert(func(1 -> 2) == "(1,2)")
            }
            makeTests(Exercises.prettyBooleanFormatter1)
            makeTests(Exercises.prettyBooleanFormatter2)
            makeTests(Exercises.prettyBooleanFormatter3)
        }
        'max1 - {
            Exercises.max1(Seq(1, 2, 3, 4, 5)) ==> 5
            Exercises.max1(Seq(1)) ==> 1
            intercept[NotImplementedError](Exercises.max1(Seq()))
        }
        'max2 - {
            Exercises.max2(Seq(1, 2, 3, 4, 5)) ==> Seq(5)
            Exercises.max2(Seq(1)) ==> Seq(1)
            Exercises.max2(Seq()) ==> Seq()
        }
        'max3 - {
            Exercises.max3(Seq(1, 2, 3, 4, 5)) ==> Some(5)
            Exercises.max3(Seq(1)) ==> Some(1)
            Exercises.max3(Seq()) ==> None
        }
        'task3 - {
            def makeTests(func:(Int, Int) => Int): Unit = {
                assert(func(1,2) == 3)
                assert(func(0,0) == 0)
                assert(func(100, 243) == 343)
            }
            makeTests(Exercises.sum1)
            makeTests(Exercises.sum2)
            makeTests(Exercises.sum3)
        }
    }
}
