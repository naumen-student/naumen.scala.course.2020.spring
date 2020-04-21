trait Cell

case class EmptyCell() extends Cell {
    override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell
{
    override def toString: String = number.toString
}

case class StringCell(text: String) extends Cell
{
    override def toString: String = text
}

case class ReferenceCell(x: Int, y: Int, table: Table) extends Cell {
  override def toString: String = {
    table.getCell(x, y) match {
      case Some(ref: ReferenceCell) => 
        if (ref.table.getCell(ref.x, ref.y).get == this) "cyclic" else ref.toString
      case other => table.getCell(x, y).get.toString
    }
  }
} 

