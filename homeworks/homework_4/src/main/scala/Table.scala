import scala.collection.mutable

class Table(width: Int, height: Int) {
  private val table = new mutable.MutableList[Cell]
  for (_ <- 0 until width * height)
    table += new EmptyCell

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    val i = ix + iy * width
    if (i >= 0 && i < table.length)
      Option(table(i))
    else
      None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    val i = ix + iy * width
    if (i >= 0 && i < table.length)
      table(i) = cell
  }
}