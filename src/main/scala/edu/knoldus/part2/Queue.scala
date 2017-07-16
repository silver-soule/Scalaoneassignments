package edu.knoldus.part2

/**
  * Created by Neelaksh on 16/7/17.
  */

trait Queue {
  var l:List[Int]

  def enqueue(num:Int) : Unit

  def deque() : Int = {
    val retVal = l.head
    l=l.tail
    retVal
  }

}

class DoubleQueue extends Queue {
  override var l: List[Int] = List[Int]()
  def enqueue(num:Int) : Unit = {
    l = l:::List(2*num)
  }
}
class SquareQueue extends Queue {
  override var l: List[Int] = List[Int]()
  def enqueue(num:Int) : Unit = {
    l = l:::List(num*num)
  }
}