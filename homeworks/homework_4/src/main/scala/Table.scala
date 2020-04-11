import scala.collection.mutable

class Table(val width: Int, val height: Int) {
  private val cells: mutable.Map[(Int, Int), Cell] = new mutable.HashMap[(Int, Int), Cell]

  def getCell(ix: Int, iy: Int) : Option[Cell] = {
    if (isOutOfRange(ix, iy))
      return None

    cells.get((ix, iy)) match {
      case None => Some(new EmptyCell)
      case c => c
    }
  }

  def setCell(ix: Int, iy: Int, cell: Cell) : Unit = cells += ((ix, iy) -> cell)

  private def isOutOfRange(x: Int, y: Int) : Boolean = x < 0 || x >= width || y < 0 || y >= height
}