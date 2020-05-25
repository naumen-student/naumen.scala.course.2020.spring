package homework_3

import utest._
import Exercises._

object Test extends TestSuite{

    val tests = Tests{
        'test_formatters - {
            'test_formattersOnBooleans - {
                val trueStr = "правда"
                val falseStr = "ложь"
                'test_TrueValue - {
                    assert(prettyBooleanFormatter1(true) == trueStr)
                    assert(prettyBooleanFormatter2(true) == trueStr)
                    assert(prettyBooleanFormatter3(true) == trueStr)
                }
                'test_FalseValue - {
                    assert(prettyBooleanFormatter1(false) == falseStr)
                    assert(prettyBooleanFormatter2(false) == falseStr)
                    assert(prettyBooleanFormatter3(false) == falseStr)
                }
            }
            'test_formattersOnNumbers - {
                'test_PositiveInteger - {
                    assert(prettyBooleanFormatter1(10) == "10")
                    assert(prettyBooleanFormatter2(10) == "10")
                    assert(prettyBooleanFormatter3(10) == "10")
                }
                'test_NegativeInteger - {
                    assert(prettyBooleanFormatter1(-10) == "-10")
                    assert(prettyBooleanFormatter2(-10) == "-10")
                    assert(prettyBooleanFormatter3(-10) == "-10")
                }
                'test_PositiveFloat - {
                    assert(prettyBooleanFormatter1(10.1234) == "10.1234")
                    assert(prettyBooleanFormatter2(10.1234) == "10.1234")
                    assert(prettyBooleanFormatter3(10.1234) == "10.1234")
                }
                'test_NegativeFloat - {
                    assert(prettyBooleanFormatter1(-10.1234) == "-10.1234")
                    assert(prettyBooleanFormatter2(-10.1234) == "-10.1234")
                    assert(prettyBooleanFormatter3(-10.1234) == "-10.1234")
                }
            }
            'test_formattersOnLists - {
                'test_NonEmptyList - {
                    assert(prettyBooleanFormatter1(List(1, 10, 100)) == "List(1, 10, 100)")
                    assert(prettyBooleanFormatter2(List(1, 10, 100)) == "List(1, 10, 100)")
                    assert(prettyBooleanFormatter3(List(1, 10, 100)) == "List(1, 10, 100)")
                }
                'test_EmptyList - {
                    assert(prettyBooleanFormatter1(List.empty) == "List()")
                    assert(prettyBooleanFormatter2(List.empty) == "List()")
                    assert(prettyBooleanFormatter3(List.empty) == "List()")
                }
            }
            'test_formattersOnStrings - {
                'test_EmptyString - {
                    assert(prettyBooleanFormatter1("") == "")
                    assert(prettyBooleanFormatter2("") == "")
                    assert(prettyBooleanFormatter3("") == "")
                }
                'test_NonEmptyString - {
                    assert(prettyBooleanFormatter1("x") == "x")
                    assert(prettyBooleanFormatter2("x") == "x")
                    assert(prettyBooleanFormatter3("x") == "x")
                }
            }
        }
        'test_max1 - {
            'test_OnEmptySeq - {
                assert(max1(Seq.empty) == Int.MinValue)
            }
            'test_OnSeqContainsOneValue - {
                assert(max1(Seq(1)) == 1)
                assert(max1(Seq(-100)) == -100)
            }
            'test_OnSeqWithoutRepeatedValues - {
                assert(max1(Seq(1, 2, 3)) == 3)
                assert(max1(Seq(-5, -7, -9)) == -5)
                assert(max1(Seq(5, -73, -90)) == 5)
            }
            'test_OnSeqWithRepeatedValues - {
                assert(max1(Seq(1, 2, 3, 3, 2, 1)) == 3)
                assert(max1(Seq(-5, -7, -9, -5, -7, -7, -9)) == -5)
                assert(max1(Seq(5, -73, -90, -5, 5, -73, -90)) == 5)
            }
        }
        'test_max2 - {
            'test_OnEmptySeq - {
                assert(max2(Seq.empty) == Seq.empty)
            }
            'test_OnSeqContainsOneValue - {
                assert(max2(Seq(1)) == Seq(1))
                assert(max2(Seq(-100)) == Seq(-100))
            }
                'test_OnSeqWithoutRepeatedValues - {
                    assert(max2(Seq(1, 2, 3)) == Seq(3))
                    assert(max2(Seq(-5, -7, -9)) == Seq(-5))
                    assert(max2(Seq(5, -73, -90)) == Seq(5))
                }
                'test_OnSeqWithRepeatedValues - {
                    assert(max2(Seq(1, 2, 3, 3, 2, 1)) == Seq(3))
                    assert(max2(Seq(-5, -7, -9, -5, -7, -7, -9)) == Seq(-5))
                    assert(max2(Seq(5, -73, -90, -5, 5, -73, -90)) == Seq(5))
                }
        }
        'test_max3 - {
            'test_OnEmptySeq - {
                assert(max3(Seq.empty).isEmpty)
            }
            'test_OnSeqContainsOneValue - {
                assert(max3(Seq(1)).contains(1))
                assert(max3(Seq(-100)).contains(-100))
            }
                'test_OnSeqWithoutRepeatedValues - {
                    assert(max3(Seq(1, 2, 3)).contains(3))
                    assert(max3(Seq(-5, -7, -9)).contains(-5))
                    assert(max3(Seq(5, -73, -90)).contains(5))
                }
                'test_OnSeqWithRepeatedValues - {
                    assert(max3(Seq(1, 2, 3, 3, 2, 1)).contains(3))
                    assert(max3(Seq(-5, -7, -9, -5, -7, -7, -9)).contains(-5))
                    assert(max3(Seq(5, -73, -90, -5, 5, -73, -90)).contains(5))
                }
        }
        'test_sum1 - {
            'test_onPositiveNumbers - {
                assert(sum1(10, 10) == 20)
                assert(sum1(1000, 1003) == 2003)
                assert(sum1(51, 64) == 115)
            }
            'test_onNegativeNumbers - {
                assert(sum1(-10, -10) == -20)
                assert(sum1(-1000, -1003) == -2003)
                assert(sum1(-51, -64) == -115)
            }
            'test_onPositiveAndNegativeNumbers - {
                assert(sum1(-10, 10) == 0)
                assert(sum1(1000, -1003) == -3)
                assert(sum1(-51, 64) == 13)
            }
            'test_onNumbersWithZeros - {
                assert(sum1(0, 0) == 0)
                assert(sum1(1000, 0) == 1000)
                assert(sum1(0, -51) == -51)
            }
        }
        'test_sum2 - {
            'test_onPositiveNumbers - {
                assert(sum2(10, 10) == 20)
                assert(sum2(1000, 1003) == 2003)
                assert(sum2(51, 64) == 115)
            }
            'test_onNegativeNumbers - {
                assert(sum2(-10, -10) == -20)
                assert(sum2(-1000, -1003) == -2003)
                assert(sum2(-51, -64) == -115)
            }
            'test_onPositiveAndNegativeNumbers - {
                assert(sum2(-10, 10) == 0)
                assert(sum2(1000, -1003) == -3)
                assert(sum2(-51, 64) == 13)
            }
            'test_onNumbersWithZeros - {
                assert(sum2(0, 0) == 0)
                assert(sum2(1000, 0) == 1000)
                assert(sum2(0, -51) == -51)
            }
        }
        'test_sum3 - {
            'test_onPositiveNumbers - {
                assert(sum3(10, 10) == 20)
                assert(sum3(1000, 1003) == 2003)
                assert(sum3(51, 64) == 115)
            }
            'test_onNegativeNumbers - {
                assert(sum3(-10, -10) == -20)
                assert(sum3(-1000, -1003) == -2003)
                assert(sum3(-51, -64) == -115)
            }
            'test_onPositiveAndNegativeNumbers - {
                assert(sum3(-10, 10) == 0)
                assert(sum3(1000, -1003) == -3)
                assert(sum3(-51, 64) == 13)
            }
            'test_onNumbersWithZeros - {
                assert(sum3(0, 0) == 0)
                assert(sum3(1000, 0) == 1000)
                assert(sum3(0, -51) == -51)
            }
        }
    }
}
