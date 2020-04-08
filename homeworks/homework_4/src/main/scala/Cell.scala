import scala.annotation.tailrec

sealed trait Cell

case class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

case class StringCell(string: String) extends Cell {
  override def toString: String = string
}

case class ReferenceCell(row: Int, column: Int, table: Table) extends Cell {
  private def getReferencedCell: Option[Cell] = table.getCell(row, column)

  @tailrec
  private def getCellString(cell: Option[Cell], visited_cells: Set[ReferenceCell] = Set(this)): String = cell match {
    case Some(ref_cell@ReferenceCell(_, _, _)) => if (visited_cells.contains(ref_cell)) "cyclic" else getCellString(ref_cell.getReferencedCell, visited_cells + ref_cell)
    case Some(cell@_) => cell.toString
    case None => "Out of range"
  }

  override def toString: String = getCellString(getReferencedCell)

}




