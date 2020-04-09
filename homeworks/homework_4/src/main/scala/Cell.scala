import scala.annotation.tailrec

sealed trait Cell
case object EmptyCell extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString

}
case class StringCell(value: String) extends Cell {
  override def toString: String = value
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {

  @tailrec
  private def toStringOrCyclic(cell: Cell, visited: Set[ReferenceCell]): String = cell match {
    case referenceCell @ ReferenceCell(x, y, table) =>
      if (visited.contains(referenceCell)) "cyclic"
      else table.getCell(x, y) match {
        case None => "outOfRange"
        case Some(v) => toStringOrCyclic(v, visited + referenceCell)
      }
    case other => other.toString
  }

  override def toString: String = table.getCell(ix, iy).fold("outOfRange")(toStringOrCyclic(_, Set(this)))
}