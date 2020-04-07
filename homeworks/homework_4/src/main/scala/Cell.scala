import scala.annotation.tailrec
import scala.collection.mutable

sealed trait Cell extends Product with Serializable {
  override def toString: String = this match {
    case EmptyCell()                  => "empty"
    case NumberCell(number)             => number.toString
    case StringCell(text)           => text
    case r @ ReferenceCell(_, _, _) => r.toString
  }

}

case class /*object*/ EmptyCell() extends Cell

final case class NumberCell(number: Int)  extends Cell

final case class StringCell(text: String) extends Cell

final case class ReferenceCell(x: Int, y: Int, table: Table) extends Cell {
  override def toString: String = {
    val set = mutable.Set.empty[ReferenceCell]
    @tailrec
    def doesHaveCycle(visited: mutable.Set[ReferenceCell], c: Cell) : Boolean = c match {
      case r @ ReferenceCell(x, y, table) =>
        if (visited.contains(r)) {
          false
        } else {
          table getCell(x, y) match {
            case Some(cell) => doesHaveCycle(visited + r, cell)
            case None       => false
          }
        }
      case _ => false
    }
    if (doesHaveCycle(set,this)) "cyclic" else table.getCell(x, y) match {
      case Some(value) => value.toString
      case None =>"outOfRange"
    }
  }
}
