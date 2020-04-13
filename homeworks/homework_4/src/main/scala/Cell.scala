import scala.annotation.tailrec

trait Cell {
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

class StringCell(value: String) extends Cell {
  override def toString: String = value
}

case class ReferenceCell(x: Int, y: Int, table: Table) extends Cell {
  def getCell: Option[Cell] = table.getCell(x, y)
  override def toString: String = getString(getCell)

  @tailrec
  private def getString(currentCell: Option[Cell], visited: Set[ReferenceCell] = Set(this)): String = {
    currentCell match {
      case None => "outOfRange"
      case Some(cell) => cell match {
        case referenceCell: ReferenceCell => {
          if (visited.contains(referenceCell))
            "cyclic"
          else
            getString(referenceCell.getCell, visited + referenceCell)
        }
        case cell => cell.toString
      }
    }
  }

}