trait Cell {}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(text: String) extends Cell {
  override def toString: String = text
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
  override def toString: String =
    {
      if (ix < 0 || ix >= table.row || iy < 0 || iy >= table.col) return "outOfRange"
      var next_cell = table.table(ix)(iy)
      var visited: Set[(Int, Int)] = Set()

      while (next_cell.isInstanceOf[ReferenceCell]) {
        val next_ref = next_cell.asInstanceOf[ReferenceCell]
        val coordinates = (next_ref.ix, next_ref.iy)
        if (visited(coordinates)) return "cyclic"
        visited += coordinates
        next_cell = table.table(next_ref.ix)(next_ref.iy)
      }
      next_cell.toString
    }
}