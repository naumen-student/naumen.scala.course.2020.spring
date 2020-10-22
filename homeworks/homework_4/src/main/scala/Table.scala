case class Table(w: Int, h:Int) {
  private val inner = scala.collection.mutable.HashMap[(Int, Int), Cell]()
  def getCell(ix: Int, iy: Int): Option[Cell] =
    if (0 <= ix && ix < w && 0 <= iy && iy < h)
      inner.get((ix, iy)).orElse(Some(EmptyCell))
    else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = inner.put((ix, iy), cell)
}