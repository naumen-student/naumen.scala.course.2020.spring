import scala.collection.mutable

class Table(width: Int, height: Int) {
  private val mapCells = mutable.HashMap[(Int, Int), Cell]()

  def getCell(ix: Int, iy: Int): Option[Cell] =
    if(ix >= 0 && iy >= 0 && ix <= width && iy <= height)
      mapCells.get(ix, iy).orElse(Some(EmptyCell())) else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    mapCells((ix, iy)) = cell
  }
}