package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        val trueStr = "правда"
        val falseStr = "ложь"
        val someInt = "42"

        'test_prettyBooleanFormatter1 - {
            Exercises.prettyBooleanFormatter1(true) == trueStr
            Exercises.prettyBooleanFormatter1(false) == falseStr
            Exercises.prettyBooleanFormatter1(42) == someInt
        }
        'test_prettyBooleanFormatter2 - {
            Exercises.prettyBooleanFormatter2(true) == trueStr
            Exercises.prettyBooleanFormatter2(false) == falseStr
            Exercises.prettyBooleanFormatter2(42) == someInt
        }
        'test_prettyBooleanFormatter3 - {
            Exercises.prettyBooleanFormatter3(true) == trueStr
            Exercises.prettyBooleanFormatter3(false) == falseStr
            Exercises.prettyBooleanFormatter3(42) == someInt
        }

        val simpleSeq: Seq[Int] = Seq(4, 5, 1, 2, 6, 4, 1, 3)
        val emptySeq: Seq[Int] = Seq()
        val multipleSeq: Seq[Int] = Seq(5, 3, 6, 1, 8, 4, 8, 1)

        'test_max1 - {
            Exercises.max1(simpleSeq) ==> 6
            Exercises.max1(emptySeq) ==> -1
            Exercises.max1(multipleSeq) ==> 8
        }
        'test_max2 - {
            Exercises.max2(simpleSeq) ==> Seq(6)
            Exercises.max2(emptySeq) ==> Seq()
            Exercises.max2(multipleSeq) ==> Seq(8, 8)
        }
        'test_max3 - {
            Exercises.max3(simpleSeq) ==> Some(6)
            Exercises.max3(emptySeq) ==> None
            Exercises.max3(multipleSeq) ==> Some(8)
        }

        'test_sum1 - {
            Exercises.sum1(1, -1) == 0
            Exercises.sum1(15, 25) == 40
            Exercises.sum1(0, 0) == 0
        }
        'test_sum2 - {
            Exercises.sum2(1, -1) == 0
            Exercises.sum2(15, 25) == 40
            Exercises.sum2(0, 0) == 0
        }
        'test_sum3 - {
            Exercises.sum3(1, -1) == 0
            Exercises.sum3(15, 25) == 40
            Exercises.sum3(0, 0) == 0
        }
    }
}
