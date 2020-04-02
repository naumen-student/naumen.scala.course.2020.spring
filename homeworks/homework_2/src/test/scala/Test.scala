import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            'simpleRange - {
                assert(Exercises.sumOfDivBy3Or5(1, 5) == 8)
            }
            'fromNegativeToPositive - {
                assert(Exercises.sumOfDivBy3Or5(-100, 100) == 0)
                assert(Exercises.sumOfDivBy3Or5(-38, 55) == 424)
            }
            'sameNumber - {
                assert(Exercises.sumOfDivBy3Or5(3, 3) == 3)
                assert(Exercises.sumOfDivBy3Or5(-3, -3) == -3)
            }
            'fromLargeToSmallThrowsIllegalArgumentException - {
                assert(
                    try {
                        Exercises.sumOfDivBy3Or5(5, 3)
                        false
                    } catch  {
                        case _: IllegalArgumentException => true
                    }
                )
            }
        }

        'test_primeFactor - {
            'simpleNumber - {
                assert(Exercises.primeFactor(2) == Seq(2))
                assert(Exercises.primeFactor(80) == Seq(2, 5))
                assert(Exercises.primeFactor(98) == Seq(2, 7))
            }
            'largeNumber - {
                assert(Exercises.primeFactor(12345678) == Seq(2, 3, 47, 14593))
            }
            'negativeNumberMustReturnEmptySeq - {
                assert(Exercises.primeFactor(-1337) == Seq())
            }
            'zeroMustReturnEmptySeq - {
                assert(Exercises.primeFactor(0) == Seq())
            }
            'oneMustReturnEmptySeq - {
                assert(Exercises.primeFactor(1) == Seq())
            }
        }

        'test_sumScalars - {
            'zeroVectors - {
                assert(Exercises.sumScalars(
                    Exercises.Vector2D(0, 0),
                    Exercises.Vector2D(0, 0),
                    Exercises.Vector2D(0, 0),
                    Exercises.Vector2D(0, 0)
                ) == 0)
            }
            'perpendicularVectors - {
                assert(Exercises.sumScalars(
                    Exercises.Vector2D(0, 1),
                    Exercises.Vector2D(2, 0),
                    Exercises.Vector2D(3.63, 0),
                    Exercises.Vector2D(0, 36.5)
                ) == 0)
            }
            'simpleVectors - {
                assert({
                    val sum = Exercises.sumScalars(
                        Exercises.Vector2D(13.3, 4.4),
                        Exercises.Vector2D(-12.5, 15.3),
                        Exercises.Vector2D(100.253, 0.32),
                        Exercises.Vector2D(20, -20)
                    )
                    math.abs(sum - 1899.73) <= 0.000000000001
                })
            }
        }

        'test_sumCosines - {
            'zeroVectorsReturnNaN - {
                assert(
                    Exercises.sumCosines(
                        Exercises.Vector2D(0, 0),
                        Exercises.Vector2D(0, 0),
                        Exercises.Vector2D(0, 0),
                        Exercises.Vector2D(0, 0)
                    ).isNaN
                )
            }
            'perpendicularVectors - {
                assert(Exercises.sumCosines(
                    Exercises.Vector2D(0, 1),
                    Exercises.Vector2D(2, 0),
                    Exercises.Vector2D(3.63, 0),
                    Exercises.Vector2D(0, 36.5)
                ) == 0)
            }
            'simpleVectors - {
                assert({
                    val sum = Exercises.sumCosines(
                        Exercises.Vector2D(13.3, 4.4),
                        Exercises.Vector2D(-12.5, 15.3),
                        Exercises.Vector2D(100.253, 0.32),
                        Exercises.Vector2D(20, -20)
                    )
                    math.abs(sum - (0.704846159164554 - 0.35743876218872633)) <= 0.000000000001
                })
            }
        }

        'test_sortByHeavyweight - {
            'correctOrder - {
                assert(
                    Exercises.sortByHeavyweight() == Seq(
                        "Tin",
                        "Platinum",
                        "Nickel",
                        "Aluminum",
                        "Titanium",
                        "Lead",
                        "Sodium",
                        "Uranium",
                        "Gold",
                        "Tungsten",
                        "Zirconium",
                        "Chrome",
                        "Iron",
                        "Copper",
                        "Silver",
                        "Plutonium",
                        "Cobalt",
                        "Cesium",
                        "Calcium",
                        "Lithium",
                        "Magnesium",
                        "Potassium",
                        "Graphite"
                    )
                )
            }
        }
    }
}
