import scala.collection.mutable

class Table(width: Int, height: Int){

  private val table: mutable.MutableList[Cell]  = mutable.MutableList.fill( width * height)(EmptyCell())

  def getCell(x: Int, y: Int): Option[Cell] = {
    if(x >= 0 && y >= 0 && x < width && y< height) {
      table get(getIndex(x, y))
    } else {
      Option.empty[Cell]
    }
  }

  def setCell(x: Int, y: Int, cell: Cell): Unit = {
    table(getIndex(x, y)) = cell
  }

  private def getIndex(x: Int, y: Int): Int = {
    x + y * width
  }
}