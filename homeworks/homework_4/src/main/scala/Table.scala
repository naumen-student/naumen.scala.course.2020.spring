class Table(val width: Int, val length: Int) {

  def InitTable(): Array[Array[Cell]] = {
    var table = Array.ofDim[Cell](width, length);
    table.map(x => x.map(y => (new EmptyCell).asInstanceOf[Cell]))
  }

  var table: Array[Array[Cell]] = InitTable()


  def setCell(x: Int, y: Int, cell: Cell) = {
    table(x)(y) = cell
  }

  def getCell(x: Int, y: Int): Option[Cell] = {
    if (x < 0 || x >= width || y < 0 || y >= length)
      return None

    Some(table(x)(y));
  }
}