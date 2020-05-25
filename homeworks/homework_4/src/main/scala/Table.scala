class Table (val width : Int, val height: Int) {
  private val table = Array.fill[Cell](width, height) { new EmptyCell }

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < width && ix >= 0 && iy < height && iy >= 0)
      Some(table(ix)(iy))
    else
      None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (ix < width && ix >= 0 && iy < height && iy >= 0)
      table(ix)(iy) = cell
  }
}