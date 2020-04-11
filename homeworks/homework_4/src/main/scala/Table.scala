import scala.collection.mutable


class Table(width: Int, height: Int){
  private val storageMap = new mutable.HashMap[Int, Cell]

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix > width || iy < 0 || iy > height)
      None
    else
    storageMap get (ix + iy*width) match {
      case None => Option(new EmptyCell)
      case x => x
    }
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    storageMap(ix + iy*width) = cell
  }
}