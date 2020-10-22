trait Cell {}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(text: String) extends Cell {
  override def toString: String = text.toString
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  override def toString: String = {
    val nextCell = table.getCell(ix, iy)
    nextCell match {
      case None => "outOfRange"
      case Some(refCell: ReferenceCell) => {
        val refCells = Seq(this)
        var current = refCell
        while (true) {
          val next = current.table.getCell(current.ix, current.iy)
          next match {
            case Some(nextRef: ReferenceCell) =>
              if (refCells.contains(nextRef)) return "cyclic"
              current = nextRef
              refCells :+ nextRef
            case None => "outOfRange"
            case _ => return next.get.toString
          }
        }
        ""
      }
      case _ => nextCell.get.toString
    }
  }
}