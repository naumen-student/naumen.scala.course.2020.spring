class Table(val row: Int, val col: Int) {
  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= row || iy < 0 || iy >= col) return None
    Some(table(ix)(iy))
  }
  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (ix < 0 || ix >= row || iy < 0 || iy >= col) return ???
    table(ix)(iy) = cell
  }
  var table: Array[Array[Cell]] = Array.fill(row, col)((new EmptyCell).asInstanceOf[Cell])
}