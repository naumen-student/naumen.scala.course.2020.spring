class Table(val width: Int, val length: Int) {
  var _table: Array[Array[Cell]] = Array.ofDim[Cell](width, length)
    .map(x => x.map(_ => (new EmptyCell).asInstanceOf[Cell]).toArray)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= width || iy < 0 || iy >= length) return None
    Some(_table(ix)(iy))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (!(ix >= 0 && ix < width && iy >= 0 && iy < length))
      throw new IllegalArgumentException(s"Cell ${(ix, iy)} doesn't exist")
    _table(ix)(iy) = cell
  }
}