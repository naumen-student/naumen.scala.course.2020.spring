import scala.collection.mutable

case class Table(rows: Int, columns: Int) {
    val storage = Array.fill[Cell](rows,columns){EmptyCell()}

    def getCell(row:Int, column:Int):Option[Cell] = {
        if (isCellInTable(row,column))
            Some(storage(row)(column))
        else None
    }

    def setCell(row:Int, column:Int, cell: Cell):Unit = {
        if(isCellInTable(row,column))
            storage(row)(column) = cell
    }

    def isCellInTable(row:Int, column:Int):Boolean = rows > row && row >= 0 && columns > column && column >= 0
}