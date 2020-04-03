package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            testBooleanFormatter(Exercises.prettyBooleanFormatter1)
        }
        'test_prettyBooleanFormatter2 - {
            testBooleanFormatter(Exercises.prettyBooleanFormatter1)
        }
        'test_prettyBooleanFormatter3 - {
            testBooleanFormatter(Exercises.prettyBooleanFormatter1)
        }

        def testBooleanFormatter(format: Any => String): Unit = {
            assert(format(true) == "правда")
            assert(format(false) == "ложь")
            assert(format(1) == "1")
            assert(format(()) == "()")
            assert(format("истина") == "истина")
        }

        'test_max1 - {
            intercept[UnsupportedOperationException](Exercises.max1(Seq.empty))
            assert(Exercises.max1(Seq(1)) == 1)
            assert(Exercises.max1(Seq(1, 2, 3)) == 3)
            assert(Exercises.max1(Seq(3, 2, 1)) == 3)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq.empty).isEmpty)
            assert(Exercises.max2(Seq(1)) == Seq(1))
            assert(Exercises.max2(Seq(1, 2, 3)) == Seq(3))
            assert(Exercises.max2(Seq(3, 2, 1)) == Seq(3))
        }
        'test_max3 - {
            assert(Exercises.max3(Seq.empty).isEmpty)
            assert(Exercises.max3(Seq(1)).get == 1)
            assert(Exercises.max3(Seq(1, 2, 3)).get == 3)
            assert(Exercises.max3(Seq(3, 2, 1)).get == 3)
        }

        'test_sum1 - {
            testSum(Exercises.sum1)
        }
        'test_sum2 - {
            testSum(Exercises.sum2)
        }
        'test_sum3 - {
            testSum(Exercises.sum3)
        }

        def testSum(sum: (Int, Int) => Int): Unit = {
            assert(sum(0, 0) == 0)
            assert(sum(1, 2) == 3)
            assert(sum(-1, 2) == 1)
            assert(sum(1, -2) == -1)
            assert(sum(-1, -2) == -3)
        }
    }
}
