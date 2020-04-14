class Table(width: Int, height: Int) {
  private val cells = Array.fill[Cell](width * height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (indexExist(ix, iy)) {
      Some(cells(ix + iy * width))
    } else {
      None
    }
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    cells(ix + iy * width) = cell
  }

  private def indexExist(ix: Int, iy: Int): Boolean = ix < width && ix >= 0 && iy < height && iy >= 0
}