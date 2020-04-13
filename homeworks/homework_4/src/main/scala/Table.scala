case class Table(val width:Int, val length:Int){

  var r= Map[(Int, Int), Cell]()

  for (i <- 0 until width) {
    for (j <- 0 until length){
      r+=((i,j) -> new EmptyCell)
    }
  }

  def getCell(ix:Int,iy:Int):Option[Cell] ={
    if(inTable(ix,iy)){
      Some(r((ix,iy)))
    }
    else None
  }

  def setCell(ix:Int,iy:Int,cell:Cell): Unit = {
    if(inTable(ix,iy)){
      r += ((ix,iy) -> cell)
    }
    else None
  }

  def inTable(ix:Int,iy:Int):Boolean={
    if(ix>width || ix<0 || iy>length || iy<0){
      false
    }
    else true
  }
}