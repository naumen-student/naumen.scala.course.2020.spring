trait Cell

class EmptyCell() extends Cell {
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(string: String) extends Cell {
  override def toString: String = string
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  override def toString: String = {
    val cell = table.getCell(ix, iy)
    cell match {
      case None => "outOfRange"
      case Some(refCell: ReferenceCell) =>
        if (refCell.table.getCell(refCell.ix, refCell.iy) contains this) "cyclic" else refCell.toString
      case _ => cell.get.toString
    }
  }
}
