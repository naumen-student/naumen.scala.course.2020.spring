package homework_3

import utest._
import Exercises._

object Test extends TestSuite {
    val trueStr = "правда"
    val falseStr = "ложь"

    def test_formatter(formatter: Any => String): Unit = {
        assert(formatter(true) == trueStr)
        assert(formatter(false) == falseStr)
        assert(formatter("some string") == "some string")
    }

    def test_sum(f: (Int, Int) => Int): Unit = {
        assert(f(10, 20) == 30)
        assert(f(0, 0) == 0)
        assert(f(-10, 20) == 10)
        assert(f(10, -20) == -10)
        assert(f(-10, -20) == -30)
    }

    val tests = Tests {
        'test_prettyBooleanFormatter1 - {
            test_formatter(prettyBooleanFormatter1)
        }

        'test_prettyBooleanFormatter2 - {
            test_formatter(prettyBooleanFormatter2)
        }

        'test_prettyBooleanFormatter3 - {
            test_formatter(prettyBooleanFormatter3)
        }

        'test_max1 - {
            assert(max1(Seq(7, 242, 555, 122223)) == 122223)
            assert(max1(Seq()) == 0)
            assert(max1(Seq(100)) == 100)
        }

        'test_max2 - {
            assert(max2(Seq(7, 242, 555, 122223)) == Seq(122223))
            assert(max2(Seq()) == Seq())
            assert(max2(Seq(100)) == Seq(100))
        }

        'test_max3 - {
            assert(max3(Seq(7, 242, 555, 122223)) == Some(122223))
            assert(max3(Seq()) == None)
            assert(max3(Seq(100)) == Some(100))
        }

        'test_sum1 - {
            test_sum(sum1)
        }

        'test_sum2 - {
            test_sum(sum2)
        }

        'test_sum3 - {
            test_sum(sum3)
        }


    }
}
