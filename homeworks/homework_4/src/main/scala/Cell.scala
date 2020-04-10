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

case class ReferenceCell(x: Int, y: Int, table: Table) extends Cell {
  override def toString: String = {
    table.getCell(x, y) match {
      case Some(refCell@ReferenceCell(rx, ry, rtable)) =>
        rtable.getCell(rx, ry) match {
          case Some(cell: Cell) => checkCyclicReference(cell, Set(refCell))
          case None => "outOfRange"
        }
      case Some(cell: Cell) => cell.toString
      case None => "outOfRange"
    }
  }

  @tailrec
  private def checkCyclicReference(currentCell: Cell, matchedCells: Set[ReferenceCell]): String = {
    currentCell match {
      case (refCell@ReferenceCell(rx, ry, rtab)) =>
      if (matchedCells.contains(refCell)) "cyclic"

      else rtab.getCell(rx, ry) match {
        case Some(cell) => checkCyclicReference(cell, matchedCells + refCell)
        case None => "outOfRange"
      }
      case (cell: Cell) => cell.toString
    }
  }
}
