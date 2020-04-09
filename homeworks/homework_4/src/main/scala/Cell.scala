import scala.annotation.tailrec

sealed trait Cell extends Product with Serializable {
  override def toString: String = this match {
    case EmptyCell()        => "empty"
    case NumberCell(number) => number.toString
    case StringCell(text)   => text
    case r: ReferenceCell   => r.toString
  }

}

case class /*object*/ EmptyCell() extends Cell

final case class NumberCell(number: Int) extends Cell

final case class StringCell(text: String) extends Cell

final case class ReferenceCell(x: Int, y: Int, table: Table) extends Cell {
  @tailrec
  private def cellToString(cell: Cell, visited: Set[ReferenceCell]): String =
    cell match {
      case ref @ ReferenceCell(x, y, table) =>
        if (visited.contains(ref)) "cyclic"
        else
          table.getCell(x, y) match {
            case Some(value) => cellToString(value, visited + ref)
            case None        => "outOfRange"
          }
      case cell => cell.toString
    }

  override def toString: String = table.getCell(x, y).fold("outOfRange")(cellToString(_, Set(this)))
}
