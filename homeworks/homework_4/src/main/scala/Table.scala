import scala.collection.mutable

class Table(width: Int, height: Int) {
  val cells = mutable.Map[(Int, Int), Cell]()
    0 until width foreach { width =>
    0 until height foreach {
      height => cells((width, height)) = EmptyCell()
    }
  }

  def getCell(ix: Int, iy: Int): Option[Cell] = cells.get((ix, iy))

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells((ix, iy)) = cell
}