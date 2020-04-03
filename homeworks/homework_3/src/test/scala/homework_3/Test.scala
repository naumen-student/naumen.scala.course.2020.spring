package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
        }
        'test_formatterInt - {
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
            assert(Exercises.prettyBooleanFormatter3(1) == "1")
        }
        'test_formatterSet - {
            val set = Set(1,2)
            assert(Exercises.prettyBooleanFormatter1(set) == set.toString())
            assert(Exercises.prettyBooleanFormatter2(set) == set.toString())
            assert(Exercises.prettyBooleanFormatter3(set) == set.toString())
        }
        'test_formatterMoreArg - {
            val list = List(1,2,3,4,5)
            assert(Exercises.prettyBooleanFormatter1(list) == list.toString())
            assert(Exercises.prettyBooleanFormatter2(list) == list.toString())
            assert(Exercises.prettyBooleanFormatter3(list) == list.toString())
        }
        'test_max - {
            assert(Exercises.max1(1::2::3::List())== 3)
            assert(Exercises.max2(1::2::3::List())== List(3))
            assert(Exercises.max3(1::2::3::List())== Option(3))
        }
        'test_maxDouble - {
            assert(Exercises.max1(3::2::3::1::List())== 3)
            assert(Exercises.max2(3::2::3::1::List())== List(3))
            assert(Exercises.max3(3::2::3::1::List())== Option(3))
        }
        'test_maxEmpty - {
            assert(Exercises.max1(List()) == 0)
            assert(Exercises.max2(List()) == List())
            assert(Exercises.max3(List()).isEmpty)
        }
        'test_sum - {
            assert(Exercises.sum1(2,4) == 6)
            assert(Exercises.sum2(2,4) == 6)
            assert(Exercises.sum3(2,4) == 6)
        }
        'test_sumMore - {
            assert(Exercises.sum1(0,10) == 10)
            assert(Exercises.sum2(0,10) == 10)
            assert(Exercises.sum3(0,10) == 10)
        }
        'test_sumEmpty - {
            assert(Exercises.sum1(2,2) == 4)
            assert(Exercises.sum2(2,2) == 4)
            assert(Exercises.sum3(2,2) == 4)
        }
    }
}
