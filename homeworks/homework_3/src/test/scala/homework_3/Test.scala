package homework_3

import utest._

object Test extends TestSuite{

	val trueStr = "правда"
	val falseStr = "ложь"

    def testFormatter(formatter: Any => String) {
        assert(formatter(true) == trueStr)
        assert(formatter(false) == falseStr)
        assert(formatter(42) == "42")
    }

    def testSum(summer: (Int, Int) => Int) {
        assert(Exercises.sum3(42, 0) == 42)
        assert(Exercises.sum3(0, 42) == 42)
        assert(Exercises.sum3(-3, -5) == -8)
        assert(Exercises.sum3(-42, 42) == 0)
    }

    val tests = Tests{
        'test_example - {
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'test_prettyBooleanFormatter1 - {
            testFormatter(Exercises.prettyBooleanFormatter1)
        }
        'test_prettyBooleanFormatter2 - {
            testFormatter(Exercises.prettyBooleanFormatter2)
        }
        'test_prettyBooleanFormatter3 - {
            testFormatter(Exercises.prettyBooleanFormatter3)
        }
        'test_max1 - {
            assert(Exercises.max1(Seq(5, 42, 21)) == 42)
            assert(Exercises.max1(Seq()) == -1)
            assert(Exercises.max1(Seq(-42)) == -42)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq(5, 42, 21)) == Seq(42))
            assert(Exercises.max2(Seq()) == Seq())
            assert(Exercises.max2(Seq(-42)) == Seq(-42))
        }
        'test_max3 - {
            assert(Exercises.max3(Seq(5, 42, 21)) == Some(42))
            assert(Exercises.max3(Seq()) == None)
            assert(Exercises.max3(Seq(-42)) == Some(-42))
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
            
    }
}
