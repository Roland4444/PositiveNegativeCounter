package hu.roland

class PositiveNegativeCounter {

  def positiveNegativeCount(lst:List[Int]): Int =
    tranformLst(lst.filter(_ != 0), Nil).count(_ < 0)

  def tranformLst(input:List[Int], result: List[Int]): List[Int]=
    input match {
      case Nil => result
      case List(_) => result
      case _ => {
        val hd::tail = input
        val hd2::_ = tail
        tranformLst(tail, result:+ (hd*hd2))
      }
  }

  def lstFromString(input: String): List[Int]=
    input.split(' ').toList.map(_.toInt)    
}
