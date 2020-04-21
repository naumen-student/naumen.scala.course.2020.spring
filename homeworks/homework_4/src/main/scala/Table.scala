import scala.collection.mutable

class Table(x: Int, y:Int) {
  private val inner =  mutable.Map[Int, Cell]().withDefault(_ => new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    val index = ix + iy * x
    if (isInBorders(ix, iy))
      Option(inner(index))
    else None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    val index = ix + iy * x
    inner(index) = cell
  }

  private def isInBorders(ix:Int, iy:Int) : Boolean = {
    ix >= 0 && ix < x && iy >= 0 && iy < y
  }
}