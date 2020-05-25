trait Cell {
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(val number : Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(val string: String) extends Cell {
  override def toString: String = string
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
  override def toString: String = {
    val cell = table.getCell(ix, iy)
    if (cell.isEmpty) "outOfRange"
    else cell.get match {
      case refCell: ReferenceCell =>
        if (table.getCell(refCell.ix, refCell.iy).contains(this)) "cyclic"
        else refCell.toString
      case cell => cell.toString
    }
  }
}