class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
    override def toString: String = {
        val refCell = table.getCell(ix, iy)
        refCell match {
            case None => "outOfRange"
            case Some(cell: ReferenceCell) =>
                if (cell.getRefCell() == this)
                    "cyclic"
                else
                    cell.getRefCell().toString
            case Some(cell: Cell) => cell.toString
        }
    }
    def getRefCell(): Cell = table.getCell(ix, iy).get
}
