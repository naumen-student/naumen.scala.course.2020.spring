import scala.collection.mutable

class Table(var width: Int, var height: Int) {
    private val table = mutable.HashMap[(Int, Int), Cell]()

    def getCell(x: Int, y: Int): Option[Cell] = {
      if(inRange(x, y))
        table get((x, y)) orElse Some(new EmptyCell)
      else
        Option.empty[Cell]
    }

    def setCell(x: Int, y: Int, cell: Cell): Unit = {
        table((x, y)) = cell
    }

    def inRange(x: Int, y: Int): Boolean =
        x >= 0 && y >= 0 && x <= width && y <= height
}