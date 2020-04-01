package homework_3

import utest._

object Test extends TestSuite {

    def testPrettyBooleanFormatter(implementation: Any => String): Unit = {
        val int = 1
        val list = List(1, 2, 3)
        val string = "abc"
        assert(implementation(true) == Exercises.TrueString)
        assert(implementation(false) == Exercises.FalseString)
        assert(implementation(int) == int.toString)
        assert(implementation(list) == list.toString)
        assert(implementation(string) == string)
    }

    def testNotEmptySeqMax(maxFunc: Seq[Int] => Int): Unit = {
        assert(maxFunc(List(1)) == 1)
        assert(maxFunc(List(1, 2, 3)) == 3)
        assert(maxFunc(List(3, 2, 1)) == 3)
        assert(maxFunc(List(1, 3, 2)) == 3)
    }

    def testSum(implementation: (Int, Int) => Int): Unit = {
        assert(implementation(0, 0) == 0)
        assert(implementation(1, 0) == 1)
        assert(implementation(0, 1) == 1)
        assert(implementation(1, 2) == 3)
    }

    val tests = Tests {
        'test_prettyBooleanFormatter1 - {
            testPrettyBooleanFormatter(Exercises.prettyBooleanFormatter1)
        }
        'test_prettyBooleanFormatter2 - {
            testPrettyBooleanFormatter(Exercises.prettyBooleanFormatter2)
        }
        'test_prettyBooleanFormatter3 - {
            testPrettyBooleanFormatter(Exercises.prettyBooleanFormatter3)
        }
        'test_max1 - {
            intercept[IllegalArgumentException](Exercises.max1(Seq()))
            testNotEmptySeqMax(Exercises.max1)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq()) == Seq())
            testNotEmptySeqMax(seq => Exercises.max2(seq).head)
        }
        'test_max3 - {
            assert(Exercises.max3(Seq()).isEmpty)
            testNotEmptySeqMax(seq => Exercises.max3(seq).get)
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
