import scala.collection.mutable

class Table(width: Int, height: Int) {
    private val cells = new mutable.HashMap[(Int, Int), Cell]

    def getCell(ix: Int, iy: Int): Option[Cell] = {
        if (ix < 0 || ix >= width || iy < 0 || iy >= height)
            None
        else
            cells.get((ix, iy)) match {
                case None => Some(new EmptyCell)
                case cell => cell
            }
    }

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells += ((ix, iy) -> cell)
}