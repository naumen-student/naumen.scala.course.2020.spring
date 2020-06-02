import scala.util.Try

object Exercises {
  // Task1

  trait Read ...

  object Read {
    def read ...
  }

  implicit class ReadOps ...

  implicit val stringRead = ???
  implicit val intRead = ???

  implicit def optionRead ...

  def readList ...

  // Task2

  trait FromEither ...

  object FromEither {
    def fromEither ...
  }

  implicit class FromEitherOps ...

  implicit def optionFromEither ...

  implicit val tryFromEither = ???
}
