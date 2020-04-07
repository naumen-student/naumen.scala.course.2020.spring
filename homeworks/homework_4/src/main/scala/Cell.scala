trait Cell

case class EmptyCell() extends Cell {
    override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
    override def toString: String = number.toString
}

case class StringCell(string: String) extends Cell {
    override def toString: String = string
}

case class ReferenceCell(row: Int, column: Int, table: Table) extends Cell {
    override def toString: String = {
        val cell = table.getCell(row, column)
        cell match {
            case Some(ref@ReferenceCell(r, c, t)) => if (t.getCell(r, c).contains(this)) "cyclic" else ref.toString
            case Some(c@_) => c.toString
            case None => "outOfRange"
        }
    }
}