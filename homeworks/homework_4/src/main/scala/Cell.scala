import scala.annotation.tailrec

sealed trait Cell

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(string: String) extends Cell {
  override def toString: String = string
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  def getValue: Option[Cell] = table.getCell(ix, iy)

  override def toString: String = convertValueToString(getValue)

  @tailrec
  private def convertValueToString(value: Option[Cell], visited: Set[Cell] = Set(this)): String = value match {
    case None => "outOfRange"
    case Some(cell) => cell match {
      case r: ReferenceCell if visited contains r => "cyclic"
      case r: ReferenceCell => r.convertValueToString(r.getValue, visited + r)
      case _ => cell.toString
    }
  }
}