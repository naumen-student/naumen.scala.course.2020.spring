import scala.collection.mutable.ListBuffer

class Table (x: Int, y: Int) {
  def getCell(ix: Int, iy: Int): Option[Cell] =
    if ((0 to x contains ix) && (0 to y contains iy))
      Some(buf(ix + x * iy))
    else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    buf(ix + x * iy) = cell
  }
  val buf = new ListBuffer[Cell]()
  for (_ <- 0 to x + x * y)
    buf += new EmptyCell

}