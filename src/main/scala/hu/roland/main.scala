package hu.roland

object main extends App{
  val s = PositiveNegativeCounter()
  val lst1:  List[Int] = List(-1, 0, 1)
  val lst2:  List[Int] = List(-2, -5, 10)
  val lst3:  List[Int] = List(11, 23, -5, 0)
  val lst4:  List[Int] = List(43, 0, 23, -2,-3, 4,-1)
  val listLst: List[List[Int]] = List(lst1, lst2, lst3, lst4)
  listLst.map(s.positiveNegativeCount).foreach(println)

  val lst11: List[Int] = s.lstFromString("-1 0 1")
  val lst21: List[Int] = s.lstFromString("-2 -5 10")
  val lst31: List[Int] = s.lstFromString("11 23 -5 0")
  val lst41: List[Int] = s.lstFromString("43 0 23 -2 -3 4 -1")
  val listLst2: List[List[Int]] = List(lst11, lst21, lst31, lst41)
  listLst2.map(s.positiveNegativeCount).foreach(println)
}
