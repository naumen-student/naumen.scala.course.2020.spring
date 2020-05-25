class Cell() {
}

class EmptyCell extends Cell {
  override def toString: String = {
    "empty"
  }
}

class NumberCell(n: Int) extends Cell {
  override def toString: String = {
    n.toString
  }
}

class StringCell(s: String) extends Cell {
  override def toString: String = {
    s
  }
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = toStringInternal(getCell, Set(this))

  @scala.annotation.tailrec
  private def toStringInternal(cell: Option[Cell], visited: Set[Cell]): String = {
    cell match {
      case None => "outOfRange"
      case Some(cell) => cell match {
        case refCell: ReferenceCell => if (visited.contains(refCell)) "cyclic" else
          toStringInternal(refCell.getCell, visited + refCell)
        case _ => cell.toString
      }
    }
  }

  private def getCell: Option[Cell] = table.getCell(ix, iy)
}