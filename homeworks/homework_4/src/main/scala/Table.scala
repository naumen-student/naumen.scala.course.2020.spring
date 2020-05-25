case class Table(rows: Int, columns: Int) {
  private val cells = Array.fill[Cell](rows, columns) {EmptyCell()}
  private def isOutOfRange(row: Int, column: Int): Boolean = row < 0 || column < 0 || row >= rows || column >= columns
  def getCell(row: Int, column: Int): Option[Cell] = {
    if (isOutOfRange(row, column)) None else Some(cells(row)(column))
  }
  def setCell(row: Int, column: Int, cell: Cell): Unit = {
    if (!isOutOfRange(row, column))
      cells(row)(column) = cell
  }
}