import scala.collection.mutable

final class Table(width: Int, height: Int) {
  type Coordinates = (Int, Int)

  private val table: mutable.Map[(Int, Int), Cell] =
    mutable.HashMap.empty[Coordinates, Cell]

  def getCell(x: Int, y: Int): Option[Cell] =
    if (x >= 0 && y >= 0 && x < width && y < height)
      table get(x, y) orElse Some(EmptyCell())
    else Option.empty[Cell]

  def setCell(x: Int, y: Int, cell: Cell): /*F[Unit] */ Unit =
    table((x, y)) = cell

}
