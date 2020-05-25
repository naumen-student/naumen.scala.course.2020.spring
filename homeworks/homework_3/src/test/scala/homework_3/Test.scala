package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter - {
            val checkAllMethods = (arg: Any, res: String) => {
                assert(Exercises.prettyBooleanFormatter1(arg) == res)
                assert(Exercises.prettyBooleanFormatter2(arg) == res)
                assert(Exercises.prettyBooleanFormatter3(arg) == res)
            }
            checkAllMethods(true, "правда")
            checkAllMethods(false, "ложь")
            checkAllMethods(123, "123")
            checkAllMethods("str", "str")
        }

        'test_max - {
            val checkAllMethods = (arg: Seq[Int], res1: Int, res2: Seq[Int], res3: Option[Int]) => {
                assert(Exercises.max1(arg) == res1)
                assert(Exercises.max2(arg) == res2)
                assert(Exercises.max3(arg) == res3)
            }
            checkAllMethods(Seq(), 0, Seq(), None)
            checkAllMethods(Seq(1, 3, 2), 3, Seq(3), Some(3))
            checkAllMethods(Seq(3, 3, 3), 3, Seq(3), Some(3))
        }

        'test_sum - {
            val checkAllMethods = (x: Int, y: Int, res: Int) => {
                assert(Exercises.sum1(x, y) == res)
                assert(Exercises.sum2(x, y) == res)
                assert(Exercises.sum3(x, y) == res)
            }
            checkAllMethods(2, 3, 5)
            checkAllMethods(0, 0, 0)
            checkAllMethods(Int.MaxValue, Int.MaxValue, -2)
        }
    }
}
