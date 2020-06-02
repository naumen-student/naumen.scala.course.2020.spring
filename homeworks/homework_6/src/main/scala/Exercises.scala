object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int =
    if (idx == 0)
      0
    else if (idx == 1 || idx == 2)
      1
    else
      fibonacci4Index(idx - 2) + fibonacci4Index(idx - 1)

  def fibonacci(idx: Int): Seq[Int] = idx match {
    case 0 => Seq(0)
    case 1 => Seq(0, 1)
    case 2 => Seq(0, 1, 1)
    case _ => fibonacci(idx - 1) :+
      (fibonacci(idx - 2).last + fibonacci(idx - 1).last)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text
      .toUpperCase
      .split("")
      .map(smb => if (MORSE.contains(smb))
        MORSE(smb)
      else smb)
      .mkString(" ")


  def wordReverse(text: String): String =
    text
      .split("(?=[!. ,])|(?<=[!. ,])")
      .map( word => if ( word.slice(0,1) == word.slice(0,1).toUpperCase)
        word.toLowerCase.reverse.capitalize
      else word.reverse)
      .mkString("")

}
