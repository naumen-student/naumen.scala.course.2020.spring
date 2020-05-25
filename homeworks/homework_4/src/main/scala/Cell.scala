sealed abstract class Cell

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

case class StringCell(string: String) extends Cell {
  override def toString: String = string
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = getCellString()

  private def getCellString(prevReference: ReferenceCell = null): String = {
    val cell = table.getCell(ix, iy)
    if (cell.isEmpty) "outOfRange"
    else cell.get match {
      case cell: ReferenceCell =>
        if (prevReference != cell) cell.getCellString(this)
        else "cyclic"
      case _ => cell.get.toString
    }
  }
}

