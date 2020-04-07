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
  override def toString: String = table.cells.get((ix, iy)) match {
    case Some(cell:ReferenceCell) if table.cells((cell.ix, cell.iy)) == this => "cyclic"
    case Some(cell) => cell.toString
    case _ => "outOfRange"
  }
}