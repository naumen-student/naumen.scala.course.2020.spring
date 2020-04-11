import scala.annotation.tailrec

trait Cell {
  protected def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(val arg: Int) extends Cell {
  override def toString: String = arg.toString
}

class StringCell(val arg: String) extends Cell {
  override def toString: String = arg
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  @tailrec
  private def recStr(cell: Option[Cell], visited: Seq[ReferenceCell]): String = cell match {
    case None => "outOfRange"
    case Some(x) => x match {
      case currentCell: ReferenceCell =>
        if (visited.contains(x)) "cyclic"
        else recStr(table.getCell(currentCell.ix, currentCell.iy), visited :+ currentCell)
      case _ => x.toString
    }
  }

  override def toString: String = recStr(table.getCell(ix, iy), Seq(this))
}