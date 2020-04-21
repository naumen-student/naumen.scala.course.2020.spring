trait Cell

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(value: String) extends Cell{
  override def toString: String = value
}

class ReferenceCell(ix:Int, iy:Int, table: Table) extends Cell {
  private def getCell  = table.getCell(ix, iy)
  private val visited : Set[Cell] = Set(this)
  private def getValue(cell: Option[Cell], visited: Set[Cell]): String = cell match {
    case None => "outOfRange"
    case Some(cell) => cell match {
      case c: ReferenceCell if visited.contains(c) => "cyclic"
      case c: ReferenceCell => c.getValue(c.getCell, visited + c)
      case _ => cell.toString
    }
  }

  override def toString: String = getValue(getCell, visited)
}
