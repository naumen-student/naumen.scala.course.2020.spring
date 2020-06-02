trait Cell {
  def toString(): String
}

class EmptyCell extends Cell {
  override def toString(): String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(string: String) extends  Cell {
  override def toString: String = string
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  override def toString: String = table.getCell(ix, iy) match {
    case None => "outOfRange"
    case Some(cell: ReferenceCell) => cell.refCyc()
    case Some(cell) => cell.toString
  }
  def refCyc(cells: Seq[Cell] = Seq()): String = table.getCell(ix, iy) match {
    case None => "outOfRange"
    case Some(cell: ReferenceCell) => if (cells.contains(cell))
      "cyclic"
    else
      cell.refCyc(cells :+ cell)
    case Some(cell) => cell.toString
  }
}