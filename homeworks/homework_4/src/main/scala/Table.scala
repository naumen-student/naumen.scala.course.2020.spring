import scala.collection.mutable

class Table(width: Int, height: Int) {
  private val values = mutable.HashMap[(Int, Int), Cell]()

  def getCell(x: Int, y: Int): Option[Cell] = {
    if(x >= 0 && y >= 0 && x <= width && y <= height)
      values.get(x, y).orElse(Some(new EmptyCell))
    else
      None
  }

  def setCell(x: Int, y: Int, cell: Cell): Unit = {
    values((x, y)) = cell
  }
}