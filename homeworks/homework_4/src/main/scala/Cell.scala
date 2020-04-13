trait Cell{
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(num: Int) extends Cell{
  override def toString: String = num.toString
}

class StringCell(str: String) extends Cell{
  override def toString: String = str
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
  override def toString: String = {
    val cell = table.getCell(ix, iy)
    cell match {
      case None => "outOfRange"
      case Some(reference: ReferenceCell) =>
        if (table.getCell(reference.ix, reference.iy)== Some(this: ReferenceCell)) "cyclic"
        else reference.toString
      case Some(cell:Cell) => cell.toString
    }
  }
}
