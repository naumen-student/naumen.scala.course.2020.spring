case class ReferenceCell(ix:Int,iy:Int,table:Table) extends Cell {
  override def toString: String = {
    table.getCell(ix, iy) match {
      case None => "outOfRnage"
      case Some(ref: ReferenceCell) => if(ref.table.getCell(ref.ix, ref.iy).get == this) "cyclic" else ref.toString
      case other => table.getCell(ix, iy).get.toString
    }
  }
}