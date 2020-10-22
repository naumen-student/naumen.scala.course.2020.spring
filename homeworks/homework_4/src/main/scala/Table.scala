class Table(width: Int, height: Int) {
    private val cells = create_table(width, height)

    private def get_index(ix: Int, iy: Int): Int = iy + ix * width

    private def create_table(width: Int, height:Int) = {
        val arr = new Array[Cell](width*height)
        (0 until width*height).foreach(i => arr.update(i, new EmptyCell()))
        arr
    }

    def getCell(ix: Int, iy: Int): Option[Cell] =
        if (get_index(ix, iy) >= 0 && get_index(ix, iy) < width*height)
            Some(cells(get_index(ix, iy)))
        else
            None

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = cells.update(get_index(ix, iy), cell)
}