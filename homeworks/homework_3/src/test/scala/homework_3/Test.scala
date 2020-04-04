package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(44) == "44")
            assert(Exercises.prettyBooleanFormatter1("скаларулит") == "скаларулит")

            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(44) == "44")
            assert(Exercises.prettyBooleanFormatter2("скаларулит") == "скаларулит")

            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(44) == "44")
            assert(Exercises.prettyBooleanFormatter3("скаларулит") == "скаларулит")
        }
        'test_max - {
            assert(Exercises.max1(Seq[Int](0, 1, 10)) == 10)
            assert(Exercises.max1(Seq[Int](-10, 0, 10)) == 10)
            assert(Exercises.max1(Seq[Int]()) == 0)

            assert(Exercises.max2(Seq[Int](0, 1, 10)) == Seq[Int](10))
            assert(Exercises.max2(Seq[Int](-10, 0, 10)) == Seq[Int](10))
            assert(Exercises.max2(Seq[Int]()) == Nil)

            assert(Exercises.max3(Seq[Int](0, 1, 10)) == Option[Int](10))
            assert(Exercises.max3(Seq[Int](-10, 0, 10)) == Option[Int](10))
            assert(Exercises.max3(Seq[Int]()).isEmpty)
        }
        'test_sum - {
            assert(Exercises.sum1(0, 1) == 1)
            assert(Exercises.sum1(-1, 1) == 0)
            assert(Exercises.sum1(-1, 100) == 99)

            assert(Exercises.sum2(-1, 1) == 0)
            assert(Exercises.sum2(-1, 1) == 0)
            assert(Exercises.sum2(-1, 100) == 99)

            assert(Exercises.sum3(-1, 1) == 0)
            assert(Exercises.sum3(-1, 1) == 0)
            assert(Exercises.sum3(-1, 100) == 99)
        }
    }
}
