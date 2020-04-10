import scala.collection.immutable.HashSet

trait Cell {

}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class StringCell(val string: String) extends Cell {
  override def toString: String = string
}

class NumberCell(val number: Int) extends Cell {
  override def toString: String = number.toString
}

class ReferenceCell(val x: Int, val y: Int, val table: Table) extends Cell {
  override def toString: String = {
    var cells = HashSet[ReferenceCell](this)
    var current = this
    while (true) {
      val next = current.table.getCell(current.x, current.y).get;
      next match {
        case refCell: ReferenceCell =>
          if (cells.contains(refCell))
            return "cyclic"
          cells = cells + refCell
          current = refCell
        case _ =>
          return next.toString
      }
    }
    ""
  }
}
