package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }

        val trueStr = "правда"
        val falseStr = "ложь"

        'test_prettyBooleanFormatter1 - {
            'string - {
                assert(Exercises.prettyBooleanFormatter1("string") == "string")
            }
            'number - {
                assert(Exercises.prettyBooleanFormatter1(1337.123) == "1337.123")
            }
            'boolean - {
                assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
                assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
            }
        }
        'test_prettyBooleanFormatter2 - {
            'string - {
                assert(Exercises.prettyBooleanFormatter2("string") == "string")
            }
            'number - {
                assert(Exercises.prettyBooleanFormatter2(1337.123) == "1337.123")
            }
            'boolean - {
                assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
                assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
            }
        }
        'test_prettyBooleanFormatter3 - {
            'string - {
                assert(Exercises.prettyBooleanFormatter3("string") == "string")
            }
            'number - {
                assert(Exercises.prettyBooleanFormatter3(1337.123) == "1337.123")
            }
            'boolean - {
                assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
                assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
            }
        }

        val emptySeq = Seq()
        val notEmptySeq = Seq(1, 2, 3)
        val seqWithDuplicates = Seq(1, 2, 4, 2, 4)
        val negativeSeq = Seq(-100, -4, -3)

        'test_max1 - {
            // Приходится ограничивать коллекцию только целыми числами,
            // так как в случае ненахождения максимума возвращается -1
            'empty - {
                assert(Exercises.max1(emptySeq) == -1)
            }
            'notEmpty {
                assert(Exercises.max1(notEmptySeq) == 3)
            }
            'withDuplicates {
                assert(Exercises.max1(seqWithDuplicates) == 4)
            }
        }
        'test_max2 - {
            'empty - {
                assert(Exercises.max2(emptySeq) == Seq())
            }
            'notEmpty {
                assert(Exercises.max2(notEmptySeq) == Seq(3))
            }
            'withDuplicates {
                assert(Exercises.max2(seqWithDuplicates) == Seq(4))
            }
            'withNegative {
                assert(Exercises.max2(negativeSeq) == Seq(-3))
            }
        }
        'test_max3 - {
            'empty - {
                assert(Exercises.max3(emptySeq).isEmpty)
            }
            'notEmpty {
                assert(Exercises.max3(notEmptySeq).contains(3))
            }
            'withDuplicates {
                assert(Exercises.max3(seqWithDuplicates).contains(4))
            }
            'withNegative {
                assert(Exercises.max3(negativeSeq).contains(-3))
            }
        }

        'test_sum1 - {
            'zeros - {
                assert(Exercises.sum1(0, 0) == 0)
            }
            'zeroResult - {
                assert(Exercises.sum1(-123, 123) == 0)
            }
            'sum - {
                assert(Exercises.sum1(1, 1) == 2)
            }
        }

        'test_sum2 - {
            'zeros - {
                assert(Exercises.sum2(0, 0) == 0)
            }
            'zeroResult - {
                assert(Exercises.sum2(-123, 123) == 0)
            }
            'sum - {
                assert(Exercises.sum2(1, 1) == 2)
            }
        }

        'test_sum3_arguments_incremented_by_1 - {
            'zeros - {
                assert(Exercises.sum3(-1, -1) == 0)
            }
            'zeroResult - {
                assert(Exercises.sum3(-123 - 1, 123 - 1) == 0)
            }
            'sum - {
                assert(Exercises.sum3(1, 1) == 4)
            }
        }
    }
}
