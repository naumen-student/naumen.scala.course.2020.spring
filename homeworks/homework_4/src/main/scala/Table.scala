import scala.collection.mutable

class Table(width: Int, height: Int) {
  private val cells = mutable.Map[Int, Cell]().withDefault(_ => new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = if (checkForBorders(ix, iy)) Option(cells(ix + iy * width)) else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells(ix + iy * width) = cell

  private def checkForBorders(x: Int, y: Int): Boolean = x >= 0 && x < width && y >= 0 && y < height
}