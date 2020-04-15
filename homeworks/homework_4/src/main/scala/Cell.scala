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
    case Some(cell: ReferenceCell) if (
     cell.table.getCell(cell.ix, cell.iy) match {
       case Some(rec: ReferenceCell) if ix == rec.ix && iy == rec.iy && table == rec.table => true
       case _ => false
     }) => "cyclic"
    case Some(cell) => cell.toString
  }
}