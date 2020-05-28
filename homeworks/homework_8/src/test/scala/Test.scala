import Exercises._
import utest._

import scala.util.{Failure, Success, Try}

object Test extends TestSuite {

  val tests = Tests {

    //Test task 1

    val r01: Option[String] = Read.read[String]("test")

    assert(r01.contains("test"))

    val r02: Option[Int] = Read.read[Int]("123")

    assert(r02.contains(123))

    val r03: Option[Int] = Read.read[Int]("qwe")

    assert(r03.isEmpty)

    val r04: Option[Option[Int]] = Read.read[Option[Int]]("Some(999)")

    assert(r04.contains(Some(999)))

    val r1: Option[String] = "asd".read[String]

    assert(r1.contains("asd"))

    val r2: Option[Int] = "asd".read[Int]

    assert(r2.isEmpty)

    val r3: Option[Int] = "456".read[Int]

    assert(r3.contains(456))

    val r4: Option[Option[Int]] = "None".read[Option[Int]]

    assert(r4.contains(None))

    val r5: Option[Option[Int]] = "Some(asd)".read[Option[Int]]

    assert(r5.isEmpty)

    val r6: Option[Option[Int]] = "asd".read[Option[Int]]

    assert(r6.isEmpty)

    val r7: Option[Option[Int]] = "Some(789)".read[Option[Int]]

    assert(r7.contains(Some(789)))

    val r8: Option[Option[String]] = "".read[Option[String]]

    assert(r8.isEmpty)

    val r9: Option[Option[String]] = "Some(hello)".read[Option[String]]

    assert(r9.contains(Some("hello")))

    val r010: Option[Option[Option[Int]]] =
      "Some(Some(111))".read[Option[Option[Int]]]

    assert(r010.contains(Some(Some(111))))

    val r011: Option[Option[Option[String]]] =
      "Some(None)".read[Option[Option[String]]]

    assert(r011.contains(Some(None)))

    val r012: Option[Option[Option[Option[Int]]]] =
      "None".read[Option[Option[Option[Int]]]]

    assert(r012.contains(None))

    val r013: Option[Option[Option[Int]]] =
      "Some(Some(zxc))".read[Option[Option[Int]]]

    assert(r013.isEmpty)

    val r014: Option[Option[Option[String]]] =
      "Some(Some())".read[Option[Option[String]]]

    assert(r014.contains(Some(Some(""))))

    val r015: List[Int] = readList[Int](List("1", "asd", "2", "qwe", "3"))

    assert(r015 == List(1, 2, 3))

    val r016: List[Option[String]] =
      readList[Option[String]](List("None", "asd", "Some(hello)"))

    assert(r016 == List(None, Some("hello")))

    //Test task 2

    case class TestError(message: String) extends Throwable

    val r101: Option[Int] =
      FromEither.fromEither[Option, String, Int](Right(123))

    assert(r101.contains(123))

    val r102: Option[Int] = FromEither.fromEither[Option, String, Int](Left(""))

    assert(r102.isEmpty)

    val r103: Try[String] =
      FromEither.fromEither[Try, Throwable, String](Right("asd"))

    assert(r103 == Success("asd"))

    val r104: Try[String] =
      FromEither.fromEither[Try, Throwable, String](Left(TestError("Test")))

    assert(r104 == Failure(TestError("Test")))

    val r10: Option[Int] =
      Right(1).asInstanceOf[Either[String, Int]].fromEither[Option]

    assert(r10.contains(1))

    val r11: Option[Int] =
      Left("").asInstanceOf[Either[String, Int]].fromEither[Option]

    assert(r11.isEmpty)

    val r12: Try[Int] =
      Right(12).asInstanceOf[Either[Throwable, Int]].fromEither[Try]

    assert(r12 == Success(12))

    val r13: Try[Int] = Left(TestError("Test"))
      .asInstanceOf[Either[Throwable, Int]]
      .fromEither[Try]

    assert(r13 == Failure(TestError("Test")))

  }

}
