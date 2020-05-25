
trait Cell {
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(num: Int) extends Cell {
  override def toString: String = num.toString
}

class StringCell(str: String) extends Cell {
  override def toString: String = str
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
  override def toString: String = {
    val my_cell = table.getCell(ix, iy)
    my_cell match {
      case None => "outOfRange"
      case Some(cell: Cell) => cell.toString
      case Some(reference: ReferenceCell) =>
        if (table.getCell(reference.ix, reference.iy).contains(this: ReferenceCell)) "cyclic"
        else reference.toString

    }
  }
}
