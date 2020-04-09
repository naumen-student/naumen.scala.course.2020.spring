

case class Table(height: Int, width: Int) {
  val table = Array.fill[Cell](height * width)(EmptyCell())

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (isOutOfRange(ix, iy)) None
    else Some(table(ix + iy * width))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (!isOutOfRange(ix, iy)) table(ix + iy * width) = cell;
  }

  def isOutOfRange(ix: Int, iy: Int): Boolean = ix < 0 || ix >= height || iy < 0 || iy >= width

}