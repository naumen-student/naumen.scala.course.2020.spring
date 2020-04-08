import scala.annotation.tailrec
import scala.collection.immutable.HashSet

sealed trait Cell {}

class EmptyCell extends Cell {
    override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
    override def toString: String = number.toString
}

class StringCell(text: String) extends Cell {
    override def toString: String = text
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
    private def getReference: Option[Cell] = table.getCell(ix, iy)

    @tailrec
    private def getCellStr(maybeCell: Option[Cell], visited: HashSet[ReferenceCell]): String = maybeCell match {
        case None => "outOfRange"
        case Some(cell) => cell match {
            case r: ReferenceCell => if (visited.contains(r)) "cyclic" else getCellStr(r.getReference, visited + r)
            case _ => cell.toString
        }
    }

    override def toString: String = getCellStr(getReference, HashSet(this))
}