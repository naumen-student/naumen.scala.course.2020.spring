package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == "true")
            assert(Exercises.prettyBooleanFormatter1(false) == "false")
            assert(Exercises.prettyBooleanFormatter1(123) == "123")

            assert(Exercises.prettyBooleanFormatter2(true) == "true")
            assert(Exercises.prettyBooleanFormatter2(false) == "false")
            assert(Exercises.prettyBooleanFormatter2(123) == "123")

            assert(Exercises.prettyBooleanFormatter3(true) == "true")
            assert(Exercises.prettyBooleanFormatter3(false) == "false")
            assert(Exercises.prettyBooleanFormatter3(123) == "123")

            assert(Exercises.max1(Seq(1,2,3)) == 3)
            assert(Exercises.max1(Seq()) == null.asInstanceOf[Int])

            assert(Exercises.max2(Seq(1,2,3)) == Seq(3))
            assert(Exercises.max2(Seq()) == Seq())

            assert(Exercises.max3(Seq(1,2,3)) == Some(3))
            assert(Exercises.max3(Seq()) == None)

            assert(Exercises.sum1(1, 2) == 3)

            assert(Exercises.sum2(1, 2) == 3)

            assert(Exercises.sum3(1, 2) == 3)

        }
    }
}
