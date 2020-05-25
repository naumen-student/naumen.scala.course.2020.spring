class Table(width: Int, height: Int) {
  private val table = Array.fill[Cell](width, height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (!isInTable(ix, iy)) return None
    Some(table(ix)(iy))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (!isInTable(ix, iy)) return
    table(ix)(iy) = cell
  }

  private def isInTable(ix: Int, iy: Int): Boolean = {
    if (ix < 0 || iy < 0) return false
    if (ix >= width || iy >= height) return false
    true
  }
}