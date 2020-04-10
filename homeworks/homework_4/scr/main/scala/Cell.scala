import scala.annotation.tailrec

sealed trait Cell

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

case class StringCell(text: String) extends Cell {
  override def toString: String = text
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  def getCell: Option[Cell] = table.getCell(ix, iy)

  override def toString: String = convertToString(getCell)

  @tailrec
  private def convertToString(cell: Option[Cell], visited: Set[ReferenceCell] = Set(this)): String = cell match {
    case None => "outOfRange"
    case Some(cell) => cell match {
      case r: ReferenceCell => if (visited.contains(r)) "cyclic" else convertToString(r.getCell, visited + r)
      case other => other.toString
    }
  }
}