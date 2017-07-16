package edu.knoldus.part2

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 17/7/17.
  */
class QueueTest extends FunSuite {

  val dq = new DoubleQueue()
  val sq = new SquareQueue()
  dq.enqueue(1)
  dq.enqueue(2)
  dq.enqueue(3)
  sq.enqueue(2)
  sq.enqueue(3)
  sq.enqueue(4)
  test("check double queue") {
    assert(dq.deque() == 2)
    assert(dq.deque() == 4)
  }

  test("check square queue") {
    assert(sq.deque()==4)
    assert(sq.deque()==9)
  }

}
