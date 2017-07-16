package edu.knoldus.part2

import org.scalatest.FunSuite

/**
  * Created by Neelaksh on 16/7/17.
  */
class PersonTest extends FunSuite {
  val p1 = new Person("Neelaksh",21)
  val p2 = new Person("Po",21)
  val p3 = new Person("Po",101)
  val p4 = new Person("Hu",104)
  test("check if ordering is fine"){
    assert(p1>p2)
    assert(p2<p3)
    assert(p3<=p4)
  }
}
