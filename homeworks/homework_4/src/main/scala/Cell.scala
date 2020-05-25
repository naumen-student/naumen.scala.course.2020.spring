import scala.collection.mutable

trait Cell

class EmptyCell extends Cell {
  override def toString = "empty"
}

class NumberCell(val value: Int) extends Cell {
  override def toString: String = value.toString
}

class StringCell(val value: String) extends Cell {
  override def toString: String = value
}

class ReferenceCell(val x: Int, val y: Int, val table: Table) extends Cell {
  def getValue: Option[Cell] = table.getCell(x, y)

  override def toString : String = table.getCell(x, y) match {
    case None => "outOfRange"
    case Some(cell) => cell match {
      case c: ReferenceCell => if (isCyclic(c, mutable.HashSet(this))) "cyclic" else c.toString
      case _ => cell.toString
    }
  }

  @scala.annotation.tailrec
  private def isCyclic(cell: ReferenceCell, visited: mutable.HashSet[ReferenceCell]) : Boolean = {
    if (visited.contains(cell))
      return true

    visited.add(cell)
    cell.getValue match {
      case None => false
      case Some(cell) => cell match {
        case c: ReferenceCell => isCyclic(c, visited)
        case _ => false
      }
    }
  }
}